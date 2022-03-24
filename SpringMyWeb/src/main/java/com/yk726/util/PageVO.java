package com.yk726.util;

import lombok.Data;

@Data
public class PageVO {
	//페이지네이션을 그리는 역활
	
	private int startPage; //페이지네이션 첫번호
	private int endPage; //페이지네이션 끝번호
	private boolean prev; //이전버튼
	private boolean next; //다음버튼
	
	private int pageNum; //조회하는 페이지번호
	private int amount; //조회하는 데이터개수
	private int total; //전체게시글수
	
	private Criteria cri; //페이지기준
	
	public PageVO(Criteria cri, int total) {
		this.pageNum = cri.getPageNum();
		this.amount = cri.getAmount();
		this.total = total;
		this.cri = cri;
		
		//페이지계산
		//끝페이지계산
		//pageNum이 11이라면, 페이지네이션 끝번호는 20
		//(int).Math.ceil(조회하는페이지번호 / 페이지네이션 수 ) * 페이지네이션 수
		
		this.endPage = (int)Math.ceil(this.pageNum / 10.0) * 10;
		
		//첫페이지 계산
		//시작페이지 = 페이지네이션 끝번호 - 페이지네이션 수 + 1
		this.startPage = this.endPage -10 + 1;
		
		//실제끝번호
		//ex)총 게시글 수 54개 -> 마지막페이지네이션 6
		//(int)Math.ceil( 총 게시글 수 / 화면에 뿌려지는 amount값)
		int realEnd = (int)Math.ceil(this.total / (double)this.amount);
		
		//실제끝페이지의 결정
		//endPage = 10, 20....
		//endPage를 따라가면 20, realEnd 12
		if(this.endPage > realEnd) {
			this.endPage = realEnd;
		}
		
		//이전버튼 활성화
		//startPage가 1, 11, 21, 31 ...
		this.prev = this.startPage > 1;
		
		//다음버튼 활성화 
		//실제끝번호가 12이고, endPage가 10일때 true
		this.next = realEnd > this.endPage;
	}
}

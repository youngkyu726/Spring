package com.yk726.freeboard.service;

import java.util.ArrayList;

import com.yk726.command.FreeBoardVO;

public interface FreeBoardMapper {

	public int regist(FreeBoardVO vo);//등록
	public ArrayList<FreeBoardVO> getList();//목록
	public FreeBoardVO getContent(int bno);//상세
	public boolean update(FreeBoardVO vo);//수정
	public int delete(int bno); //삭제
}

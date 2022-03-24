package com.yk726.freeboard.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yk726.command.FreeBoardVO;
import com.yk726.util.Criteria;

@Service("freeBoardService")
public class FreeBoardServiceImpl implements FreeBoardService {
	
	@Autowired
	FreeBoardMapper freeBoardMapper;
	
	@Override
	public int regist(FreeBoardVO vo) {
		
		return freeBoardMapper.regist(vo);
	}

	@Override
	public ArrayList<FreeBoardVO> getList(Criteria cri) {
		return freeBoardMapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		return freeBoardMapper.getTotal(cri);
	}

	@Override
	public FreeBoardVO getContent(int bno) {
		return freeBoardMapper.getContent(bno);
	}

	@Override
	public boolean update(FreeBoardVO vo) {
		return freeBoardMapper.update(vo);
	}

	@Override
	public int delete(int bno) {
		return freeBoardMapper.delete(bno);
	}


}

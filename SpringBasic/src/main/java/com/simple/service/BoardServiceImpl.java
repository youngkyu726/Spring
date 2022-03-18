package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
	
@Service("bbb")
public class BoardServiceImpl implements BoardService{
	
	
	@Autowired
	@Qualifier("ccc")
	BoardDAO boardDao;

	@Override
	public void boardRegist(BoardVO vo) {
		boardDao.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardDao.getList();
	}

	@Override
	public void boardDelete(int bno) {
		boardDao.boardDelete(bno);
	}

}

package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;
	
@Service("bbb")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardMapper.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public void boardDelete(int bno) {
		boardMapper.boardDelete(bno);;
	}
	
	
//	@Autowired
//	@Qualifier("ccc")
//	BoardDAO boardDao;
//
//	@Override
//	public void boardRegist(BoardVO vo) {
//		boardDao.boardRegist(vo);
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		return boardDao.getList();
//	}
//
//	@Override
//	public void boardDelete(int bno) {
//		boardDao.boardDelete(bno);
//	}

}

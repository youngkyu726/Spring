package com.simple.mapper;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreMapper {

	public void regist(ScoreVO vo);
	public ArrayList<ScoreVO>getList();//조회
	public void delete(int num);//삭제
}

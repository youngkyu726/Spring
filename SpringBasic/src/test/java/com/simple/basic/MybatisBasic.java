package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;
import com.simple.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")
public class MybatisBasic {

	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void test() {
//		String result = testMapper.getTime();
//		System.out.println(result);
//	}
	
//	@Test
//	public void test2() {
//		ArrayList<ScoreVO> list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
	
	//select방법
	
//	@Test
//	public void selectOne() {
//		
//		//단일값 - 
//		int result = testMapper.insertOne("오바야");
//		System.out.println("성공실패결과:" + result);
//		
//	}
	
	//insert방법 - 다중값(vo나 map)
//	@Test
//	public void insertTwo() {
//		ScoreVO vo = new ScoreVO(0, "강아지", 50, 30, 28);
//		int result = testMapper.insertTwo(vo);
//		
//		System.out.println("성공실패결과:" + result);
//	}
	
//	@Test
//	public void insertThree() {
//		
//		HashMap<String, String> map = new HashMap<>();
//		map.put("name", "강감찬");
//		map.put("kor", "40");
//		map.put("eng", "99");
//		map.put("math", "32");
//		
//		int result = testMapper.insertThree(map);
//		System.out.println("성공실패결과:" + result);
//		
//	}
	
//	@Test
//	public void insertFour() {
//		int result = testMapper.insertFour("고양이", 100);
//		System.out.println("성공실패결과:" + result);
//	}
	
	//select방법- 단일조회
//	@Test
//	public void selectOne() {
//		ScoreVO vo = testMapper.selectOne(8);
//		System.out.println(vo.toString());
//	}
	
	//select방법 - map을 통한 단일 조회
//	@Test
//	public void selectTwo() {
//		
//		HashMap<String, Object> map = testMapper.selectTwo(8);
//		System.out.println(map.toString());
//	}
//	
	//select방법 - map을 통한 다중조회
//	@Test
//	public void selectThree() {
//		ArrayList/*<HashMap<String, Object>>*/ list = testMapper.selectThree();
//		System.out.println(list.toString());
//	}

	//update실습 - vo를 통해 변경할 값을 전달하고, 1번 점수를 업데이트하고 성공실패 결과를 반환
//	@Test
//	public void updateOne() {
//		
//		ScoreVO vo = new ScoreVO(7, "호랑이", 100, 99, 89);
//		boolean result = testMapper.updateOne(vo);
//		
//		System.out.println("성공실패 결과:" + result);
//	}
//	
	//delete실습 - 키 값을 전달해서 삭제하고 성공실패 결과를 반환
//	@Test
//	public void deleteOne() {
//		
//		boolean result = testMapper.deleteOne(9);
//		System.out.println("성공실패결과:" + result);
//	}
}

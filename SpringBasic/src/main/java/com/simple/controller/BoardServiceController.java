package com.simple.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;

@Controller
@RequestMapping("/service")
public class BoardServiceController {

	@Resource(name="bbb")
	BoardService boardService;
	
	@RequestMapping("/boardRegister")
	public void boardRegist() {
	}
	
	@RequestMapping(value = "/boardForm", method = RequestMethod.POST)
	public String boardForm(BoardVO vo) {
		
		boardService.boardRegist(vo);
		
		return "redirect:/service/boardResult";
	}
	
	
	@RequestMapping("/boardList")
	public String list(Model model) {
		ArrayList<BoardVO> blist = boardService.getList();
		
		model.addAttribute("blist", blist);
		
		return "service/boardList";
		
	}
	
	@RequestMapping("/boardResult")
	public String result() {
		return "service/boardResult";
	}
	
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("bno") int bno) {
		
		boardService.boardDelete(bno);
		return "redirect:/service/boardList";
	}
}

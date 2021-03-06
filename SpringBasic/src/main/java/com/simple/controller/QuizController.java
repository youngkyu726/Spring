package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;
import com.simple.command.ReqVO;

@RequestMapping("/quiz")
@Controller
public class QuizController {
	
	//quiz 01번
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "/quiz/quiz01";		
	}
	
	@RequestMapping("/sendBirth")
	public ModelAndView sendBirth (Quiz01VO vo) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("year", vo.getYear());
		mv.addObject("month", vo.getMonth());
		mv.addObject("day", vo.getDay());
		
		mv.setViewName("quiz/quiz01_ok");
		return mv;
	}
	
	//quiz 02번
//	@RequestMapping("/quiz02")
//	public String quiz02() {
//		return "quiz/quiz02";
//	}
//	
//	@RequestMapping("/join")
//	public String join(@ModelAttribute("id") String id ,
//					   @ModelAttribute("pw") String pw ,
//					   @ModelAttribute("name") String name ,
//					   @ModelAttribute("email") String email) {
//		
//		return "quiz/quiz02_ok";
//	}
	@RequestMapping("/quiz02")
	public void quiz02() {
		
	}
	@RequestMapping("/join")
	public String join(@ModelAttribute("vo") Quiz02VO vo) {
		
		return "quiz/quiz02_ok";
	}
	
	//quiz03번
	@RequestMapping("/quiz03")
	public void quiz03() {
		
	}
	@RequestMapping("/join2")
	public String join2(@RequestParam(value="id",required = false, defaultValue = "") String id,
						@RequestParam("pw") String pw,
						@RequestParam("pw_check") String pw_check,
						RedirectAttributes RA,
						Model model) {
		
		if(id.equals("")) {//아이디를 적지않은경우
			
			RA.addFlashAttribute("msg", "아이디를 확인하세요");
			return "redirect:/quiz/quiz03"; //리다이렉트 이동
			
		} else if( !pw.equals(pw_check)) { //체크가 다른경우
			RA.addFlashAttribute("msg", "비밀번호를 확인하세요");
			return "redirect:/quiz/quiz03"; //리다이렉트 이동
		} else {
			model.addAttribute("msg", id + "님 회원가입을 축하합니다");
			return "quiz/quiz03_ok"; //포워드 이동
		}

	}
}
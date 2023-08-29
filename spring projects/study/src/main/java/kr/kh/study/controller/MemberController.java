package kr.kh.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.study.service.MemberService;

//@Controller 어노테이션으로 컨트롤러로 인식되게 함
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/test")
	public String test() {
		int count = memberService.count();
		System.out.println(count);
		// redirect : url을 메인으로 보내줌
		return "redirect:/";
	}
}

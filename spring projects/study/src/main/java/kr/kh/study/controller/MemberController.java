package kr.kh.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.kh.study.service.MemberService;
import kr.kh.study.vo.MemberVO;

//@Controller 어노테이션으로 컨트롤러로 인식되게 함
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	// signup = String을 반환하는 메서드
	@GetMapping("/member/signup")
	public String memberSignup() {
		return "member/signup";
	}
	
	//PostMapping으로 사용자가 입력한 member객체 받아옴
	@PostMapping("/member/signup") //@RequestMapping(value="/member/signup", method=RequestMethod.POST)
	public String memberSignupPost(Model model, MemberVO member) {
		String msg, url;
		
		if(memberService.signup(member)) {
			msg = "회원가입 성공!";
			url = "/";
		}else {
			msg ="회원가입 실패!";
			url ="/member/signup";
		}
		// model을 이용해서 jsp로 보낼수 있음. addAttribute(jsp의name, 보낼변수)
		model.addAttribute("url", url);
		model.addAttribute("msg", msg);
		return "util/message";
	}
}

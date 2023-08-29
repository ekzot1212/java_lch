package kr.kh.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import kr.kh.spring.service.MemberService;
import kr.kh.spring.util.Message;
import kr.kh.spring.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	// @Autowired - 의존성 주입 객체를 알아서 찾아 연결해 줌.
	// 다이나믹 웹프로젝트에서는 
	// MemberService memberService = new MemberServiceImp();
	
	@RequestMapping(value="/member/signup", method=RequestMethod.GET)
	public String signup() {
		return "member/signup";
	}
	
	@RequestMapping(value="/member/signup", method=RequestMethod.POST)
	public String signupPost(MemberVO member, Model model) {
		Message msg = new Message("/member/signup", "회원 가입에 실패했습니다.");
		
		if(memberService.signup(member)) {
			msg = new Message("/","회원 가입에 성공했습니다.");
		}
		model.addAttribute("msg", msg);
		return "message";
	}
	@GetMapping(value="/member/login")
	public String memberLogin() {
		return "member/login";
	}
	@PostMapping(value="/member/login")
	public String memberLoginPost(MemberVO member, Model model) {
		Message msg = new Message("/member/login", "로그인에 실패했습니다.");
		
		MemberVO user = memberService.login(member);
		if(user != null) {
			msg = new Message("/", "로그인에 성공했습니다.");
		}
		model.addAttribute("user", user);
		model.addAttribute("msg", msg);
		return "message"; 
	}
	@GetMapping("/member/logout")
	public String memberLogout(HttpServletRequest request, Model model) { 
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)session.getAttribute("user");
		Message msg = new Message("/", null);
		if(user != null) {
			// 유저가 로그인 되어 있으면 -> 로그아웃
			session.removeAttribute("user");
			msg.setMsg("로그아웃에 성공했습니다.");
		}
		// model 객체에 url이름의 데이터를 url이라는 변수에 저장
		model.addAttribute("msg", msg);
		return "message"; 
	}
}


// jsp에서 메소드가 post라 컨트롤러에서 POST찾음, jsp에서 name""과 변수명이 같아야 함. 
// 







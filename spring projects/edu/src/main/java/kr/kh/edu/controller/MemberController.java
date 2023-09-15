package kr.kh.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kh.edu.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
}

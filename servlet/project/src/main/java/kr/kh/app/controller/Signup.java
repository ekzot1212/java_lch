package kr.kh.app.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.kh.app.service.MemberService;
import kr.kh.app.service.MemberServiceImp;
import kr.kh.app.vo.MemberVO;

public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService memberService = new MemberServiceImp();
    public Signup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//화면에 입력한거 getParameter로 받아옴
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberVO member = new MemberVO(id,pw);
		memberService.signup(member);
		doGet(request, response);
	}

}

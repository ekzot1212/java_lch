package kr.kh.spring.interceptor;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.kh.spring.service.MemberService;
import kr.kh.spring.vo.MemberVO;

// 상속받아야 함
public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Autowired
	MemberService memberService;
	
	@Override
	public void postHandle(
		HttpServletRequest request,
		HttpServletResponse response,
		Object handle,
		ModelAndView mv) {
		
		MemberVO user = (MemberVO)mv.getModel().get("user");
		
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			//자동로그인을 체크한 경우
			if(user.isAutoLogin()) {
				//쿠키를 생성하여 필요한 정보를 넣고, 클라이언트에게 전달
				Cookie cookie = new Cookie("loginCookie", session.getId());
				cookie.setPath("/");
				int day = 7;
				int time = 60 * 60 * 24 * day;
				cookie.setMaxAge(time);
				response.addCookie(cookie);
				//쿠키에 넣은 필요한 정보를 DB에도 추가
				user.setMe_session_id(session.getId());
				//1주일 뒤
				Date date = new Date(System.currentTimeMillis() + time * 1000);
				user.setMe_session_limit(date);
				memberService.updateMemberSession(user);
			}
		}
	}
}

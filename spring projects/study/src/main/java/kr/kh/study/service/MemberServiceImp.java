package kr.kh.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.study.dao.MemberDAO;
import kr.kh.study.vo.MemberVO;


//MemberServiceImp = MemberService인터페이스의 구현클래스이다.
@Service
public class MemberServiceImp implements MemberService {
	
	//서비스는 DAO가 필요함
	// Mapper인식해야 에러안남.
	@Autowired
	private MemberDAO memberDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public boolean signup(MemberVO member) { 
		if(member == null || 
				member.getMe_id() == null || 
				member.getMe_pw() == null ||
				member.getMe_email() == null) {
			return false;
		}
		//유효성 검사
		if(!checkRegexMember(member)) {
			return false;
		}
		//아이디 중복체크
		//아이디로 회원정보를 가져옴(db에서)
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		if(dbMember != null) {
			return false;
		}
		
		//회원가입 진행
		//비밀번호 암호화
		String encPw = passwordEncoder.encode(member.getMe_pw());
		member.setMe_pw(encPw);
		return memberDao.insertMember(member); 
	}
	
	private boolean checkRegexMember(MemberVO member) {
		//필요하면 유효성 검사 코드를 구현
		return true;
	}


}

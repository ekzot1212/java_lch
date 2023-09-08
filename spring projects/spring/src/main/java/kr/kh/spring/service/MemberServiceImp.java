package kr.kh.spring.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.spring.dao.MemberDAO;
import kr.kh.spring.vo.MemberVO;

// @Service 어노테이션이 있어서 @Autowired로 객체를 이식해 줄 수 있음.
// 원래는 생성자 작성하고 객체를 만들어서 넘겨줘야 하는데 그러지 않아도 됨.
@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	//비번을 암호화하기 위한 객체
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}
		
		//아이디 중복 확인
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		//가입하려는 아이디가 이미 가입된 경우
		if(dbMember != null) {
			return false;
		}
		//아이디, 비번 null 체크 + 유효성 검사
		//알파벳1글자 + 알파벳,숫자5~14글자 = (아이디는 영문으로 시작하고 6~15글자)
		String idRegex = "^[a-zA-Z][a-zA-Z0-9]{5,14}$";
		//비번은 영문,숫자,!@#$%로 이루어지고 6~15자
		String pwRegex = "^[a-zA-Z0-9!@#$%]{6,15}$";
		
		//아이디가 유효성에 맞지 않으면
		if(!Pattern.matches(idRegex, member.getMe_id())) {
			return false;
		}
		//비번이 유효성에 맞지 않으면
		if(!Pattern.matches(pwRegex, member.getMe_pw())) {
			return false;
		}
		
		//비번 암호화
		String encPw = passwordEncoder.encode(member.getMe_pw());
		member.setMe_pw(encPw);		//암호화된 비밀번호 set으로 입력
		
		//회원가입
		return memberDao.insertMember(member);
	}

	@Override
	public MemberVO login(MemberVO member) {
		if(member == null) {
			return null;
		}
		//가입된 아이디를 찾아서 dbMember에 가져옴.
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		//가입된 아이디가 아니면 (dbMember에 가져온 아이디가 없음 -> 같은 아이디가 없기 때문)
		if(dbMember == null) {
			return null;
		}
		//비번확인
		//matches(암호화안된문자열, 암호화된문자열) 을 같은지 비교해 줌 , return은 true,false
		if(passwordEncoder.matches(member.getMe_pw(), dbMember.getMe_pw())){
			return dbMember;
		}
		
		
		return null;
	}

	@Override
	public void updateMemberSession(MemberVO user) {
		if(user == null) {
			return;
		}
		memberDao.updateMemberSession(user);
		
	}

	@Override
	public MemberVO getMemberBySession(String session_id) {
		
		return memberDao.selectMemberBySession(session_id);
	}

	

}

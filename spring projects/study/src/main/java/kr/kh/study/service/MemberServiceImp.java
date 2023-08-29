package kr.kh.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.study.dao.MemberDAO;


//MemberServiceImp = MemberService인터페이스의 구현클래스이다.
@Service
public class MemberServiceImp implements MemberService {
	
	//서비스는 DAO가 필요함
	// Mapper인식해야 에러안남.
	@Autowired
	private MemberDAO memberDao;

	@Override
	public int count() {
		return memberDao.selectCountMember();
	} 
}

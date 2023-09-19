package kr.kh.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.edu.dao.BoardDAO;
import kr.kh.edu.vo.BoardVO;


@Service
public class BoardServiceImp implements BoardService {
	
	@Autowired
	BoardDAO boardDao;

	@Override
	public List<BoardVO> getBoardList() {
		
		return boardDao.selectBoardList();
	}
	
	
}
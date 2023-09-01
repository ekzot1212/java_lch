package kr.kh.spring.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.kh.spring.pagination.Criteria;
import kr.kh.spring.vo.BoardVO;
import kr.kh.spring.vo.MemberVO;

public interface BoardService {

	boolean insertBoard(BoardVO board, MemberVO user, MultipartFile[] files);

	List<BoardVO> getBoardList(Criteria cri);

	int getTotalCount(Criteria cri);

	BoardVO getBoard(Integer bo_num);

	void updateViews(Integer bo_num);
}

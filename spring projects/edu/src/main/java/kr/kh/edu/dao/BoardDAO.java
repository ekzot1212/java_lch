package kr.kh.edu.dao;

import java.util.List;

import kr.kh.edu.vo.BoardVO;

public interface BoardDAO {

	List<BoardVO> selectBoardList();

}

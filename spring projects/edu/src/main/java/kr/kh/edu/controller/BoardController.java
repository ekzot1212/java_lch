package kr.kh.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.edu.service.BoardService;
import kr.kh.edu.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/board/list")
	public String list(Model model) {
		//현재 페이지에 맞는 게시글을 가져와야함
		List<BoardVO> list = boardService.getBoardList();
		
		model.addAttribute("list", list);
		return "/board/list";
	}
}

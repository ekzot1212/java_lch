package kr.kh.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.kh.spring.service.CommentService;
import kr.kh.spring.vo.CommentVO;

// 모든 메서드가 ajax를 이용하는 경우 붙이는 어노테이션
@RestController
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	
	@PostMapping("/comment/insert")
	public Map<String, Object> insert(@RequestBody CommentVO comment){
		Map<String, Object> map = new HashMap<String, Object>();
		boolean res = commentService.insertComment(comment);
		map.put("res", res);
		return map;
	}
}

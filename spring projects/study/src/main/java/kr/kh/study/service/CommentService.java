package kr.kh.study.service;

import org.springframework.stereotype.Service;

import kr.kh.study.vo.CommentVO;

public interface CommentService {

	boolean insertComment(CommentVO comment);

}

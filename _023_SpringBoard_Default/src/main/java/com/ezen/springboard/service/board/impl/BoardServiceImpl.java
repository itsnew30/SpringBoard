package com.ezen.springboard.service.board.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.springboard.service.board.BoardService;
import com.ezen.springboard.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	// 게시글 등록
	@Override
	public void insertBoard(BoardVO boardVO) {
		boardDAO.insertBoard(boardVO);
	}
	
	// 게시글 목록 조회
	@Override
	public List<BoardVO> getBoardList(Map<String, String> paramMap) {
		return boardDAO.getBoardList(paramMap);
	}
	
	// 게시글 상세 조회
	@Override
	public BoardVO getBoard(int boardNo) {
		return boardDAO.getBoard(boardNo);
	}
	
	// 조회수 증가
	@Override
	public void updateBoardCnt(int boardNo) {
		boardDAO.updateBoardCnt(boardNo);
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) {
		boardDAO.updateBoard(boardVO);
	}
	
	@Override
	public void deleteBoard(int boardNo) {
		boardDAO.deleteBoard(boardNo);
	}
	
	
}

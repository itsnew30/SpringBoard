package com.ezen.springboard.service.board.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.springboard.vo.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO boardVO) {
		mybatis.insert("BoardDAO.insertBoard", boardVO);
	}
	
	public List<BoardVO> getBoardList(Map<String, String> paramMap) {
		return mybatis.selectList("BoardDAO.getBoardList", paramMap); // paramMap 쿼리에 보내주기
	}
	
	public BoardVO getBoard(int boardNo) {
		return mybatis.selectOne("BoardDAO.getBoard", boardNo);
	}
	
	public void updateBoardCnt(int boardNo) {
		mybatis.update("BoardDAO.updateBoardCnt", boardNo);
	}
	
	public void updateBoard(BoardVO boardVO) {
		mybatis.update("BoardDAO.updateBoard", boardVO);
	}
	
	// ("BoardDAO.deleteBoardNo",boardNo) : ("네임스페이스.쿼리문아이디", 넘겨줄 값)
	public void deleteBoard(int boardNo) {
		mybatis.delete("BoardDAO.deleteBoard",boardNo);
	}
	
	
	
	
}

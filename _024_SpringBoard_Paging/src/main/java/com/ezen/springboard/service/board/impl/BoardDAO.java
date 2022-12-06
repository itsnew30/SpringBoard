package com.ezen.springboard.service.board.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.springboard.vo.BoardVO;
import com.ezen.springboard.vo.Criteria;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO boardVO) {
		mybatis.insert("BoardDAO.insertBoard", boardVO);
	}
	
	public List<BoardVO> getBoardList(Map<String, String> paramMap, Criteria cri) {
		// 파라미터값에 paramMap,cri 두개 못 넣어서 map 만드는것   
		Map<String, Object> pMap = new HashMap<String, Object>();
		
		pMap.put("boardSearch", paramMap);
		
		cri.setStartNum((cri.getPageNum() - 1) * cri.getAmount());
		pMap.put("cri", cri);
		return mybatis.selectList("BoardDAO.getBoardList", pMap); // paramMap 쿼리에 보내주기
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
	
	public int getBoardTotalCnt(Map<String, String> paramMap) {
		return mybatis.selectOne("BoardDAO.getBoardTotalCnt", paramMap);
	}
	
	
}

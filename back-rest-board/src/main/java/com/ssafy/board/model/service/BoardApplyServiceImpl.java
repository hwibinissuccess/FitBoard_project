package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.board.model.dao.BoardApplyDao;
import com.ssafy.board.model.dto.BoardApplyDTO;

public class BoardApplyServiceImpl implements BoardApplyService {


	@Autowired
	private BoardApplyDao boardApplyDao;
	
	
	@Override
	public void writeBoard(BoardApplyDTO board) {
		boardApplyDao.insertBoard(board);
	}


	@Override
	public List<BoardApplyDTO> getBoardList(HashMap<String, String> params) {
		return boardApplyDao.selectList(params);
	}


	@Override
	public BoardApplyDTO getBoard(int id) {
	
		return boardApplyDao.selectOne(id);
	}


	@Override
	public boolean modifyBoard(BoardApplyDTO board) {
		BoardApplyDTO originBoard = boardApplyDao.selectOne(board.getId());
		originBoard.setTitle(board.getTitle());
		originBoard.setContent(board.getContent());
		return boardApplyDao.updateBoard(originBoard) == 1;
	}


	@Override
	public boolean removeBoard(int id) {
		return boardApplyDao.deleteBoard(id) == 1;
	}







}

package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.BoardCommunityDao;
import com.ssafy.board.model.dto.BoardCommunityDTO;

@Service
public class BoardCommunityServiceImpl implements BoardCommunityService {

	@Autowired
	private BoardCommunityDao boardCommunityDao;
	
	
	@Override
	public void writeBoard(BoardCommunityDTO board) {
		boardCommunityDao.insertBoard(board);
	}


	@Override
	public List<BoardCommunityDTO> getBoardList(HashMap<String, String> params) {
		return boardCommunityDao.selectList(params);
	}


	@Override
	public BoardCommunityDTO getBoard(int id) {
		
		return boardCommunityDao.selectOne(id);
	}


	@Override
	public boolean modifyBoard(BoardCommunityDTO board) {
		BoardCommunityDTO originBoard = boardCommunityDao.selectOne(board.getId());
		originBoard.setTitle(board.getTitle());
		originBoard.setContent(board.getContent());
		return boardCommunityDao.updateBoard(originBoard) == 1;
	}


	@Override
	public boolean removeBoard(int id) {
		return boardCommunityDao.deleteBoard(id) == 1;
	}


	

}

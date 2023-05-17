package com.ssafy.board.model.dao;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.BoardApplyDTO;

public interface BoardApplyDao {
	// 게시글 등록
	void insertBoard(BoardApplyDTO board);

	// 게시글 목록
	List<BoardApplyDTO> selectList(HashMap<String, String> params);

	// 게시글 조회
	BoardApplyDTO selectOne(int id);

	// 게시글 삭제
	int deleteBoard(int id);

	// 게시글 수정
	int updateBoard(BoardApplyDTO board);
}

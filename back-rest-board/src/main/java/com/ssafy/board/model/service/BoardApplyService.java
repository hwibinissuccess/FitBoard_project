package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.BoardApplyDTO;

public interface BoardApplyService {
	
	//게시글 등록
	void writeBoard(BoardApplyDTO board);
	//게시글 목록
	List<BoardApplyDTO> getBoardList(HashMap<String, String> params);
	//게시글 조회
	BoardApplyDTO getBoard(int id);
	//게시글 수정
	boolean modifyBoard(BoardApplyDTO board);
	//게시글 삭제
	boolean removeBoard(int id);

}


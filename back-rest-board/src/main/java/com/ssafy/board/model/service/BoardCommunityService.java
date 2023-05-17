package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.BoardCommunityDTO;

public interface BoardCommunityService {
	//게시글 등록
	void writeBoard(BoardCommunityDTO board);
	//게시글 목록
	List<BoardCommunityDTO> getBoardList(HashMap<String, String> params);
	//게시글 조회
	BoardCommunityDTO getBoard(int id);
	//게시글 수정
	boolean modifyBoard(BoardCommunityDTO board);
	//게시글 삭제
	boolean removeBoard(int id);

}
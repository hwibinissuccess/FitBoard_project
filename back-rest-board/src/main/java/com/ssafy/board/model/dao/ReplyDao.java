package com.ssafy.board.model.dao;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.ReplyDTO;

public interface ReplyDao {
	
	// 댓글 등록
	void insertReply(ReplyDTO reply);

	// 댓글 목록
	List<ReplyDTO> selectList(HashMap<String, String> params);

	// 댓글 조회
	ReplyDTO selectOne(int id);

	// 댓글 삭제
	int deleteReply(int id);

	// 댓글 수정
	int updateReply(ReplyDTO reply);
}
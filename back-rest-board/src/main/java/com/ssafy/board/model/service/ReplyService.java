package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.ReplyDTO;

public interface ReplyService {
	
	// 댓글 등록
	void writeReply(ReplyDTO reply);
	// 댓글 목록
	List<ReplyDTO> getReplyList(HashMap<String, String> params);
	// 댓글 조회
	ReplyDTO getReply(int id);
	// 댓글 수정
	boolean modifyReply(ReplyDTO reply);
	// 댓글 삭제
	boolean removeReply(int id);

}

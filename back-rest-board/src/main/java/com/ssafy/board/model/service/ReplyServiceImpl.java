package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.ReplyDao;
import com.ssafy.board.model.dto.ReplyDTO;

@Service
public class ReplyServiceImpl implements ReplyService {


	@Autowired
	private ReplyDao replyDao;
	
	
	@Override
	public void writeReply(ReplyDTO reply) {
		replyDao.insertReply(reply);
	}


	@Override
	public List<ReplyDTO> getReplyList(HashMap<String, String> params) {
		return replyDao.selectList(params);
	}


	@Override
	public ReplyDTO getReply(int id) {
	
		return replyDao.selectOne(id);
	}


	@Override
	public boolean modifyReply(ReplyDTO reply) {
		ReplyDTO originReply = replyDao.selectOne(reply.getId());
	
		originReply.setContent(reply.getContent());
		return replyDao.updateReply(originReply) == 1;
	}


	@Override
	public boolean removeReply(int id) {
		return replyDao.deleteReply(id) == 1;
	}







}

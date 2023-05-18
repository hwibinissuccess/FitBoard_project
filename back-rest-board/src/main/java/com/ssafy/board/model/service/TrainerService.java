package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.TrainerDTO;

public interface TrainerService {
	
	
	
	//유저 리스트 가져오기
	public List<TrainerDTO> getTrainerList();
	
	//가입
	public int signup(TrainerDTO trainer);
	
	//로그인
	public TrainerDTO login(String id, String password);
}

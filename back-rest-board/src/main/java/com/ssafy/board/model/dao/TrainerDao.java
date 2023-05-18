package com.ssafy.board.model.dao;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.TrainerDTO;

public interface TrainerDao {

	
	//트레이너 추가
	public int insertTrainer(TrainerDTO trainer);
	
	//트레이너 선택
	public TrainerDTO selectOne(String id);

	// 트레이너 전체 선택
	public List<TrainerDTO> selectAll();
}
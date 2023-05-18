package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.TrainerDao;
import com.ssafy.board.model.dto.TrainerDTO;

@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerDao trainerDao;
	
	@Override
	public List<TrainerDTO> getTrainerList() {
		return trainerDao.selectAll();
	}

	@Override
	public int signup(TrainerDTO trainer) {
		return trainerDao.insertTrainer(trainer);
	}

	@Override
	public TrainerDTO login(String id, String password) {

		TrainerDTO tmp = trainerDao.selectOne(id);

		if(tmp != null && tmp.getPassword().equals(password))
			return tmp;
		return null;
	}

}

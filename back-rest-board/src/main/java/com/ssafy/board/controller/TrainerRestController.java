package com.ssafy.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.TrainerDTO;
import com.ssafy.board.model.service.TrainerService;

@RestController
@RequestMapping("/api-trainer")
public class TrainerRestController {

	@Autowired
	private TrainerService trainerService;

	// 전체 유저목록 가져오기
	@GetMapping("/trainers")
	public List<TrainerDTO> trainerList() {
		return trainerService.getTrainerList();
	}

	// 회원가입 (form data 형식으로 넘어왔다.)
	@PostMapping("/signup")
	public ResponseEntity<Integer> signup(TrainerDTO trainer) {
		int result = trainerService.signup(trainer);
		//result 가 0이면 등록 x, 1이면 등록 된거야~~
		//등록한 유저정보를 반환하겠다. 
		//Integer 대시 Trainer 요런것을 반환하면 좋겠다.
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}

	// 로그인 (실제 수행)
	@PostMapping("/login")
	public ResponseEntity<?> login(TrainerDTO trainer, HttpSession session) {
		TrainerDTO tmp = trainerService.login(trainer.getId(), trainer.getPassword());
		if(tmp == null) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		session.setAttribute("loginTrainer", tmp);
		return new ResponseEntity<String>(tmp.getId(), HttpStatus.OK);
	}

	// 로그아웃
	@GetMapping("logout")
	public ResponseEntity<Void> logout(HttpSession session) {
//		session.removeAttribute("loginTrainer");
		session.invalidate();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}

package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.UserDTO;

public interface UserService {
	
	
	
	//유저 리스트 가져오기
	public List<UserDTO> getUserList();
	
	//가입
	public int signup(UserDTO user);
	
	//로그인
	public UserDTO login(String id, String password);
}

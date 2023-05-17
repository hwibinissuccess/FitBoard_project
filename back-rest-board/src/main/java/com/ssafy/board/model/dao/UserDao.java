package com.ssafy.board.model.dao;

import java.util.HashMap;
import java.util.List;

import com.ssafy.board.model.dto.UserDTO;

public interface UserDao {

	
	//유저 추가
	public int insertUser(UserDTO user);
	
	//유저 선택
	public UserDTO selectOne(String id);

	// 유저 전체 선택
	public List<UserDTO> selectAll();
}

package com.ssafy.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.exception.BoardNotFoundException;
import com.ssafy.board.model.dto.BoardApplyDTO;
import com.ssafy.board.model.service.BoardApplyService;
import com.ssafy.board.model.service.BoardService;

@RestController
@RequestMapping("/api")
public class BoardApplyRestController {

	private static final String SUCCESS = "succes";
	private static final String FAIL = "fail";

	@Autowired
	private BoardApplyService boardApplyService;

	@GetMapping("/board")
	public ResponseEntity<List<BoardApplyDTO>> list(@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String keyword) {
		HashMap<String, String> params = new HashMap<String, String>();

		params.put("mode", mode);
		params.put("keyword", keyword);

		return new ResponseEntity<List<BoardApplyDTO>>(boardApplyService.getBoardList(params), HttpStatus.OK);
	}

	@PostMapping("/board")
	public ResponseEntity<String> write(BoardApplyDTO board) {
		boardApplyService.writeBoard(board);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	@GetMapping("/board/{id}")
	public ResponseEntity<BoardApplyDTO> detail(@PathVariable int id) {
		try {
			return new ResponseEntity<BoardApplyDTO>(boardApplyService.getBoard(id), HttpStatus.OK);
		} catch (Exception e) {
			throw new BoardNotFoundException(id + "번 게시글은 없다.");
		}
	}

	// 게시글 수정
	@PutMapping("/board")
	public ResponseEntity<String> update(BoardApplyDTO board) {
		boardApplyService.modifyBoard(board);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

	// 게시글 삭제
	@DeleteMapping("/board/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		if (boardApplyService.removeBoard(id)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}

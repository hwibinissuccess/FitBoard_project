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
import com.ssafy.board.model.dto.ReplyDTO;
import com.ssafy.board.model.service.ReplyService;

@RestController
@RequestMapping("/api")
public class ReplyController {

	private static final String SUCCESS = "succes";
	private static final String FAIL = "fail";

	@Autowired
	private ReplyService replyService;

	@GetMapping("/board/reply")
	public ResponseEntity<List<ReplyDTO>> list(@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String keyword) {
		HashMap<String, String> params = new HashMap<String, String>();

		params.put("mode", mode);
		params.put("keyword", keyword);

		return new ResponseEntity<List<ReplyDTO>>(replyService.getReplyList(params), HttpStatus.OK);
	}

	@PostMapping("/board/reply")
	public ResponseEntity<String> write(ReplyDTO reply) {
		replyService.writeReply(reply);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	@GetMapping("/board//reply/{id}")
	public ResponseEntity<ReplyDTO> detail(@PathVariable int id) {
		try {
			return new ResponseEntity<ReplyDTO>(replyService.getReply(id), HttpStatus.OK);
		} catch (Exception e) {
			throw new BoardNotFoundException(id + "의 댓글이 없습니다.");
		}
	}

	// 댓글 수정
	@PutMapping("/board/reply")
	public ResponseEntity<String> update(ReplyDTO reply) {
		replyService.modifyReply(reply);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

	// 댓글 삭제
	@DeleteMapping("/board/reply/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		if (replyService.removeReply(id)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}


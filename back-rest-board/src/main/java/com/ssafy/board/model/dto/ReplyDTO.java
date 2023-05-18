package com.ssafy.board.model.dto;

import java.time.LocalDate;

public class ReplyDTO {
	
	private int id;
	private String content;
	private String writer;
	private LocalDate regdate;
	
	public ReplyDTO() {
		
	}
	
	public ReplyDTO(String content, String writer, LocalDate regdate) {
		
		this.id = id;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getRegdate() {
		return regdate;
	}

	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ReplyDTO [content=" + content + ", writer=" + writer + ", regdate=" + regdate + "]";
	}
	
	

}

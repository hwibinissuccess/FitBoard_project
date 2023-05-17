package com.ssafy.board.model.dto;

import java.time.LocalDate;

public class ReplyDTO {
	
	private String content;
	private String writer;
	private LocalDate date;
	
	public ReplyDTO() {
		
	}
	
	public ReplyDTO(String content, String writer, LocalDate date) {
		
		this.content = content;
		this.writer = writer;
		this.date = date;
		
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ReplyDTO [content=" + content + ", writer=" + writer + ", date=" + date + "]";
	}
	
	

}

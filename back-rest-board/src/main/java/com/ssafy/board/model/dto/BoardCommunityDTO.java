package com.ssafy.board.model.dto;

import java.time.LocalDate;

public class BoardCommunityDTO {
	
	private int id;
	private String title;
	private String content;
	private LocalDate date;
	private int number;
	private String writer;
	
	public BoardCommunityDTO() {
	}
	
	public BoardCommunityDTO(int id, String title, String content, LocalDate date, int number, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
		this.number = number;
		this.writer = writer;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BoardCommunityDTO [id=" + id + ", title=" + title + ", content=" + content + ", date=" + date
				+ ", number=" + number + ", writer=" + writer + "]";
	}

	

	
	
	
}



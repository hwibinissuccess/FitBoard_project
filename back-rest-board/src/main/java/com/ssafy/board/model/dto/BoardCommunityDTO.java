package com.ssafy.board.model.dto;

import java.time.LocalDate;

public class BoardCommunityDTO {
	
	private String title;
	private String content;
	private LocalDate date;
	private int number;
	
	public BoardCommunityDTO() {
	}
	
	public BoardCommunityDTO(String title, String content, LocalDate date, int number) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
		this.number = number;
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

	@Override
	public String toString() {
		return "BoardCommunity [title=" + title + ", content=" + content + ", date=" + date + ", number=" + number
				+ "]";
	}
	
	
	
}



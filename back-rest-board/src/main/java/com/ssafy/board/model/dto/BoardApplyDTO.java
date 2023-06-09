package com.ssafy.board.model.dto;

public class BoardApplyDTO {
	private int id;
	private String title;
	private String content;
	private int default_max;
	private int volunteers;
	private String writer;

	public BoardApplyDTO() {
	}

	public BoardApplyDTO(int id, String title, String content, int default_max, int volunteers, String writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.default_max = default_max;
		this.volunteers = volunteers;
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

	public int getDefault_max() {
		return default_max;
	}

	public void setDefault_max(int default_max) {
		this.default_max = default_max;
	}

	public int getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(int volunteers) {
		this.volunteers = volunteers;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BoardApplyDTO [id=" + id + ", title=" + title + ", content=" + content + ", default_max=" + default_max
				+ ", volunteers=" + volunteers + ", writer=" + writer + "]";
	}

	
	
	

	
}

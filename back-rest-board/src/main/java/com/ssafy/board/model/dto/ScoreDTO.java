package com.ssafy.board.model.dto;

public class ScoreDTO {
	
	private String user;
	private String trainer;
	private int star;
	
	public ScoreDTO() {
		
	}
	
	public ScoreDTO(String user, String trainer, int star) {
		
		this.user = user;
		this.trainer = trainer;
		this.star = star;
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	@Override
	public String toString() {
		return "ScoreDTO [user=" + user + ", trainer=" + trainer + ", star=" + star + "]";
	}
	
	

}

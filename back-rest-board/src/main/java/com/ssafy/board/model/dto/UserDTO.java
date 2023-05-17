package com.ssafy.board.model.dto;

public class UserDTO {
	private String id;
	private String password;
	private String alike;
	private String chosen;
	private String image;
	

	public UserDTO() {
	}


	public UserDTO(String id, String password, String alike, String chosen, String image) {
		super();
		this.id = id;
		this.password = password;
		this.alike = alike;
		this.chosen = chosen;
		this.image = image;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getalike() {
		return alike;
	}


	public void setalike(String alike) {
		this.alike = alike;
	}


	public String getChosen() {
		return chosen;
	}


	public void setChosen(String chosen) {
		this.chosen = chosen;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", alike=" + alike + ", chosen=" + chosen + ", image="
				+ image + "]";
	}

	


}

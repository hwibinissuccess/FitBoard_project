package com.ssafy.board.model.dto;

public class TrainerDTO {
	private String id;
	private String password;
	private String image;
	private String profile;
	private String phone;
	private String address;
	private int score;

	public TrainerDTO() {
	}

	public TrainerDTO(String id, String password, String image, String profile, String phone,
			String address, int score) {
		super();
		this.id = id;
		this.password = password;
		this.image = image;
		this.profile = profile;
		this.phone = phone;
		this.address = address;
		this.score = score;
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


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", password=" + password + ", image="
				+ image + ", profile=" + profile + ", phone=" + phone + ", address=" + address + ", score=" + score
				+ "]";
	}

	
	
	
	


}

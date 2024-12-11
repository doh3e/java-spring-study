package com.ssafy.study_04_jieun.model.dto;

public class Member {
	
	private int id;
	private String name;
	private String jumin;
	private int age;
	private String phone;
	private String address;
	private String profileImage;
	
	
	public Member() {
		super();
	}


	public Member(int id, String name, String jumin, int age, String phone, String address, String profileImage) {
		super();
		this.id = id;
		this.name = name;
		this.jumin = jumin;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.profileImage = profileImage;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJumin() {
		return jumin;
	}


	public void setJumin(String jumin) {
		this.jumin = jumin;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
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


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	
}

package com.app.entity;

import java.io.Serializable;

public class Applicant implements Serializable {
	 private static final long serialVersionUID = -7893237204476214050L;
	   private String id;
	   private String name;
	   private String email;
	   
	   private String position;
	   private String gender;
	   private String skills;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
		

}

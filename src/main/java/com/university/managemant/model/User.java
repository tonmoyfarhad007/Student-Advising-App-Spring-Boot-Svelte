package com.university.managemant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private String userType;
	
	private boolean isActive;
	
	public User(){}

	public User(long id, String email, String password, String userType, boolean isActive) {
		super();
		this.userId = id;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.isActive = isActive;
	}

	public long getId() {
		return userId;
	}

	public void setId(long id) {
		this.userId = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", email=" + email + ", password=" + password + ", userType=" + userType
				+ ", isActive=" + isActive + "]";
	}


	

}

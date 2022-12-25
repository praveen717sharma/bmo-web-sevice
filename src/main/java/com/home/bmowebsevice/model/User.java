package com.home.bmowebsevice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_INFO")
public class User {

	@Id
	private Integer userId;
	private String userName;
	private String userType;
	private String userAddress;

	public User() {

	}

	public User(Integer userId, String userName, String userType, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userAddress = userAddress;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}

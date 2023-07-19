package com.itwill.shop.userinfo;

public class User {
	/*
	이름       널?       유형            
	-------- -------- ------------- 
	USERID   NOT NULL VARCHAR2(100) 
	PASSWORD          VARCHAR2(100) 
	NAME              VARCHAR2(100) 
	EMAIL             VARCHAR2(100) 
	*/
	private String userId;
	private String userPassword;
	private String userName;
	private String userEmail;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userPassword, String userName, String userEmail) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userEmail="
				+ userEmail + "]\n";
	}
	
	
}

package com.hp.entity;

import java.io.Serializable;

public class JwtUserRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	private String password;
	
	//need default constructor for JSON Parsing
	public JwtUserRequest()
	{
		
	}

	public JwtUserRequest(String username, String password) {
		this.setUserName(username);
		this.setPassword(password);
	}

	public String getUserName() {
		return this.username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
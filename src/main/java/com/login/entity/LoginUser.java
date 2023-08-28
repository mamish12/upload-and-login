package com.login.entity;

import lombok.Data;

@Data
public class LoginUser {
	
	private String name;
	private String pass;

	public LoginUser(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getUsername() {
		return name;
	}

	public String getPassword() {
		return pass;
	}


}

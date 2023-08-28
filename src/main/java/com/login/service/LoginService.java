package com.login.service;

import org.springframework.stereotype.Service;

import com.login.entity.LoginUser;
import com.login.entity.User;

@Service
public class LoginService {
	
	public boolean authenticateUser(LoginUser user) {
		String validUsername = "manish123";
		String validPassword = "mku@123";
		return validUsername.equals(user.getUsername()) && validPassword.equals(user.getPassword());
	}

}

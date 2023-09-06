package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.LoginUser;
import com.login.entity.User;
import com.login.response.ResponseMessage;
import com.login.service.LoginService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/login1")
public class LoginController {
	
	    @Autowired
	    private LoginService userService;

	    @PostMapping("/login2")
	    public ResponseEntity<ResponseMessage> login(@RequestBody LoginUser user) {
	    	if (userService.authenticateUser(user)) {
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Login Successful!"));
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseMessage("Login failed!"));
			}
			
	    }

}
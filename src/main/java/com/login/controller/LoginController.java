package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.LoginUser;
import com.login.entity.User;
import com.login.response.ResponseMessage;
import com.login.service.LoginService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	    @Autowired
	    private LoginService userService;

	    @PostMapping("/login")
	    public ResponseEntity<ResponseMessage> login(@RequestBody LoginUser user) {
	        if (userService.authenticateUser(user)) {
	        	
	        	   String successMessage = "Login Successful";
	               ResponseMessage response = new ResponseMessage(successMessage);
	               return ResponseEntity.ok(response);
	        }
	        else
	        {
	        	String successMessage = "Login Failed!!";
	        	ResponseMessage response = new ResponseMessage(successMessage);
	        	return ResponseEntity.ok(response);
	        }
			
	    }

}
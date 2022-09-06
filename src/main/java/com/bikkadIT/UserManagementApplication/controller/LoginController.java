package com.bikkadIT.UserManagementApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.UserManagementApplication.binding.LoginForm;
import com.bikkadIT.UserManagementApplication.service.UserServiceI;

@RestController
public class LoginController {
	@Autowired
private UserServiceI userServiceI;
	
	
	public ResponseEntity<String>loginCheck(@RequestBody LoginForm loginform){
		
		String loginCheck = userServiceI.loginCheck(loginform);
		return null;
	}

}

package com.bikkadIT.UserManagementApplication.service;

import org.springframework.stereotype.Service;

import com.bikkadIT.UserManagementApplication.binding.LoginForm;
import com.bikkadIT.UserManagementApplication.entities.UserAccountEntity;
import com.bikkadIT.UserManagementApplication.repository.UserAccountRepository;

@Service
public class UserServiceImpl implements UserServiceI {
private UserAccountRepository userAccountRepository;

	@Override
	public String loginCheck(LoginForm loginForm) {
		UserAccountEntity userAccountEntity = userAccountRepository.findByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
		
		if(userAccountEntity !=null) {
			if(userAccountEntity.getAccstatus().equals("LOCKED"));
	
			
			if(userAccountEntity.getAccstatus().equals("Locked")) {
				
				return "Your Account is locked";
		}else {
			return "Login successful.Welcome to bikkad IT";
		}

			
		}else {
			return "creditional are invalid";
					
		}
			
			
		
	}

}

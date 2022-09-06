package com.bikkadIT.UserManagementApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.UserManagementApplication.binding.LoginForm;
import com.bikkadIT.UserManagementApplication.entities.UserAccountEntity;
@Repository 
public interface UserAccountRepository extends JpaRepository<UserAccountRepository,Serializable> {
	
public UserAccountEntity findByEmailAndPassword(String email,String password);

}

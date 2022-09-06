package com.bikkadIT.UserManagementApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StateRepository extends JpaRepository<StateRepository,Serializable>{

}

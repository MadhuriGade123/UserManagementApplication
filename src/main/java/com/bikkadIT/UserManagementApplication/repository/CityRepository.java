package com.bikkadIT.UserManagementApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CityRepository extends JpaRepository<CityRepository,Serializable> {

}

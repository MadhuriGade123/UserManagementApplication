package com.bikkadIT.UserManagementApplication.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNT")
@Data
public class UserAccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_FNAME")
	private String fname;
	
	@Column(name="USER_LNAME")
	private String lname;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_PHNO")
	private Long phno;
	
	@Column(name="USER_DOB")
	private LocalDate dob;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_ACCSTATUS")
	private String accstatus;
	
	@Column(name="USER_CITYID")
	private String cityId;
	
	@Column(name="USER_STATEID")
	private String stateId;
	
	@Column(name="USER_COUNTRYID")
	private Integer countryId;
	

}

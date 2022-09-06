package com.bikkadIT.UserManagementApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="STATE_MASTER")
@Data
public class StateMasterEntity {
	private Integer stateId;
	private String stateName;
	
	
		
	}



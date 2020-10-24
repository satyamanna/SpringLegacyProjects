package com.springmvchibernate.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//  we are using lombok for getter setter  // as there is no build , so it does not provide getter setter methods
@Getter
@Setter
public class Users {

	
	
	private String userName;
	private String password ;
	
	
}

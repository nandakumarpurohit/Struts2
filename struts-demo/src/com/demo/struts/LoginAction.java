package com.demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		
		System.out.println(getUsername() + ":" + getPassword());
		if(getUsername().equals("Admin"))
			return SUCCESS;
		
		return ERROR;
	}

}

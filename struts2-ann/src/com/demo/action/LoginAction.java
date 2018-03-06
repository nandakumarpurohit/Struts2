package com.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value="/")
public class LoginAction extends ActionSupport{
	
	@Action(value="/", results={
			@Result(name="success",location="pages/login.jsp")
		})
	public String execute() {
		return SUCCESS;
	}

}
package com.demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	public String execute() {
		
		double num = Math.random();
		num *= 100;
		int x = (int) num;
		System.out.println(x);
		
		if(x %2 == 0)
			return SUCCESS;
		else
			return ERROR;
	}

}

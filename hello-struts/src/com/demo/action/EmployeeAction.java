package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	
	private int eid;
	private String ename;
	private String esal;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public String register() {
		
		System.out.println(getEid() + " : " + getEname());
		
		return SUCCESS;
		
	}

}

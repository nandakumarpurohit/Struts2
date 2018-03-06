package com.marlabs.struts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
public class Updates extends ActionSupport{	
	private static final long serialVersionUID = 1L;
	Connection con;
	Mybean mb=new Mybean();	
	
	public Mybean getMb() {
		return mb;
	}
	public void setMb(Mybean mb) {
		this.mb = mb;
	}

	public String execute()
	{
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dec2017","root","password");
	
	String s = "update details set sname=?,scountry=? where sno=?";	
	PreparedStatement ps=con.prepareStatement(s);
	ps.setString(1, mb.getNam());
	ps.setString(2, mb.getCt());
	ps.setInt(3, mb.getNo());
	
	ps.executeUpdate();
	con.commit();
	
		ps.close();  		
		con.close();

		    } 
		catch(Exception e){ 
 			e.printStackTrace(); 
 		}

		
			return SUCCESS;
		
	}
	
}

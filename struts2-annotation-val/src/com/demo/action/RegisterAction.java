package com.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Results({
   @Result(name="success", location="/success.jsp"),
   @Result(name="input", location="/register.jsp")
})
public class RegisterAction extends ActionSupport {

   private static final long serialVersionUID = 1L;
   private String username;
   private Integer age;
   private String password;

   @Action(value = "/register")
   public String execute() {
      return "success";
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public void validate() {
      if (getUsername().length() == 0) {
         addFieldError("username", "User Name is required");
      } else if (!getUsername().equals("Rockey")) {
         addFieldError("username", "Invalid User");
      }
      if (getPassword().length() == 0) {
         addFieldError("password", "Invalid password");
      }
      if (getAge() == null) {
         addFieldError("age", "Age required");
      }
   }
}
package com.af.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.af.validation.ValidEmail;



public class Users {
	
	@NotNull(message="id Required")
	private int id;
	@NotNull(message="Username Required")
	@Size(min=5,max=20,message="Username not Correct")
	private String username;
	
	@NotNull(message="Email Required")
	//@Pattern(regexp=".*\\@.*\\..*", message="This does not appear to be a valid email address")
	//@Size(min=5,max=50,message="Email Not Correct")
	@ValidEmail
	private String email;
	
	@NotNull(message="Password Required")
	@Size(min=5,max=20,message="Password not Coorect")
	private String password;

    



	public Users() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", email=" + email + ", password=" + password + ", id=" + id + "]";
	}
	
	
	
}

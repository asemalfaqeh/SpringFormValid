package com.af.dao;

public class Users {

	private String username;
	private String password;
	private String email;
	private int id;
	
	public Users() {
		
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", email=" + email + ", id=" + id + "]";
	}
	
	
	
}

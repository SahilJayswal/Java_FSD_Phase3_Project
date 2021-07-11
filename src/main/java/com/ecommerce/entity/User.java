package com.ecommerce.entity;

public class User {
	
	private int id;
	private String user_id;
	private String email_id;
	
	public User() {
		
	}
	public User(int id, String user_id, String email_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.email_id = email_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_id=" + user_id + ", email_id=" + email_id + "]";
	}
	
	

}

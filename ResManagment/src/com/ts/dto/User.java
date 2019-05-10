package com.ts.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class User {
	@Id@GeneratedValue
	private  int userId;
	@Column(length=25)
	private String name;
	@Column(length=25)
	private String userName;
	@Column(length=25)
	private String password;
	
	public User() {
		super();	
	}

	public User(String name, String userName, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;

	}

	public User(int userId, String name, String userName, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
    
	
}
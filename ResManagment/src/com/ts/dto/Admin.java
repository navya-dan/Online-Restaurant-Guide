package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id@GeneratedValue
	private  int restaurantId;
	@Column(length=35)
	private String adminName;
	@Column(length=35)
	private String adminUserName;
	@Column(length=35)
	private String password;
	@Column(length=35)
	private String restaurantName;
	@Column(length=35)
	private String restaurantImage;
	
	public Admin(int restaurantId, String adminName, String adminUserName, String password, String restaurantName,String restaurantImage) {
		this.restaurantId = restaurantId;
		this.adminName = adminName;
		this.adminUserName = adminUserName;
		this.password = password;
		this.restaurantName = restaurantName;
		this.restaurantImage = restaurantImage;
		
	}

	public Admin(String adminName, String adminUserName, String password, String restaurantName,String restaurantImage) {
		this.restaurantId = restaurantId;
		this.adminName = adminName;
		this.adminUserName = adminUserName;
		this.password = password;
		this.restaurantName = restaurantName;
		this.restaurantImage = restaurantImage;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	
	public String getRestaurantImage() {
		return restaurantImage;
	}

	public void setRestaurantImage(String restaurantImage) {
		this.restaurantImage = restaurantImage;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [restaurantId=" + restaurantId + ", adminName=" + adminName + ", adminUserName=" + adminUserName
				+ ", password=" + password + ", restaurantName=" + restaurantName + ", restaurantImage="
				+ restaurantImage + "]";
	}

	
	
	
	
}

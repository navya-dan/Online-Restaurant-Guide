package com.ts.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Manager {
	@Id@GeneratedValue
	private  int branchId;
	@Column(length=25)
	private String branch;
	@Column(length=25)
	private String managerUserName;
	@Column(length=25)
	private String password;
	
	@Override
	public String toString() {
		return "Manager [branchId=" + branchId + ", branch=" + branch + ", managerUserName=" + managerUserName
				+ ", password=" + password + ", admin=" + admin + "]";
	}


	@ManyToOne
	@JoinColumn(name="restaurantId")
	private Admin admin;

	
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Manager(Admin admin, String managerUserName, String password ,String branch) {
		super();
		this.branchId = branchId;
		this.branch = branch;
		this.managerUserName = managerUserName;
		this.password = password;
		this.admin = admin;
	}



	public Manager(int branchId, String branch, String managerUserName, String password, Admin admin) {
		super();
		this.branchId = branchId;
		this.branch = branch;
		this.managerUserName = managerUserName;
		this.password = password;
		this.admin = admin;
	}





	public String getManagerUserName() {
		return managerUserName;
	}



	public void setManagerUserName(String managerUserName) {
		this.managerUserName = managerUserName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getBranchId() {
		return branchId;
	}


	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}



	

}

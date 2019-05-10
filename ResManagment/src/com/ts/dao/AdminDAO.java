package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.User;
import com.ts.dto.Admin;

public class AdminDAO {
private SessionFactory factory = null;
	
	public Admin getAdmin(String adminN) {

		return (Admin)HibernateTemplate.getObjectByAdminUserName(adminN);
	}

	public int register(Admin admin) {
		return HibernateTemplate.addObject(admin);
	}
	
	public static List<Admin> getAllUsers() {
		List<Admin> admins = (List)HibernateTemplate.getObjectListByQuery("From Admin");
		System.out.println("Inside All Admins ..."+admins);
		return admins;	
	}

	public Admin getUser(int id) {
		return (Admin)HibernateTemplate.getObject(Admin.class,id);
	}
	public int delUser(int id) {
		return HibernateTemplate.deleteObject(Admin.class,id);
	}
	public int updateUser( Admin admin) {
		return HibernateTemplate.updateObject(admin);
	}
}

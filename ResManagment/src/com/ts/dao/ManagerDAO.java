package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;

import com.ts.dto.Manager;



public class ManagerDAO {

	private SessionFactory factory = null;
	
	
	public Manager getManager(String managerUserName) {

		return (Manager)HibernateTemplate.getObjectByManagerUserName(managerUserName);
	}
	
	public int register(Manager manager) {
		return HibernateTemplate.addObject(manager);
	}
	
	public static List<Manager> getAllManagers(int id) {
		
		List<Manager> manager = (List)HibernateTemplate.getObjectListById(id);
		
		System.out.println("Inside All Managers ..."+manager);
		return manager;	
	}

	public static Manager getManager(int id) {
		return (Manager)HibernateTemplate.getObject(Manager.class,id);
	}
	public int delManager(String delBranch) {
		return HibernateTemplate.deleteObject(Manager.class,delBranch);
	}
	public int delManager(int id) {
		return HibernateTemplate.deleteObject(Manager.class,id);
	}
	public int updateManager( Manager manager) {
		return HibernateTemplate.updateObject(manager);
	}
	
}
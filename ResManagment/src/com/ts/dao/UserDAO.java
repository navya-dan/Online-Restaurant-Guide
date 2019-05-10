package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;

import com.ts.dto.User;

public class UserDAO {

	private SessionFactory factory = null;
	
	public User getUser(String userN) {

		return (User)HibernateTemplate.getObjectByUserName(userN);
	}

	public int register(User user) {
		return HibernateTemplate.addObject(user);
	}
	
	public List<User> getAllUsers() {
		List<User> users=(List)HibernateTemplate.getObjectListByQuery("From User");
		System.out.println("Inside All Users ..."+users);
		return users;	
	}

	public static User getUser(int id) {
		return (User)HibernateTemplate.getObject(User.class,id);
	}
	public int delUser(int id) {
		return HibernateTemplate.deleteObject(User.class,id);
	}
	public int updateUser( User user) {
		return HibernateTemplate.updateObject(user);
	}
}

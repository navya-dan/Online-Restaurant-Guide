package com.ts.db;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ts.dto.Admin;
import com.ts.dto.Manager;
import com.ts.dto.Recipe;
import com.ts.dto.Reviews;
import com.ts.dto.User;

public class HibernateTemplate {

	private static SessionFactory sessionFactory;

	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}

	public static  int addObject(Object obj)
	{
		int result=0;

		Transaction tx=null;

		try {

			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();

			session.save(obj);

			tx.commit();

			result=1;

		} catch (Exception e) {

			tx.rollback();

			e.printStackTrace();
		}

		return result;
	}

	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;

		try {			
			return sessionFactory.openSession().get(c,serializable);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return obj;
	}

	public static Object getObjectByAdminUserName(String adminUserName) {

		String queryString = "from Admin where adminUserName = :adminUserName";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setString("adminUserName", adminUserName);
		Object queryResult = query.uniqueResult();
		Admin admin = (Admin)queryResult;
		return admin; 
	}

	public static Object getObjectByManagerUserName(String managerUserName) {

		String queryString = "from Manager where managerUserName = :managerUserName";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setString("managerUserName", managerUserName);
		Object queryResult = query.uniqueResult();
		Manager manager = (Manager)queryResult;
		return manager; 
	}
	
	public static Object getObjectByUserName(String userName) {

		String queryString = "from User where userName = :userName";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setString("userName", userName);
		Object queryResult = query.uniqueResult();
		User user = (User)queryResult;
		return user; 
	}
	
	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}

	public static List<Manager> getObjectListById(int id)
	{
		String queryString = "from Manager where restaurantId = :restaurantId";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setInteger("restaurantId", id);
		Object queryResult = query.list();
		List<Manager> manager = (List<Manager>)queryResult;
		return manager; 

	}
	
	public static List<Recipe> getObjectListByBranchId(int id)
	{
		String queryString = "from Recipe where branchId = :branchId";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setInteger("branchId", id);
		Object queryResult = query.list();
		List<Recipe> recipe = (List<Recipe>)queryResult;
		return recipe; 

	}
	
	public static List<Reviews> getObjectListBybranchId(int branchId)
	{
		String queryString = "from Reviews where branchId = :branchId";
		Query query = sessionFactory.openSession().createQuery(queryString);
		query.setInteger("branchId", branchId);
		Object queryResult = query.list();
		List<Reviews> reviews = (List<Reviews>)queryResult;
		return reviews; 

	}
	
	public static int updateObject(Object obj)
	{
		int result=0;

		Transaction tx=null;

		try {

			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();

			session.saveOrUpdate(obj);

			tx.commit();

			result=1;

		} catch (Exception e) {

			tx.rollback();

			e.printStackTrace();
		}

		return result;
	}

	public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;

		Session session=sessionFactory.openSession();

		Transaction tx=session.beginTransaction();

		try {

			Object obj=session.get(c,serializable);

			session.delete(obj);

			tx.commit();

			result=1;

		} catch (Exception e) {

			e.printStackTrace();

			tx.rollback();
		}

		return result;
	}
}

package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Manager;
import com.ts.dto.Reviews;

public class ReviewDAO {
	
private SessionFactory factory = null;
	
	
	public Reviews getReview(String managerUserName) {

		return (Reviews)HibernateTemplate.getObjectByManagerUserName(managerUserName);
	}
	
	public int register(Reviews review) {
		return HibernateTemplate.addObject(review);
	}
	
	public static List<Reviews> getAllReviews(int branchid) {
		
		List<Reviews> reviews = (List)HibernateTemplate.getObjectListBybranchId(branchid);
		
		System.out.println("Inside All Reviews ..."+reviews);
		return reviews;	
	}

	public Reviews getReviews(int id) {
		return (Reviews)HibernateTemplate.getObject(Reviews.class,id);
	}
	
	public int delReviews(int id) {
		return HibernateTemplate.deleteObject(Reviews.class,id);
	}
	public int updateReviews( Reviews reviews) {
		return HibernateTemplate.updateObject(reviews);
	}

}

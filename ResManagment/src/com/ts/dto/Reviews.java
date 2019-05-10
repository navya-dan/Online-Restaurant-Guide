package com.ts.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Reviews {
	@Id@GeneratedValue
	private  int reviewId;
	@Column(length=100)
	private String comment;
	@Column(length=25)
	private int rating;
	
	
	@ManyToOne
	@JoinColumn(name="branchId")
	private Manager manager;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	

	public Reviews(String comment, int rating, Manager manager, User user) {
		super();
		this.comment = comment;
		this.rating = rating;
		this.manager = manager;
		this.user = user;
	}

	public Reviews(int reviewId, String comment, int rating, Manager manager, User user) {
		super();
		this.reviewId = reviewId;
		this.comment = comment;
		this.rating = rating;
		this.manager = manager;
		this.user = user;
	}

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	


	public Manager getManager() {
		return manager;
	}




	public void setManager(Manager manager) {
		this.manager = manager;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Reviews [reviewId=" + reviewId + ", comment=" + comment + ", rating=" + rating + ", manager=" + manager
				+ ", user=" + user + "]";
	}

	

	
}

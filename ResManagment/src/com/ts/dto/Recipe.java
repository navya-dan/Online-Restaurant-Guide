package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recipe {
	@Id@GeneratedValue
	private  int recipeId;
	@Column(length=25)
	private String recipe;
	@Column(length=25)
	private float recipeCost;
	@Column(length=25)
	private String recipeImage;
	
	
	@ManyToOne
	@JoinColumn(name="branchId")
	private Manager manager;

	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recipe(int recipeId, String recipe,float recipeCost, Manager manager,String recipeImage) {
		super();
		this.recipeId = recipeId;
		this.recipe = recipe;
		this.manager = manager;
		this.recipeCost = recipeCost;
		this.recipeImage = recipeImage;
	}

	public Recipe(String recipe,float recipeCost, Manager manager,String recipeImage) {
		super();
		this.recipeId = recipeId;		
		this.recipe = recipe;
		this.recipeCost = recipeCost;
		this.manager = manager;
		this.recipeImage =recipeImage;
	}

	public String getRecipeImage() {
		return recipeImage;
	}

	public void setRecipeImage(String recipeImage) {
		this.recipeImage = recipeImage;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public float getRecipeCost() {
		return recipeCost;
	}

	public void setRecipeCost(float recipeCost) {
		this.recipeCost = recipeCost;
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipe=" + recipe + ", recipeCost=" + recipeCost + ", recipeImage="
				+ recipeImage + ", manager=" + manager + "]";
	}

	
}

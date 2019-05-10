package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Manager;
import com.ts.dto.Recipe;

public class RecipeDAO {

	private SessionFactory factory = null;
	
	
	public Recipe getRecipe(String RecipeN) {

		return (Recipe)HibernateTemplate.getObjectByUserName(RecipeN);
	}
	
	public int register(Recipe recipe) {
		return HibernateTemplate.addObject(recipe);
	}
	
	public static List<Recipe> getAllRecipes(int id) {
		
		List<Recipe> recipe = (List)HibernateTemplate.getObjectListByBranchId(id);
		
		System.out.println("Inside All recipes ..."+recipe);
		return recipe;	
	}

	public Recipe getRecipe(int id) {
		return (Recipe)HibernateTemplate.getObject(Recipe.class,id);
	}
	public int delRecipe(String delRecipe) {
		return HibernateTemplate.deleteObject(Recipe.class,delRecipe);
	}
	public int delRecipe(int id) {
		return HibernateTemplate.deleteObject(Recipe.class,id);
	}
	public int updateRecipe( Recipe recipe) {
		return HibernateTemplate.updateObject(recipe);
	}
	
}

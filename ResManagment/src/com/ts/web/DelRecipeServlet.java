package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.RecipeDAO;

@WebServlet("/DelRecipeServlet")
public class DelRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelRecipeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		int delRecipeById = Integer.parseInt(request.getParameter("id"));
	//	System.out.println("branch id is" + delRecipeById );
		RecipeDAO recipeDao = new RecipeDAO();
		recipeDao.delRecipe(delRecipeById);
		RequestDispatcher rd = request.getRequestDispatcher("GetRecipeDetailsServlet");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

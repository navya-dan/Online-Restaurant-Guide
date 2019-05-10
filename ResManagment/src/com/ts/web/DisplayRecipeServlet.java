package com.ts.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dao.ManagerDAO;
import com.ts.dao.RecipeDAO;
import com.ts.dao.ReviewDAO;
import com.ts.dao.UserDAO;
import com.ts.dto.Manager;
import com.ts.dto.Recipe;
import com.ts.dto.Reviews;
import com.ts.dto.User;


@WebServlet("/DisplayRecipeServlet")
public class DisplayRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayRecipeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Manager manager=ManagerDAO.getManager(id);
		List<Reviews> reviewsData=ReviewDAO.getAllReviews(id);
		HttpSession session = request.getSession(true);
		session.setAttribute("manager",manager);
		session.setAttribute("reviewsData",reviewsData);
		List<Recipe> arrayList = RecipeDAO.getAllRecipes(id);
        session.setAttribute("recipeData", arrayList);
         System.out.println("recipe data is" +arrayList);
      
         RequestDispatcher rd = request.getRequestDispatcher("DisplayRecipe.jsp");
	    	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

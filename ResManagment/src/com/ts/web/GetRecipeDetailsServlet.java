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

import com.ts.dao.RecipeDAO;
import com.ts.dto.Manager;
import com.ts.dto.Recipe;

@WebServlet("/GetRecipeDetailsServlet")
public class GetRecipeDetailsServlet extends HttpServlet {
       
   public GetRecipeDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		HttpSession session = request.getSession(true);
 		Manager manager = (Manager)session.getAttribute("manager");
		 int id = manager.getBranchId();
         List<Recipe> arrayList = RecipeDAO.getAllRecipes(id);
          request.setAttribute("recipeData", arrayList);
          System.out.println("Recipe data is" +arrayList);
         RequestDispatcher rd = request.getRequestDispatcher("ManagerHomePage.jsp");
	    	rd.forward(request, response);
          
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

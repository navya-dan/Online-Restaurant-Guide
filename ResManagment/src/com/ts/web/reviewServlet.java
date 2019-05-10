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

import com.ts.dao.ReviewDAO;
import com.ts.dto.Manager;
import com.ts.dto.Reviews;
import com.ts.dto.User;


@WebServlet("/reviewServlet")
public class reviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public reviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		 String comment=request.getParameter("comment");
		 int rating=Integer.parseInt(request.getParameter("rating"));
		 User user=(User)session.getAttribute("user");
		 Manager manager = (Manager)session.getAttribute("manager");
		 Reviews reviews=new Reviews(comment,rating,manager,user);
		 ReviewDAO reviewDao= new ReviewDAO();
		 reviewDao.register(reviews);
		List<Reviews> reviewsData=ReviewDAO.getAllReviews(manager.getBranchId());
		session.setAttribute("reviewsData",reviewsData);
		 RequestDispatcher rd = request.getRequestDispatcher("DisplayRecipe.jsp");
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

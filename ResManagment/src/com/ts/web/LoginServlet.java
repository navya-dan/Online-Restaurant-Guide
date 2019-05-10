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

import com.ts.dao.AdminDAO;
import com.ts.dao.ManagerDAO;
import com.ts.dao.UserDAO;
import com.ts.dto.Admin;
import com.ts.dto.Manager;
import com.ts.dto.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String accType = request.getParameter("accType");
		
		System.out.println("Durga"+accType);

		if(accType.equalsIgnoreCase("Admin")) {
			AdminDAO adminDao = new AdminDAO();
			Admin admin = adminDao.getAdmin(userName);
			//System.out.println("password:"+password);
			if(password.equals(admin.getPassword())) {
				session.setAttribute("admin",admin);
				System.out.println("inside loginServlet");
				RequestDispatcher rd = request.getRequestDispatcher("GetBranchDetailsServlet");
				rd.include(request, response);
			}
			else{

			}

		}
		else if(accType.equalsIgnoreCase("Manager")) {
			ManagerDAO managerDao = new ManagerDAO();
			Manager manager= managerDao.getManager(userName);
			
			if(password.equals(manager.getPassword())) {
				session.setAttribute("manager",manager);
				RequestDispatcher rd = request.getRequestDispatcher("GetRecipeDetailsServlet");
				rd.include(request, response);
			}
			
			else{

			}

		}
		
		else if(accType.equalsIgnoreCase("User")) {
			UserDAO userDao = new UserDAO();
			User user = userDao.getUser(userName);
			if(password.equals(user.getPassword())) {
				session.setAttribute("userId",user.getUserId());
				
		         List<Admin> arrayList = AdminDAO.getAllUsers();
		          request.setAttribute("RestaurantData", arrayList);
		          System.out.println("branch data is" +arrayList);
				
				RequestDispatcher rd = request.getRequestDispatcher("UserHomePage.jsp");
				rd.include(request, response);
			}
			else{

			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

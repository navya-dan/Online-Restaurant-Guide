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

import com.ts.dto.Admin;
import com.ts.dto.Manager;


@WebServlet("/AddBranchServlet")
public class AddBranchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBranchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String managerUserName =  request.getParameter("managerUserName");
		String password =  request.getParameter("password");
		String branch =  request.getParameter("branch");
		HttpSession session = request.getSession(true);
		Admin admin = (Admin)session.getAttribute("admin");
		Manager manager = new Manager(admin,managerUserName,password,branch); 
		ManagerDAO managerDao = new ManagerDAO();
		managerDao.register(manager);
		int id = admin.getRestaurantId();
		List<Manager> arrayList = ManagerDAO.getAllManagers(id);

		request.setAttribute("branchData", arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

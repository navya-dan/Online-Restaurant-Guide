package com.ts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.ManagerDAO;

@WebServlet("/DelBranchServlet")
public class DelBranchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelBranchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		int delBranchById = Integer.parseInt(request.getParameter("id"));
	//	System.out.println("branch id is" + delBranchById );
		ManagerDAO managerDao = new ManagerDAO();
		managerDao.delManager(delBranchById);
		RequestDispatcher rd = request.getRequestDispatcher("GetBranchDetailsServlet");
		rd.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

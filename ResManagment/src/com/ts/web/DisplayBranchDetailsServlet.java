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

@WebServlet("/DisplayBranchDetailsServlet")
public class DisplayBranchDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayBranchDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
 		int id=Integer.parseInt(request.getParameter("id"));
         List<Manager> arrayList = ManagerDAO.getAllManagers(id);
         session.setAttribute("branchData", arrayList);
          System.out.println("branch data is" +arrayList);
          RequestDispatcher rd = request.getRequestDispatcher("DisplayBranches.jsp");
	    	rd.forward(request, response);
	    	 
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.ts.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.ts.dao.AdminDAO;
import com.ts.dto.Admin;

@WebServlet("/AdminServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 20)

public class AdminServlet extends HttpServlet {

	public AdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminName = request.getParameter("adminName");
		String adminUserName = request.getParameter("adminUserName");
		String password = request.getParameter("password");
		String restaurantName = request.getParameter("restaurantName");
		String saveDir = "restaurants";
		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		String restaurantImage = fileName;
		Admin admin = new Admin(adminName,adminUserName,password,restaurantName,restaurantImage);
		AdminDAO adminDao = new AdminDAO();
		int x = adminDao.register(admin);
		if(x == 1)
			imageUpload(request, restaurantImage, saveDir);
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.forward(request, response);


	}

	private void imageUpload(HttpServletRequest request, String restaurantImage, String saveDir) throws IOException, ServletException {
		String savePath = "C:/Users/HARSHTTHA/Desktop/resp/ResManagment/WebContent/" + saveDir;		 

		File fileSaveDir = new File(savePath);

		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}

		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		System.out.println(fileName);

		// refines the fileName in case it is an absolute path
		fileName = new File(fileName).getName();
		
		System.out.println(fileName);
		part.write(savePath + "/" + fileName);
		System.out.print("File Uploaded Successfully ");

	}

	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}

}

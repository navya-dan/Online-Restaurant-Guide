package com.ts.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.ts.dao.RecipeDAO;
import com.ts.dto.Manager;
import com.ts.dto.Recipe;

@WebServlet("/AddRecipeServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 20)

public class AddRecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public AddRecipeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String recipeN =  request.getParameter("recipe");
		float recipeCost =  Float.parseFloat(request.getParameter("recipeCost"));
		String saveDir = "recipes";
		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		String recipeImage = fileName;

		HttpSession session = request.getSession(true);

		Manager manager = (Manager)session.getAttribute("manager");
		Recipe recipe = new  Recipe(recipeN,recipeCost,manager,recipeImage); 
		RecipeDAO recipeDao = new RecipeDAO();
		int x = recipeDao.register(recipe);
		if(x == 1)
			imageUpload(request, recipeImage, saveDir);
		int id = manager.getBranchId();
		List<Recipe> arrayList = RecipeDAO.getAllRecipes(id);
		request.setAttribute("recipeData", arrayList);
		System.out.println("Recipe data is" +arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("ManagerHomePage.jsp");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

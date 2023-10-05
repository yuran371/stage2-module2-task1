package com.example.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.User;
import com.example.Warehouse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/jsp/add.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		User userUser = new User (firstName, lastName);
//		Warehouse.getInstance().addUser(userUser);
		req.setAttribute("user", userUser);
		req.getRequestDispatcher("/jsp/add.jsp").forward(req, resp);
	}	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}

package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.User;
import com.example.Warehouse;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

@WebServlet("/remove")
public class RemoveUserServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/remove.jsp");	
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		User userUser = new User (firstname, lastname); //здесь создается новый объект, не получится удалить
		
		req.getAttribute("user", userUser); // Над овытащить нужный объект из Hashset и удалить его оттуда
		
		Warehouse warehouse = Warehouse.getInstance();	
		warehouse.removeUser(userUser);
		req.setAttribute("userR", userUser);
		doGet(req, resp);
		
//		if (warehouse.getUsers().contains(userUser)) {
//			warehouse.removeUser(userUser);
//			req.setAttribute("userR", userUser);
//			doGet(req, resp);
//		} else  {
//			req.setAttribute("userR", null);
//			doGet(req, resp);
//		} 
		
		
		
			
//		if (warehouse.getUsers().contains(userUser)) {
//			warehouse.removeUser(userUser);
//			req.setAttribute("userR", userUser);
//			doGet(req, resp);
//		} else if (warehouse.getUsers().isEmpty()) {
//			req.setAttribute("userR", null);
//			doGet(req, resp);
//		} else {
//			req.setAttribute("u1", "User not found");
//			doGet(req, resp);
//		}
	}
}

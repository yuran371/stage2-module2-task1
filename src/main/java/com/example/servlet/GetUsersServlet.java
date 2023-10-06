package com.example.servlet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.User;
import com.example.Warehouse;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Warehouse warehouse = Warehouse.getInstance();
		Set<User> users = warehouse.getUsers();
		req.setAttribute("users", users);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/users.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
}

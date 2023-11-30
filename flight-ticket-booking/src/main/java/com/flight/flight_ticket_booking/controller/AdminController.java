package com.flight.flight_ticket_booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.flight_ticket_booking.dao.AdminDao;
import com.flight.flight_ticket_booking.dto.Admin;

@WebServlet("/loginAdmin")
public class AdminController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		AdminDao adminDao=new AdminDao();
		
		Admin admin=adminDao.getAdminByEmail(email);
		
		if (admin!=null) {
			if (admin.getPassword().equals(password)) {
				session.setAttribute("adminEmail", admin.getEmail());
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("admin-add-flight.jsp");
				requestDispatcher.forward(req, resp);
			}else {
				req.setAttribute("invalidPassword", "Invalid Password");
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("admin-login.jsp");
				requestDispatcher.forward(req, resp);
			}
		}else {
			req.setAttribute("invalidEmail", "Invalid Email");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("admin-login.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
}

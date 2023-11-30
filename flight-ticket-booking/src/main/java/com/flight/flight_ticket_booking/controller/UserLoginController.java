package com.flight.flight_ticket_booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.flight_ticket_booking.dto.User;
import com.flight.flight_ticket_booking.service.UserService;

@WebServlet("/userLogin")
public class UserLoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserService userService = new UserService();

		User user = userService.getUserByEmail(email);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				session.setAttribute("userEmail", user.getEmail());
				RequestDispatcher dispatcher = req.getRequestDispatcher("user-home.jsp");
				dispatcher.forward(req, resp);

			} else {
				session.setAttribute("invalidPassword", "Invalid Password");
				RequestDispatcher dispatcher = req.getRequestDispatcher("user-login-form.jsp");
				dispatcher.forward(req, resp);
			}
		} else {
			session.setAttribute("invalidEmail", "Invalid Email");
			RequestDispatcher dispatcher = req.getRequestDispatcher("user-login-form.jsp");
			dispatcher.forward(req, resp);
		}
	}

}

package com.flight.flight_ticket_booking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.flight_ticket_booking.dto.User;
import com.flight.flight_ticket_booking.service.UserService;

@WebServlet("/userRegister")
public class UserRegisterController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		String confirmPassword = req.getParameter("confirmPassword");

		User user = new User();

		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);

		UserService userService = new UserService();
		if (password.equals(confirmPassword)) {
			userService.saveUser(user);
			RequestDispatcher dispatcher = req.getRequestDispatcher("user-login-form.jsp");
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("msg", "mismatch-password");
			RequestDispatcher dispatcher=req.getRequestDispatcher("user-registeration.jsp");
			dispatcher.forward(req, resp);
		}

	}
}

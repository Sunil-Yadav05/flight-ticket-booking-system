package com.flight.flight_ticket_booking.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flight.flight_ticket_booking.service.AdminAddFlightService;

@WebServlet("/deleteFlight")
public class FlightDeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		int flightNumber=Integer.parseInt(req.getParameter("flightNumber"));
		
		AdminAddFlightService service=new AdminAddFlightService();
		
		service.deleteFlight(flightNumber);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("admin-flight-details.jsp");
		dispatcher.forward(req, resp);
		
	}
}

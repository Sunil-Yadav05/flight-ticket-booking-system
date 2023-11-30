package com.flight.flight_ticket_booking.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flight.flight_ticket_booking.dto.AdminAddFlight;
import com.flight.flight_ticket_booking.service.AdminAddFlightService;

@WebServlet("/adminAddFlight")
public class AdminAddFlightController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

		AdminAddFlightService service = new AdminAddFlightService();
		AdminAddFlight addFlight = new AdminAddFlight();

		int flightNumber = Integer.parseInt(req.getParameter("flightNumber"));
		String flightName=req.getParameter("flightName");
		String source = req.getParameter("source");
		String destination = req.getParameter("desitnation");
		String departureTime = req.getParameter("departureTime");
		String arrivalTime = req.getParameter("arrivalTime");
		double economyTicketPrice = Double.parseDouble(req.getParameter("economyTicketPrice"));
		double businessTicketPrice = Double.parseDouble(req.getParameter("businessTicketPrice"));

		DateFormat dateFormat = new SimpleDateFormat("HH:mm");

		Time atime = null;
		Time dtime = null;

		try {
			dtime = new Time(dateFormat.parse(departureTime).getTime());
			atime = new Time(dateFormat.parse(arrivalTime).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addFlight.setFlightNumber(flightNumber);
		addFlight.setFlightName(flightName);
		addFlight.setFlightSource(source);
		addFlight.setFlightDestination(destination);
		addFlight.setDepartureTime(dtime);
		addFlight.setArrivalTime(atime);
		addFlight.setFlightEcomnomyPrice(economyTicketPrice);
		addFlight.setFlightbusinessPrice(businessTicketPrice);

		service.addAdminFlight(addFlight);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("admin-add-flight.jsp");
		dispatcher.forward(req, resp);

	}
}

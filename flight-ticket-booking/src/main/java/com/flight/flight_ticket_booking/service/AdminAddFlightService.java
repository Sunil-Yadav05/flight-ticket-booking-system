package com.flight.flight_ticket_booking.service;

import java.util.List;

import com.flight.flight_ticket_booking.dao.AdminAddFlightDao;
import com.flight.flight_ticket_booking.dto.AdminAddFlight;

public class AdminAddFlightService {

	AdminAddFlightDao dao = new AdminAddFlightDao();

	/*
	 * addFlight
	 */
	public AdminAddFlight addAdminFlight(AdminAddFlight addFlight) {

		return dao.addAdminFlight(addFlight);
	}

	/*
	 * getAllFlight
	 */
	public List<AdminAddFlight> getAllFlight() {

		return dao.getAllFlight();
	}

	/*
	 * Delete Flight method
	 */
	public int deleteFlight(int flightNumber) {
		
		return dao.deleteFlight(flightNumber);
	}
}

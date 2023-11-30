package com.flight.flight_ticket_booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flight.flight_ticket_booking.connection.FlightConnection;
import com.flight.flight_ticket_booking.dto.AdminAddFlight;

public class AdminAddFlightDao {

	Connection connection = FlightConnection.getFlightConnection();

	/*
	 * addFlight
	 */
	public AdminAddFlight addAdminFlight(AdminAddFlight addFlight) {

		String addFlightQuery = "insert into flightdetails values(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(addFlightQuery);

			preparedStatement.setInt(1, addFlight.getFlightNumber());
			preparedStatement.setString(2, addFlight.getFlightName());
			preparedStatement.setString(3, addFlight.getFlightSource());
			preparedStatement.setString(4, addFlight.getFlightDestination());
			preparedStatement.setTime(5, addFlight.getDepartureTime());
			preparedStatement.setTime(6, addFlight.getArrivalTime());
			preparedStatement.setDouble(7, addFlight.getFlightEcomnomyPrice());
			preparedStatement.setDouble(8, addFlight.getFlightbusinessPrice());

			preparedStatement.execute();

			return addFlight;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/*
	 * getAllFlight
	 */
	public List<AdminAddFlight> getAllFlight() {

		String displayAllFlight = "select * from flightdetails";

		List<AdminAddFlight> addFlights = new ArrayList<AdminAddFlight>();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayAllFlight);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				AdminAddFlight addFlight = new AdminAddFlight();

				addFlight.setFlightNumber(resultSet.getInt("flightnumber"));
				addFlight.setFlightName(resultSet.getString("flightname"));
				addFlight.setFlightSource(resultSet.getString("source"));
				addFlight.setFlightDestination(resultSet.getString("destination"));
				addFlight.setDepartureTime(resultSet.getTime("departure"));
				addFlight.setArrivalTime(resultSet.getTime("arrival"));
				addFlight.setFlightEcomnomyPrice(resultSet.getDouble("economyprice"));
				addFlight.setFlightbusinessPrice(resultSet.getDouble("businessprice"));

				addFlights.add(addFlight);
			}
			return addFlights;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/*
	 * Delete Flight method
	 */
	public int deleteFlight(int flightNumber) {
		connection = FlightConnection.getFlightConnection();

		String delteQuery = "delete from flightdetails where flightnumber=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(delteQuery);

			preparedStatement.setInt(1, flightNumber);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}

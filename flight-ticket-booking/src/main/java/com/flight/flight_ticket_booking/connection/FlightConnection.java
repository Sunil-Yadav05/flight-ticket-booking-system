package com.flight.flight_ticket_booking.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlightConnection {

	public static Connection getFlightConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/flight-ticket-booking";
			String user="root";
			String pass="root";
			
			Connection connection=DriverManager.getConnection(url, user, pass);
			
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

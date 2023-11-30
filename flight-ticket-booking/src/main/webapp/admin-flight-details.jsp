<%@page import="com.flight.flight_ticket_booking.dto.AdminAddFlight"%>
<%@page import="java.util.List"%>
<%@page import="com.flight.flight_ticket_booking.dao.AdminAddFlightDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@500&family=Ysabeau+SC:wght@300&display=swap');
	th{
		font-family: 'Quicksand', sans-serif;
		font-family: 'Ysabeau SC', sans-serif;
	}
</style>
</head>
<body>
	<%
		AdminAddFlightDao addFlightDao=new AdminAddFlightDao();
	
		List<AdminAddFlight> addFlights=addFlightDao.getAllFlight();
	%>
	<div>
		<table border="1px" style=" width:100vw;">
			<tr style="background-color:black; color:white;'">
				<th>Image</th>
				<th>FlightNumber</th>
				<th>FlightName</th>
				<th>Source</th>
				<th>Destination</th>
				<th>DepartureTime</th>
				<th>ArrivalTime</th>
				<th>EconomyPrice</th>
				<th>BusinessPrice</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<%
				for(AdminAddFlight addFlight:addFlights){
			%>
			<% if(addFlight.getFlightName().equalsIgnoreCase("indigo")) {%>
			<tr>
				<td><img alt="Indigo" src="https://seekvectorlogo.com/wp-content/uploads/2022/01/indigo-vector-logo-2022.png" width="150px" height="50px"></td>
				<td><%= addFlight.getFlightNumber() %></td>
				<td><%= addFlight.getFlightName() %></td>
				<td><%= addFlight.getFlightSource() %></td>
				<td><%= addFlight.getFlightDestination() %></td>
				<td><%= addFlight.getDepartureTime()%></td>
				<td><%= addFlight.getArrivalTime() %></td>
				<td><%= addFlight.getFlightEcomnomyPrice()%></td>
				<td><%= addFlight.getFlightbusinessPrice()%></td>
				<td><a
					href="deleteFlight?flightNumber=<%= addFlight.getFlightNumber()%>"><button style="color:red;">DELETE</button></a></td>
				<td><a
					href="update-flight.jsp?flightNumber=<%= addFlight.getFlightNumber()%>"><button style="color:green;">EDIT</button></a></td>

			</tr>
			<%}%>
			<%}	%>
		</table>
	</div>
</body>
</html>
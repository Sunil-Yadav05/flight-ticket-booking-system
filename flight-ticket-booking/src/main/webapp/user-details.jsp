<%@page import="com.flight.flight_ticket_booking.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="com.flight.flight_ticket_booking.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=Quicksand:wght@500&family=Ysabeau+SC:wght@300&display=swap')
	;

.top-head{
	font-family: 'Quicksand', sans-serif;
	font-family: 'Ysabeau SC', sans-serif;
	font-size: 30px;
	text-align: center;
}
</style>
</head>
<body>
	<%
	UserDao userDao = new UserDao();
	List<User> users = userDao.getAllUser();
	%>
	<jsp:include page="admin-navbar.jsp"/>
	<div class="top-head">
		<span> User Details</span>
	</div>
	<div>
		<table border="2px"
			style="width: 100vw; text-align: center;">
			<tr style="background-color: black; color: white;'">
				<th>Id</th>
				<th>UserName</th>
				<th>UserEmail</th>
				<th>Password</th>
				<th>Delete</th>
			</tr>
			<%
			for (User user : users) {
			%>
			<tr>
				<td><%=user.getId()%></td>
				<td><%=user.getName()%></td>
				<td><%=user.getEmail()%></td>
				<td><%=user.getPassword()%></td>
				<td><a href="update-user.jsp?id=<%=user.getId()%>"><button
							style="color: green;">Delete</button></a></td>

			</tr>
			<%
			}
			%>
		</table>
	</div>



</body>
</html>
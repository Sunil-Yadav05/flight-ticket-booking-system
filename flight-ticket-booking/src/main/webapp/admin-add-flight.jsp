
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
@media ( min-width :767px) {
	.registration {
		max-width: 400px;
	}
	.flight {
			background-image:
			url("https://images.unsplash.com/photo-1529074963764-98f45c47344b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YWVyb3BsYW5lfGVufDB8fDB8fHww&w=1000&q=80");
			background-repeat: no-repeat;
			background-size: cover;
	}
	.w-100{
		/* background-color: rgba(255, 255, 255, 0.2); */
		padding : 50px;
	}
}
</style>
</head>
<body class="flight">
	<jsp:include page="admin-navbar.jsp"></jsp:include>
	<div class="container">
		<div class="registration mx-auto d-block w-100">
			<div class="page-header text-center">
				<h1 class="text-white font-weight-bold">Add Flight Here</h1>
			</div>

			<form  action="adminAddFlight" method="post"
				class="form-validate form-horizontal well"
				>
				<fieldset>

					<div class="form-group">
						<label for="exampleInputPassword1 text-white">Flight Number</label> <input
							type="number" class="form-control" id="exampleInputPassword1"
							name="flightNumber">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1 text-white">Flight Name</label> <input
							type="text" class="form-control" id="exampleInputPassword1"
							name="flightName">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1">Source</label> <input
							type="text" class="form-control" id="exampleInputPassword1"
							name="source">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Destination</label> <input
							type="text" class="form-control" id="exampleInputPassword1"
							name="desitnation">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Departure Time</label> <input
							type="time" class="form-control" id="exampleInputPassword1"
							name="departureTime">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Arrival Time</label> <input type="time"
							class="form-control" id="exampleInputPassword1" name="arrivalTime">
					</div>
		
					<div class="form-group">
						<label for="exampleInputPassword1">Flight Economy Ticket Price</label> <input type="number"
							class="form-control" id="exampleInputPassword1" name="economyTicketPrice">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1">Flight Business Ticket Price</label> <input type="number"
							class="form-control" id="exampleInputPassword1" name="businessTicketPrice">
					</div>
					<!-- <div class="form-group">
						<label for="exampleInputPassword1" for="flight" >Flight Type</label> 
						<select name="flightType" id="flight" name="ticketClass">
							<option >-Select-</option>
							<option value="Commercial">Commercial</option>
							<option value="Business">Business</option>
						</select>	
						
					</div> -->
					<div class="d-flex justify-content-between align-items-center">
						<div class="form-group d-flex justify-content-start">
							<button type="submit" class="btn btn-primary">Add Flight</button>
						</div>
						<div class="form-check form-group d-flex justify-content-end">
							<a href="#">Sign in instead</a>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
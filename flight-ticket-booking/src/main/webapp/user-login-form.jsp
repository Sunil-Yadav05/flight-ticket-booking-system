<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="css/style.css">
<!-- MDB -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.js"></script>

<style type="text/css">
.divider:after, .divider:before {
	content: "";
	flex: 1;
	height: 1px;
	background: #eee;
}
</style>

</head>
<body>
	<%
	String email = (String) request.getAttribute("invalidEmail");
	String password = (String) request.getAttribute("invalidPassword");
	%>
	
	
	<section class="vh-100">
	
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<form action="userLogin" method="post">
						<!-- Email input -->
						<center>
							<h4>User Login</h4>
						</center>
						<%
						if (email != null) {
						%>

						<h6 style="color: red"><%=email%></h6>

						<%
						}
						%>
						<div class="form-outline mb-4">
							<input type="email" id="form1Example13"
								class="form-control form-control-lg" name="email" /> <label
								class="form-label" for="form1Example13">Email address</label>
						</div>

						<!-- Password input -->
						<%
						if (password != null) {
						%>

						<h6 style="color: red"><%=password%></h6>

						<%
						}
						%>
						<div class="form-outline mb-4">
							<input type="password" id="form1Example23"
								class="form-control form-control-lg" name="password" /> <label
								class="form-label" for="form1Example23">Password</label>
						</div>

						<div class="d-flex justify-content-around align-items-center mb-4">
							<!-- Checkbox -->
							<label class="form-check-label" for="form1Example3"> Not
								a member &nbsp;<a href="user-registeration.jsp">Sign Up</a>
							</label>
						</div>

						<!-- Submit button -->
						<button type="submit" class="btn btn-primary btn-lg btn-block">Sign
							in</button>


					</form>
				</div>
			</div>
		</div>
	</section>

</body>
</html>
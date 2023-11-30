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
  rel="stylesheet"
/>
<!-- Google Fonts -->
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.css"
  rel="stylesheet"
/>
<style type="text/css">
		.nav-link{
			margin-top:5px;
			font-size:15px;
		}	
		.navbar-brand{
			font-size:25px;
			}
		 .nav-link:hover{
		
		padding: -10px;
		border-bottom:2px solid white;
	{
}
</style>
</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-light " style="background-color:rgba(0, 0, 0, 1);">
  <div class="container-fluid">
    <a class="navbar-brand text-white" href="user-home.jsp">Flight Ticket Booking</a>
    <button
      class="navbar-toggler"
      type="button"
      data-mdb-toggle="collapse"
      data-mdb-target="#navbarNavAltMarkup"
      aria-controls="navbarNavAltMarkup"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <i class="fas fa-bars"></i>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active text-white" aria-current="page" href="user-home.jsp">Home</a>
        <a class="nav-link text-white" href="#">Flight Booking Details</a>
        <a class="nav-link text-white" href="userLogout">Logout</a>
        
      </div>
    </div>
  </div>
</nav>

</body>
</html>
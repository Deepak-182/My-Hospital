<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<%
response.setHeader("cache-control", "no-store");
response.setHeader("pragma", "no-cache");
response.setHeader("expire", "0");
%>
<body>
	<%@include file="bootstrap.jsp"%>

	<nav class="navbar navbar-expand-lg bg-dark"
		style="background-color: #e0024F;">
		<a class="navbar-brand" href="adminHeader.jsp"> <img
			src="img/plus.jpg" width="30" height="30" alt=""></a> <a
			class="navbar-brand" href="adminHome.jsp"><span
			class="btn btn-outline-light">ADMIN HOME</span> </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="patientRegister.jsp"><span class="btn btn-outline-light">PATIENT
							REGISTRATION</span> <span class="sr-only">(current)</span> </a></li>
				<li class="nav-item active"><a class="nav-link"
					href="patientDetail"> <span class="btn btn-outline-light">PATIENT
							DETAILS</span> <span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<a href="logOutCtrl" class="btn btn-danger my-2 my-sm-0">LOGOUT</a>
			</form>
		</div>
	</nav>

</body>
</html>
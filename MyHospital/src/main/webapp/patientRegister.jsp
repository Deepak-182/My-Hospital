<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<%@include file="bootstrap.jsp"%>
<%@include file="adminHeader.jsp"%>
<body>
	<br>
	<div class="container">
		<%
		String user = (String) session.getAttribute("USER");
		if (user != null) {
			out.print("<h2> Welcome " + user + "</h2>");
		} else
			response.sendRedirect("login.jsp");
		%>
		<h1 style="color: green;">login succesfull</h1>

		<h2>Patient Registration</h2>
		<%
		String m = (String) request.getAttribute("msg");
		if (m != null)
			out.print("<h2 style='color:blue;'>" + m + " </h2>");
		%>
	</div>

	<form action="patientRegistrationCtrl" method="post"
		class="container jumbotron">
		<div class="form-group">
			<label for="exampleInputEmail1">NAME</label> <input type="text"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="pname">
		</div>
		<div class="form-group">

			GENDER :
			<div class="form-check">
				<input class="form-check-input" type="radio" id="exampleRadios1"
					value="male" name="gender"> <label class="form-check-label"
					for="exampleRadios1"> MALE</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="exampleRadios2" value="female"> <label
					class="form-check-label" for="exampleRadios2"> FEMALE </label>
			</div>
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">AGE</label> <input type="number"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="age">
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">DISEASE</label> <input type="text"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="disease">
		</div>
		<div class="form-group">
			BLOOD GROUP <select class="form-control" name="bloodGroup">
				<option value="A+">A+</option>
				<option value="A-">A-</option>
				<option value="B+">B+</option>
				<option value="B-">B-</option>
				<option value="O+">O+</option>
				<option value="O-">O-</option>
				<option value="AB+">AB+</option>
				<option value="AB-">AB-</option>
			</select>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">MOBILE</label> <input type="text"
				class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="mobile">
		</div>
		<button type="submit" class="btn btn-primary">REGISTER</button>
	</form>


</body>
</html>
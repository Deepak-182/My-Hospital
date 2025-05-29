<%@page import="city.dto.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<%@include file="adminHeader.jsp"%>
<body>

	<%
	Patient p = (Patient) request.getAttribute("PTN");
	%>
	<div class="container">
		<h2>Patient Updation</h2>
		<form action="patientUpdateCtrl" method="post"
			class="container jumbotron">


			<div class="form-group">
				<label for="exampleInputEmail1">ID</label> <input type="text"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="id" value="<%=p.getPid()%>"
					readonly="readonly">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">NAME</label> <input type="text"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="pname" value="<%=p.getName()%>">
			</div>
			<div class="form-group">

				GENDER :
				<div class="form-check">
					<input class="form-check-input" type="radio" id="exampleRadios1"
						value="male" name="gender"> <label
						class="form-check-label" for="exampleRadios1"> MALE</label>
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
					aria-describedby="emailHelp" name="age" value="<%=p.getAge()%>">
			</div>

			<div class="form-group">
				<label for="exampleInputEmail1">DISEASE</label> <input type="text"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="disease"
					value="<%=p.getDisease()%>">
			</div>
			<div class="form-group">
				BLOOD GROUP <select class="form-control" name="bloodGroup"
					value="<%=p.getBloodGroup()%>">
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
					aria-describedby="emailHelp" name="mobile"
					value="<%=p.getMobile()%>">
			</div>
			<button type="submit" class="btn btn-primary">UPDATE</button>
		</form>
	</div>

</body>
</html>
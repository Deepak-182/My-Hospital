<%@page import="city.dto.Patient"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient details</title>
</head>
<%@include file="adminHeader.jsp"%>
<body>

	<%
	ArrayList<Patient> li = (ArrayList<Patient>) request.getAttribute("LIST");
	String m = (String) request.getAttribute("msg");
	%>
	<div class="container jumbotron">
		<%
		String user = (String) session.getAttribute("USER");
		if (user != null) {
			out.print("<h2> Welcome " + user +"</h2>");
		} else
			response.sendRedirect("login.jsp");
		%>
		<h1 style="color: green; style="text-align: center;">login succesfull</h1>

		<h2>
			PATIENT DETAILS
			<%
		if (m != null) {
			out.println(m);
		}
		%>
		</h2>
		<table class="table" border="2">
			<thead class="thead thead-dark">
				<th>ID</th>
				<th>NAME</th>
				<th>AGE</th>
				<th>GENDER</th>
				<th>DISEASE</th>
				<th>BLOOD GROUP</th>
				<th>MOBILE</th>
				<th>DELETION</th>
				<th>UPDATION</th>
			</thead>
			<%
			for (Patient p : li) {
			%>
			<tr>
				<td><%=p.getPid()%></td>
				<td><%=p.getName()%></td>
				<td><%=p.getAge()%></td>
				<td><%=p.getGender()%></td>
				<td><%=p.getDisease()%></td>
				<td><%=p.getBloodGroup()%></td>
				<td><%=p.getMobile()%></td>
				<td><a href="patientDeletCtrl?id=<%=p.getPid()%>"
					class="btn btn-danger container"
					onclick="return confirm('Are You Sure To Delete This Record?')">DELETE</a></td>
				<td><a href="patientUpdateCtrl?id=<%=p.getPid()%>"
					class="btn btn-primary container">EDIT</a></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>


</body>
</html>
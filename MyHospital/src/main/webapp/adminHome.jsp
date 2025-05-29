<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin home</title>
</head>
<%@include file="adminHeader.jsp"%>
<body>
	<%
	String user = (String) session.getAttribute("USER");
	if (user != null) 
		out.print("<h2> Welcome " + user + "</h2>");
	
	else
		response.sendRedirect("login.jsp");
	%>
	<h1 style="color: green;">login succesfull</h1>

</body>
</html>
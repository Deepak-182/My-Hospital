<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<%@include file="frontHeader.jsp"%>
	<br>
	<br>
	<% String m= (String) request.getAttribute("msg");
	if(m != null){
	%>
	<h6 class=" container" style="color: red;">
	<%=m%>
	</h6>
    <%
	}
	%>
	<div class="jumbotron container">
		<form action="LoginCheckCtr" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">USER NAME</label> <input type="text"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="uname">

			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1" name="pwd">
			</div>

           <button  type="submit" class="btn btn-primary"> LOGIN </button>
		</form>
	</div>
</body>
</html>
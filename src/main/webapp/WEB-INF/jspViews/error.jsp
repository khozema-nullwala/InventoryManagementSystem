<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet" />
<title>Error</title>
</head>
<body>
<div class="container">
		<h1>Inventory Management System</h1>
<div class="navbar">
  <a class="active" href="welcome.html"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a  href="index.jsp"><i class="fa fa-fw fa-user"></i> Logout</a>
</div>
<h2 align="center">${errMsg}</h2>
</div>

<div class="terms1">
  <p align="center" style="font-family: calibri;color: #6666CC;">Copyright &#169; 2018 Accenture All Rights Reserved.</p>
</div>
</body>
</html>
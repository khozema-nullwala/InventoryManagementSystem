<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${contextRoot}/resources/css/style.css" rel="stylesheet" />
<title>Error</title>
</head>
<body>
	<div class="container">
		<h1>Inventory Management System</h1>
		<div class="navbar">
			<a class="active" href="${contextRoot}/index.jsp">Home</a>
			<%-- <a  href="${contextRoot}/index.jsp">Logout</a> --%>
		</div>
		<h2 align="center">${errMsg}</h2>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>
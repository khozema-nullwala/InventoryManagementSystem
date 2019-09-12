<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html>
<head>
<link href="${contextRoot}/resources/css/style.css"
	rel="stylesheet" />
<meta name="viewport" content="width=auto, initial-scale=1">

</head>
<body>
	<div class="container">
		<h1>Inventory Management System</h1>
		<div class="navbar">
			<a href="#">Home</a>
<%-- 			<a href="${contextRoot}/login.html">Login</a>			
 --%>			
 			<a href="${contextRoot}/purchaseEntry.html">Inventory Management System</a>
		</div>
		<h1>Problem Statement</h1>

		<p>ABC, a company needs an application to manage their inventory
			details. This application focuses on purchasing various materials
			needed from vendors and maintains their payment due history as they
			may pay the total amount of the materials purchased as partial. This
			application helps to generate reports on:</p>
			
		<ul>
			<li>Showing relevant details on date wise materials purchased
				for all vendors.</li>
			<li>Showing relevant details of the materials purchased based on
				the selected vendor, additionally the user may filter the report by
				specifying From and To dates.</li>
			<li>Showing relevant details of the payment history of a
				particular vendor between From and To Dates on the basis of :
				<ul>
					<li>balance pending, fully paid or overpaid status on the materials purchased,</li>
					<li>Specific purchase id</li>					
				</ul>
			</li>
		</ul>
	</div>
	<div class="terms1">
		<p align="center" style="font-family: calibri; color: #6666CC;">Copyright &#169; 2018 Accenture All Rights Reserved.</p>
	</div>
</body>
</html>

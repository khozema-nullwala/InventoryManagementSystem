<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="${contextRoot}/resources/css/style.css" rel="stylesheet" />
<script type="text/javascript"
	src="${contextRoot}/resources/js/datetimepicker.js"></script>
<title>Purchase Entry</title>
</head>
<body>
	<%@ include file="include.jsp"%>

	<f:form name="form1" modelAttribute="purchaseBean" method="POST"
		action="${contextRoot}/purchaseEntry.html">
		<table class="bodycontainer">
			<tr>
				<td><label>Vendor name</label></td>
				<td><f:select path="vendorName" id="vendorName">
						<f:option label="--Select--" value="" />
						<f:options items="${vendorList}" itemValue="vendorName"
							itemLabel="vendorName" />
					</f:select></td>
				<td><f:errors path="vendorName" cssClass="error" /></td>
			</tr>

			<!-- Rest of the code here -->

			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Submit" /></td>
			</tr>
		</table>
	</f:form>

	<%@ include file="footer.jsp"%>

</body>
</html>
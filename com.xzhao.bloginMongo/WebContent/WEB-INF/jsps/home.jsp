<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<title>Insert title here</title>
</head>
<body>
	<h3>Hello from home</h3>

	<table id="formtable">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>email</th>
		</tr>

		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.firstname}</td>
				<td>${user.lastname}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
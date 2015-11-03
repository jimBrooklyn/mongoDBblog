<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
</head>

<body>
	<h2>All of Your Posts </h2>

		<c:forEach var="post" items="${posts}">

				Subject: <c:out value="${post.subject}"></c:out><br>				
				Posted On: <c:out value="${post.time}"></c:out><br>
				Content: <td><c:out value="${post.content}"></c:out>
				<p></p>
		</c:forEach>

</body>

</html>
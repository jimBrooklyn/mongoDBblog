<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/script/jquery.js">
	
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
</head>
<body>
	<h4>Create a new post from here.</h4>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate"
		commandName="post">

		<table>

			<tr>
				<td >Subject:</td>
				<td ><input name="subject" type="text" size="60" value="subject"></td>
			</tr>

			<tr>
				<td>Content:</td>
				<td><textarea name="content" cols="86" rows="20">Start your content here...</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit your new post"></td>
			</tr>

		</table>

	</sf:form>

</body>
</html>
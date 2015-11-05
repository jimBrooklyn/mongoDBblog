<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/script/jquery.js">	
</script>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />
<script>
		function onload() {
			$("#hideform").click(function(){
			    $(".commentform").toggle();
			});
			
			$(".commentform").hide();
		}	
		
		$(document).ready(onload);

</script>
	
</head>

<body>
	<h2 style="text-align:center">Welcome to my Blog space</h2>

	<c:forEach var="post" items="${posts}">
		<p class="title">
			Title:
			<c:out value="${post.title}"></c:out>
		</p>
		<p class="date">
			Posted On:
			<c:out value="${post.date}"></c:out>
		</p>
		<div class="content">
			<c:out value="${post.content}"></c:out>
		</div>
		<p class="commentscount">
			comments (<span class="commentsnumber"><c:out value="${post.comments.size()}"/></span>)
		</p>
		<div class="comments">
			<c:forEach var="comment" items="${post.comments}">
				<p class="comment">
				<span style ="font-style:normal"> 	commented by:</span>	
				<c:out value="${comment.name}"></c:out> 
					&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 
					<span style ="font-style:normal"> On:</span>	
					<c:out value="${comment.date}"></c:out>
				</p>
				<div class="messgae">
					&nbsp; &nbsp;&nbsp;<c:out value="${comment.message}"></c:out>
				</div>
				
			</c:forEach>
		</div>
		
<p> <button id="hideform" style="background:none;border:none"><span style="font-weight: bold">Add your comment</span></button></p>	
	
		<sf:form class="commentform" method="post"
			action="${pageContext.request.contextPath}/sendcomment"
			commandName="comment">

			<input type="hidden" name="postId" value="${post.id}">

			<table id="comments">
				<tr>
					<td>Your name:</td>
					<td><sf:input path="name" name="name" type="text" /> <br />
						<sf:errors path="name" cssClass="error" />
				</tr>
				<tr>
					<td>Your comment:</td>
					<td><sf:textarea path="message" name="message" type="text" />
						<br /> <sf:errors path="message" cssClass="error" />
				</tr>
				<tr>
					<td><input type="submit" value="post your comment"></td>
				</tr>
			</table>
		</sf:form>
		<hr>

	</c:forEach>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hum...404</h1>
	<img src="<c:url value="/resource/images/404.png" />" 	alt="Not found page" />
	<br />
	<a href="${pageContext.request.contextPath}">Back to Home page</a>
</body>
</html>
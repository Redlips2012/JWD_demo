<%@include file="../common/taglib.jsp"%>

<%@page import="java.util.List"%>
<%-- <%@page import="java.net.http.HttpRequest"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@include file="../common/resource.jsp"%>

<title>Insert title here</title>
</head>
<body>
	<div class="row g-2">
		<div
			class="col-12 border border-2 border-start-0 border-end-0 border-top-0"
			style="background-color: #f8f8f8;">
			<!-- header -->
			<%@include file="Header.jsp"%>

		</div>
		<div class="col-3" style="height: 100vh; background-color: #f8f8f8;">
			<!-- menu -->
			<%@include file="Menu.jsp"%>
		</div>
		<div class="col-9">
			<!-- body -->
		</div>
	</div>

</body>

</html>
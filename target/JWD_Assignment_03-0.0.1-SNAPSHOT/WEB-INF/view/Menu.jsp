<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="template/paging/jquery.twbsPagination.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="input-group my-3 ">
		<form:form class ="d-flex">
		<!-- unfinish search -->
			<input type="text" class="form-control" placeholder="Search"
				aria-label="Username" aria-describedby="basic-addon1">
			<span class="input-group-text" id="basic-addon1 "><i
				class="fas fa-search"></i></span>
		</form:form>
	</div>
	<div class="input-group my-3 border ">
		<a name="" id="" class="btn btn-close-white w-100" href="${pageContext.request.contextPath}/ViewControl/content"
			role="button"><i class="fas fa-calendar-week"></i> View Content</a>
	</div>
	<div class="input-group my-3 border">
		<a name="" id="" class="btn btn-close-white w-100" href="${pageContext.request.contextPath}/form/add"
			role="button"><i class="fas fa-pen"></i> Form Content</a>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../common/resource.jsp"%>


</head>
<body>
	<div class="input-group my-3 w-100">
		<form class="d-flex"action="${pageContext.request.contextPath}/search" method="get">
			<!-- unfinish search -->
			<input type="text" name = "searchValue" class="form-control " placeholder="Search"
				aria-label="Username" aria-describedby="basic-addon1" />

			<button type="submit" class="btn btn-danger input-group-text"> <i
                            class="fas fa-search"></i></button>
		</form>
	</div>
	<div class="input-group my-3 border ">
		<a id="" class="btn btn-close-white w-100"
			href="${pageContext.request.contextPath}/ViewControl" role="button"><i
			class="fas fa-calendar-week"></i> View Content
			${pageContext.request.contextPath}</a>
	</div>
	<div class="input-group my-3 border">
		<a id="" class="btn btn-close-white w-100"
			href="${pageContext.request.contextPath}/form" role="button"><i
			class="fas fa-pen"></i> Form Content</a>
	</div>
</body>
</html>
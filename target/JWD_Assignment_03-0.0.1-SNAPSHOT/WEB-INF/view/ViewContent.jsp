<%@include file="/common/taglib.jsp"%>
<%@page import="java.util.List"%>
<%-- <%@page import="java.net.http.HttpRequest"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="resource/fontawesome-free-5.15.4-web/css/all.css">
<script src="resource/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resource/css/bootstrap.min.css" />
<script src="resource/jquery/code.jquery.com_jquery-3.7.0.js"></script>
<script src="resource/fontawesome-free-5.15.4-web/js/all.min.js"></script>
<script src="resource/js/popper.js"></script>
<script src="resource/loginDemo.js"></script>
<script
	src="resource/validate/cdn.jsdelivr.net_npm_jquery-validation@1.19.5_dist_jquery.validate.min.js"></script>
<script
	src='<c:url value="/common/template/paging/jquery.twbsPagination.js" />'
	type="text/javascript"></script>
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
			<div class=" border border-top-0 border-start-0 border-end-0 my-3">
				<span style="font-size: xx-large;">View Content</span>
			</div>
			<div class="bd-example">
				<form>
					<div class="border-3 py-2 px-2" style="background-color: #f5f5f5;">
						<span> View Content List</span>
					</div>
					<div class="bd-example">
						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Tilte</th>
									<th scope="col">Bref</th>
									<th scope="col">Create Date</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="content" items="${contentlist}" varStatus="status">
									<tr>
										<th scope="row">${content.getId()}</th>
										<td>${content.getTitle()}</td>
										<td>${content.getBrief()}</td>
										<td>${content.getCreatedDate()}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>

</html>
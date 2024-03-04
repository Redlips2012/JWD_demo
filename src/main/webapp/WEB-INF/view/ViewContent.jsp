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
									<th scope="col"></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="content" items="${contentlist}"
									varStatus="status">
									<tr>
										<th scope="row">${content.getId()}</th>
										<td>${content.getTitle()}</td>
										<td>${content.getBrief()}</td>
										<td>${content.getCreatedDate()}</td>
										<td>
											<div class="d-flex ">
												<a  id="" class="btn" href="update?id=${content.getId()}" role="button"><i
													class="fas fa-pen"></i> </a>
												<a  id="" class="btn " href="delete?id=${content.getId()}" role="button"><i class="fas fa-trash"></i></a>
											</div>
										</td>
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
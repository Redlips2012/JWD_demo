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
			<div class=" border border-top-0 border-start-0 border-end-0 my-3">
				<span style="font-size: xx-large;">Edit profile</span>
			</div>
			<div class="bd-example">
				<form:form action="${pageContext.request.contextPath}/memberUpdate"
					method="post" modelAttribute="memberUpdateDTO">
					<div class="border-3 py-2 px-2" style="background-color: #f5f5f5;">
						<span> profile form element</span>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">First
							Name</label>
						<form:input path="firstName" type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" />
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Last
							name</label>
						<form:input path="lastName" type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" />
					</div>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email
							address: ${member.getEmail()}</label>
					</div>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Phone</label>
						<form:input path="phone" type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" />
					</div>
					<div class="mb-3">
						<label for="" class="form-label">Description</label>
						<form:textarea path="description" class="form-control" name=""
							id="" rows="3" />
					</div>
					<button type="submit" class="btn border border-3">Submit</button>
					<button type="reset" class="btn border border-3">Reset</button>
				</form:form>
			</div>
		</div>
	</div>

</body>

</html>
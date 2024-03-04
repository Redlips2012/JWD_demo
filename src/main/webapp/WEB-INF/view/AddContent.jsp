<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@include file="../common/resource.jsp" %>
<title>Document</title>
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
				<span style="font-size: xx-large;">Add Content</span>
			</div>
			<div class="bd-example">
				<form:form action="${pageContext.request.contextPath}/save"
					method="post" modelAttribute="contentForm">
						<form:hidden path="id"/>
					<div class="border-3 py-2 px-2" style="background-color: #f5f5f5;">
						<span> Content form element</span>
					</div>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Tilte</label>
						<form:input type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" path="title" />
						<form:errors style="color: red;" path="title" />
					</div>
					<div class="mb-3">
						<label for="" class="form-label">Brief</label>
						<form:textarea path="brief" class="form-control" name="" id=""
							rows="2" />
						<form:errors style="color: red;" path="brief" />
					</div>
					<div class="mb-3">
						<label for="" class="form-label">Content</label>
						<form:textarea path="content" class="form-control" name="" id=""
							rows="5" />
						<form:errors style="color: red;" path="content" />
					</div>
					<form:button class="btn border border-3">Submit</form:button>
					<button type="reset" class="btn border border-3">Reset</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
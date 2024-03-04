 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../common/taglib.jsp"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- <link rel="stylesheet" href="Assignment6-2.css" /> -->
<title>Insert title here</title>
<%@include file="../common/resource.jsp" %>
</head>
<body>
	<div class="container">
		<section class="pb-4">
			<div class="bg-white border rounded-5">

				<section class="w-100 p-4 p-xl-5"
					style="background-color: #9A616D; border-radius: .5rem .5rem 0 0;">
					<div class="row d-flex justify-content-center">
						<div class="col-12">
							<div class="card" style="border-radius: 1rem;">
								<div class="row g-0">
									<div class="col-md-6 col-lg-5 d-none d-md-block">
										<img
											src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
											alt="login form" class="img-fluid"
											style="border-radius: 1rem 0 0 1rem;">
									</div>
									<div class="col-md-6 col-lg-7 d-flex align-items-center">
										<div class="card-body p-4 p-lg-5 text-black">

											<form:form
												action="${pageContext.request.contextPath}/SignUp/save"
												method="post" modelAttribute="NewMember">

												<div class="d-flex align-items-center mb-3 pb-1">
													<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
													<span class="h1 fw-bold mb-0">Logo</span>
												</div>

												<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign
													into your account</h5>


												<div class="form-outline mb-4">
													<form:input type="text"
														class="form-control form-control-lg"
														placeholder="User Name" path="userName" />
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 109.6px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>
												<div class="form-outline mb-4">
													<form:input type="email" id="form2Example17"
														class="form-control form-control-lg" placeholder="Email"
														path="email" />
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 109.6px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>
												<div class="form-outline mb-4">
													<form:input type="password" id="form2Example27"
														class="form-control form-control-lg"
														placeholder="Password" path="password" />
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 78.4px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>
												<div class="form-outline mb-4">
													<form:input type="password" id="form2Example27"
														class="form-control form-control-lg"
														placeholder="Re Password" path="rePassword" />
													<small name="rePassword-error" style="color: red;"></small>
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 78.4px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>

												<div class="pt-1 mb-4">
													<button class="btn btn-dark btn-lg btn-block" type="submit">SignUp</button>
												</div>
											</form:form>
											<p class="mb-5 pb-lg-2" style="color: #393f81;">
												Already have an account?	<a href="${pageContext.request.contextPath}/LoginPage" style="color: #393f81;">Login</a>
												</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</section>
	</div>






</body>

</html>
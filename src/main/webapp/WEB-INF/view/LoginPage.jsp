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
											<!-- form start here -->
											<form:form
												action="${pageContext.request.contextPath}/LoginPage"
												method="post" modelAttribute="memberCheck">
												<div class="d-flex align-items-center mb-3 pb-1">
													<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
													<span class="h1 fw-bold mb-0">Logo</span>
												</div>
												<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign

													into your account</h5>
												<div class="form-outline mb-4">
													<form:errors path="email" />
													<form:input type="email" id="form2Example17"
														class="form-control form-control-lg" path="email" />
													<label class="form-label" for="form2Example17"
														style="margin-left: 0px;">Email address</label>
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 109.6px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>

												<div class="form-outline mb-4">
													<form:errors path="password" />
													<form:input type="password" id="form2Example27"
														class="form-control form-control-lg" path="password" />
													<label class="form-label" for="form2Example27"
														style="margin-left: 0px;">Password</label>
													<div class="form-notch">
														<div class="form-notch-leading" style="width: 9px;"></div>
														<div class="form-notch-middle" style="width: 78.4px;"></div>
														<div class="form-notch-trailing"></div>
													</div>
												</div>

												<div class="pt-1 mb-4">
													<button class="btn btn-dark btn-lg btn-block" type="submit">Login</button>
												</div>
												<p class="mb-5 pb-lg-2" style="color: #393f81;">
													Don't have an account? <a
														href="${pageContext.request.contextPath}/SignUp"
														style="color: #393f81;">Register here</a>
												</p>
											</form:form>

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
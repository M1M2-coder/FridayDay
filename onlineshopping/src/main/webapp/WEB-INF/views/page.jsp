<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap THEME CSS -->
<link href="${css}/stylishTheme.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myStyles.css" rel="stylesheet">
	
	<script>
			window.menu = '${title}';
	</script>
</head>

<body>
	<div class="wrapper">

		<!--***************************  Navigation  Section ************************-->
		<%@include file="./shared/navbar.jsp"%>

		<!--***************************  Navigation  Section ************************-->


		<!--***************************  Page Content Section *********************** -->
		<div class="content">
			<!-- [-1-] Loads home.jsp Page ONLY IF user clicks Home -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- [-2-] Loads about.jsp  Page ONLY IF user clicks About Us -->
			<c:if test="${userClickAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- [-3-] Loads Contact.jsp Page ONLY IF user clicks Contact Us -->
			<c:if test="${userClickContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<!-- [-4-] Loads listProducts.jsp Page ONLY IF user clicks view products OR clicks category -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!--*************************** END Page Content Section ******************* -->



		<!-- ***************************  Footer Section ***************************** -->
		<%@include file="./shared/footer.jsp"%>

		<!-- ********************* END Footer Section ******************************* -->


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<!-- Custom JS page -->
		<script src="${js}/actOnClick.js"></script>
	</div>
</body>

</html>

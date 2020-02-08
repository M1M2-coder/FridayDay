<div class=container>

	<div class="row">

		<!-- Sidebar Column -->

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- Products Column -->
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
								<li><a href="${contextPath}/home">Home </a></li>
							
								<li class="active"><span class=" mg_left">/ All Products</span></li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts == true }">
							<ol class="breadcrumb">
									<li><a href="${contextPath}/home">Home  </a></li>
									<li class="active">/ Category</li>
									<li class="active">/  ${category.name}</li>
							</ol>
					</c:if>

				</div>
			</div>
		</div>
	</div>

</div>
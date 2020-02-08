<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4">MMM Shop</h1>
<div class="list-group">
		<c:forEach var="category" items="${categories}">
    		<a id="a_${category.name}" href="${contextPath}/show/category/${category.id}/products" class="list-group-item">${category.name}</a>
    	</c:forEach>
	 </div>
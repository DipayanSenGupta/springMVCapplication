
<%@ include file="header.jsp" %>

<div class="container">

<c:if test="${successMsg!=null}">
	<h2><c:out value="${successMsg}"></c:out></h2>

</c:if>

<br/>

<a href="getAllCustomer" type="button" class="btn btn-primary" >Get All Customer List</a>

<br/>
</div>
<%@ include file="footer.jsp" %>
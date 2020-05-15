<%@ include file="header.jsp" %>
<div class="container">

<table class="table table-hover">
<thead>
<tr class="table-primary">
<th scope="col">Customer ID</th>
<th scope="col">Customer Name</th>
<th scope="col">Customer NID</th>
<th scope="col">Customer Date of Birth</th>
<th scope="col">Customer Fathers Name</th>
<th scope="col">Customer Address</th>
<th scope="col">Customer Phone Number</th>
<th scope="col">Customer Account Number</th></tr></thead>
<tbody>
<tr>
	   <td> <c:out value="${customer.customId}"/></td>
        <td> <c:out value="${customer.customName}"/></td>  
        <td> <c:out value="${customer.customNID}"/> </td>
        <td> <c:out value="${customer.customDOB}"/> </td>
        <td> <c:out value="${customer.customFatherName}"/> </td>
        <td> <c:out value="${customer.customMotherName}"/> </td>
        <td> <c:out value="${customer.customAddr}"/> </td>
        <td> <c:out value="${customer.accountNum}"/> </td>
</tr>
</tbody>

</table>
<br/>

<form method="post" action="updateEmployee">
<input type="hidden" name="empId" value="${customerData.customId}" />
<input type="submit" value="Update Employee" class="btn btn-primary"/>
</form>

<br/>

<form action="deleteEmployee">
<input type="hidden" name="empId" value="${customerData.customId}" />
<input type="submit" value="Delete Employee" class="btn btn-primary"/>
</form>

</div>

<%@ include file="footer.jsp" %>
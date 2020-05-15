<%@ include file="header.jsp" %>
<div class="container">

<table class="table table-hover">
<thead>
<tr class="table-primary">
<th scope="col">ID</th>
<th scope="col">Name</th>
<th scope="col">NID</th>
<th scope="col">Date of Birth</th>
<th scope="col">Fathers Name</th>
<th scope="col">Address</th>
<th scope="col">Phone Number</th>
<th scope="col">Account Number</th>
<th scope="col">Account Balance</th>
</tr></thead>
<tbody>
<tr>
	   <td> <c:out value="${customerData.customId}"/></td>
        <td> <c:out value="${customerData.customName}"/></td>  
        <td> <c:out value="${customerData.customNID}"/> </td>
        <td> <c:out value="${customerData.customDOB}"/> </td>
        <td> <c:out value="${customerData.customFatherName}"/> </td>
        <td> <c:out value="${customerData.customMotherName}"/> </td>
        <td> <c:out value="${customerData.customAddr}"/> </td>
        <td> <c:out value="${customerData.accountNum}"/> </td>
        <td> <c:out value="${customerData.accountBalance}"/> </td>
        
</tr>
</tbody>

</table>
<br/>

<form method="post" action="updateCustomer">
<input type="hidden" name="customId" value="${customerData.customId}" />
<input type="submit" value="Update Customer" class="btn btn-primary"/>
</form>

<br/>

<form action="deleteCustomer">
<input type="hidden" name="customId" value="${customerData.customId}" />
<input type="submit" value="Delete Customer" class="btn btn-primary"/>
</form>

</div>

<%@ include file="footer.jsp" %>

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
<th scope="col">Customer Account Number</th></tr>

</thead>

<c:forEach items="${customerList}" var="customer">
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

</c:forEach>
</table>

<br/>

<a href="addNewCustomer" type="button" class="btn btn-primary" >Add New Customer</a>

<br/>


<form action="customer">


<div class="form-group">
<label for="accountNum">Enter Customer Account Number :</label> 
<input class="form-control" id="accountNum" type="text" name="accountNum"/>
</div>


<input type="submit" value="Find Customer By Account Number" class="btn btn-primary"/>
</form>

</div>

<br/>
<hr/>
<br/>

<%@ include file="footer.jsp" %>
<%@ include file="header.jsp" %>
<div class="container">

<h2>To Update Customer</h2>

<form:form action="updateCustomerDetails" method="post" modelAttribute="customerDetails">
<fieldset>

<form:input type="hidden" path="customId" value="${customerDetails.customId}"/>

										
<div class="form-group">
  <label class="col-form-label" for="customName">Customer Name :</label>
   	<form:input path="customName" value="${customerDetails.customName}" class="form-control"/>
	<form:errors path="customName" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customNID">NID :</label>
 	<form:input path="customNID" value="${customerDetails.customNID}" class="form-control"/>
	<form:errors path="customNID" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customDOB">Date of Birth :</label>
 	<form:input path="customDOB" value="${customerDetails.customDOB}" class="form-control"/>
	<form:errors path="customDOB" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customFatherName">Father Name :</label>
 	<form:input path="customFatherName" value="${customerDetails.customFatherName}" class="form-control"/>
	<form:errors path="customFatherName" class="form-control"/>
</div>



<div class="form-group">
  <label class="col-form-label" for="customMotherName">Mother Name :</label>
 	<form:input path="customMotherName" value="${customerDetails.customMotherName}" class="form-control"/>
	<form:errors path="customMotherName" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customAddr">Address :</label>
 	<form:input path="customAddr" value="${customerDetails.customAddr}" class="form-control"/>
	<form:errors path="customAddr" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customPhoneNum">Phone Number :</label>
 	<form:input path="customPhoneNum" value="${customerDetails.customPhoneNum}" class="form-control"/>
	<form:errors path="customPhoneNum" class="form-control"/>
</div>


<div class="form-group">
  <label class="col-form-label" for="accountNum">Account Number :</label>
 	<form:input path="accountNum" value="${customerDetails.accountNum}" class="form-control"/>
	<form:errors path="accountNum" class="form-control"/>
</div>

<div class="form-group">
  <label class="col-form-label" for="accountBalance">Account Balance :</label>
 	<form:input path="accountBalance" value="${customerDetails.accountBalance}" class="form-control"/>
	<form:errors path="accountBalance" class="form-control"/>
</div>


</fieldset>
<input type="submit" value="update Customer" class="btn btn-primary"/>

</form:form>

</div>
<%@ include file="footer.jsp" %>
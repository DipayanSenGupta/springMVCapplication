<%@ include file="header.jsp" %>

<div class="container">
<form:form action="addCustomerDetails" method="post" modelAttribute="customer">

<fieldset>

<div class="form-group">
  <label class="col-form-label" for="customName">Name:</label>
   	<form:input path="customName" class="form-control"/>
	<form:errors path="customName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customNID">NID:</label>
   	<form:input path="customNID" class="form-control"/>
	<form:errors path="customNID" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customDOB">Date of Birth:</label>
   	<form:input path="customDOB" class="form-control"/>
	<form:errors path="customDOB" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customFatherName">Father Name:</label>
   	<form:input path="customFatherName" class="form-control"/>
	<form:errors path="customFatherName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customMotherName">Mother Name:</label>
   	<form:input path="customMotherName" class="form-control"/>
	<form:errors path="customMotherName" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customAddr">Address:</label>
   	<form:input path="customAddr" class="form-control"/>
	<form:errors path="customAddr" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="customPhoneNum">Phone Number:</label>
   	<form:input path="customPhoneNum" class="form-control"/>
	<form:errors path="customPhoneNum" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="accountNum">Account Number:</label>
   	<form:input path="accountNum" class="form-control"/>
	<form:errors path="accountNum" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="accountBalance">Account Balance:</label>
   	<form:input path="accountBalance" class="form-control"/>
	<form:errors path="accountBalance" class="form-control"/><br/>
</div>

</fieldset>


<input type="submit" value="Add Customer" class="btn btn-primary"/>

</form:form>
</div>

<br/>
<hr/>
<br/>

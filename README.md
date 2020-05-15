# Simple Debit Credit System for Bank

## End Users will be able to :

-	Open savings account for a customer with the necessary fields like Customer Name, Date of Birth, NID, Father`s Name , Mother`s Name, Address, Phone No , Account no etc.
-	Deposit/Withdraw the money and update the account balance along with accounting log.
-	Generate the report of  Customer list.
-	Search the customer by account number and view all the necessary information including the account balance of a customer .


## Attributes :
Customer Name, Date of Birth, NID, Father`s Name , Mother`s Name, Address, Phone No , Account no , Account Balance.

- "/", Home Page
- "/addNewCustomer", this will direct to customer creation form. 
- "/addCustomerDetails", if data is added successfully then directed to home page or redirected to "NewCustomer" jsp form page, else redirected to home page with new data.
- "/getAllCustomer", show all customer in tabular form
- "/customer", if Theres an account name with customer then perticular customer details is showed else its redirected to all customer list.
- "/updateCustomer", directed to update customer page with all the attributes.
- "/updateCustomerDetails", customer is updated.
- "/deleteCustomer", customer is deleted.

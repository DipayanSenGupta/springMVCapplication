
package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;

public interface ICustomerService {

	List<Customer> getAllCustomer();
	Customer getCustomerById(int empId);
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer, int empId);
	void deleteCustomer(int empId);
	Customer CustomByAccountNum(String accountNum);

}
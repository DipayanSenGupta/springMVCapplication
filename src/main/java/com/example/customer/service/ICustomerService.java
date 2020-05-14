
package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;

public interface ICustomerService {

	List<Customer> getAllCustomer();
	Customer getCustomerById(int empId);
	void addCustomer(Customer employee);
	void updateCustomer(Customer employee, int empId);
	void deleteCustomer(int empId);
	List<Customer> getCustomByAccountNum(String deptName);

}

package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;

public interface ICustomerService {

	List<Customer> getAllCustomer();
	Customer getCustomerById(int customId);
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer, int customId);
	void deleteCustomer(int customId);
	Customer CustomByAccountNum(String accountNum);

}
package com.example.customer.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.dao.ICustomerDAO;
import com.example.customer.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	

	
	
	List<Customer> customList =new ArrayList<>(Arrays.asList());

	@Autowired
	private ICustomerDAO daoRef;
	
	@Override
	public List<Customer> getAllCustomer() {
	
		return daoRef.findAll();
	}

	@Override
	public Customer getCustomerById(int customId) {
		return daoRef.getOne(customId);
	}

	@Override
	public void addCustomer(Customer customer) {
		
		daoRef.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer, int customId) {

		daoRef.save(customer);
	}

	@Override
	public void deleteCustomer(int customId) {
		
		daoRef.deleteById(customId);
	}

	@Override
	public Customer CustomByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return daoRef.findByAccountNum(accountNum);
	}


	

}


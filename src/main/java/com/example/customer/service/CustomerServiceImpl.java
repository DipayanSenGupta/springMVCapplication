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
		// TODO Auto-generated method stub
		//return empList;
		return daoRef.findAll();
	}

	@Override
	public Customer getCustomerById(int empId) {
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(empId);
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		//empList.add(employee);
		daoRef.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer, int empId) {
		/*for(int i=0; i<empList.size(); i++) {
			Employee e = empList.get(i);
			if(e.getEmpId()==empId) {
				empList.set(i, employee);
				return;
			}
		}*/
		daoRef.save(customer);
	}

	@Override
	public void deleteCustomer(int empId) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpId() == empId);
		daoRef.deleteById(empId);
	}

	@Override
	public List<Customer> getCustomByAccountNum(String customAccountNum) {
		// TODO Auto-generated method stub
		return daoRef.findByAccountNum(customAccountNum);
	}


	

}


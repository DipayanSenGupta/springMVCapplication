package com.example.customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Customer;

@Repository
public interface ICustomerDAO extends JpaRepository<Customer, Integer> {

	List<Customer> findByAccountNum(String customAccountNum);
}

package com.example.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.customer.model.Customer;
import com.example.customer.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	ICustomerService serviceRef;
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("successMsg", "Simple Debit Credit System for bank");
		
		return "Homepage";
	}
	
	@RequestMapping("/addNewCustomer")
	public String addNewCustomerPage(Model model) {
		model.addAttribute("customer",new Customer());
		return "NewCustomer";
	}
	
	
	@RequestMapping("/addCustomerDetails")
	public String addCustomerDetails(@ModelAttribute("customer") Customer customer, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewCustomer";
		}
		else{
			serviceRef.addCustomer(customer);
			model.addAttribute("successMsg", "Data Inserted Successfully");
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/getAllCustomer")
	public String getCustomerList(Model model) {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList= serviceRef.getAllCustomer();
		model.addAttribute("CustomerList",customerList);
		return "Customerview";
	}
	
	@RequestMapping(value="/Customer", method=RequestMethod.GET)
	public String Customer(Model model, @RequestParam("customId") int customId) {
		Customer custom  = serviceRef.getCustomerById(customId);
		System.out.println("Before view "+custom);
		model.addAttribute("CustomerData",custom);
		return "CustomerOperation";
	}
	
	@RequestMapping("/updateCustomer")
	public String updateCustomer(Model model, @RequestParam("customId") int customId) {
		Customer custom = serviceRef.getCustomerById(customId);
		System.out.println("in update Emp"+custom);
		model.addAttribute("CustomerDetails", custom);
		return "updateCustomerPage";
	}
	
	@RequestMapping("/updateCustomerDetails")
	public String updateCustomerDetail(@ModelAttribute("Customer") Customer Customer, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewCustomer";
		}
		else{
			System.out.println(Customer);
			serviceRef.updateCustomer(Customer, Customer.getCustomId());
			model.addAttribute("successMsg", "Customer Updated Successfully");
			
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(Model model, @RequestParam("customId") int customId) {
		System.out.println("in delete Emp"+customId);
		serviceRef.deleteCustomer(customId);
		model.addAttribute("successMsg", "Customer Deleted Successfully");
		
		return "Homepage";
	}
	
}

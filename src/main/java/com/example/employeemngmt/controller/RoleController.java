package com.example.employeemngmt.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.employeemngmt.dto.Employee;
import com.example.employeemngmt.dto.Role;
import com.example.employeemngmt.service.IEmployeeService;
import com.example.employeemngmt.service.IRoleService;


@RestController
public class RoleController {

	@Autowired
	private IRoleService serviceRole;

	
	@RequestMapping("/employees/{empId}/roles")
	public List<Role> getAllRoles(@PathVariable int empId) {
		System.out.println("in Role Controller");
		List<Role> roleList = serviceRole.getRoleList(empId);
		System.out.println(roleList);
		return roleList;
	}
	
	@RequestMapping("/roles")
	public List<Role> getRoleList(){
		return serviceRole.getAllRole();
	}
		
	@RequestMapping("/employees/{empid}/roles/{id}")
	public Role getRoleById(@PathVariable int id) {
		return serviceRole.getRoleById(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/employees/{empId}/roles")
	public void addRole(@RequestBody Role role, @PathVariable int empId) {
		role.setEmployee(new Employee(empId,"",""));
		serviceRole.addRole(role);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{empId}/roles/{id}")
	public void updateRole(@RequestBody Role role, @PathVariable int empId) {
		role.setEmployee(new Employee(empId,"",""));
		serviceRole.updateRole(role);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/roles/{id}")
	public void deleteRoleById(@PathVariable int id) {
		 serviceRole.deleteRoleById(id);
	}
}

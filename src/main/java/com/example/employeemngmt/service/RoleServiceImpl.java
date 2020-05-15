package com.example.employeemngmt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemngmt.dao.*;
import com.example.employeemngmt.dto.Employee;
import com.example.employeemngmt.dto.Role;

@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private IRoleDAO daoRef;

	@Override
	public List<Role> getRoleList(int empId) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class employee id"+empId);
		return daoRef.findByEmployeeEmpId(empId);
	}

	@Override
	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(id);
	}

	@Override
	public void addRole(Role proj) {
		// TODO Auto-generated method stub
		daoRef.save(proj);
	}

	@Override
	public void updateRole(Role proj) {
		// TODO Auto-generated method stub
		daoRef.save(proj);
	}

	@Override
	public void deleteRoleById(int id) {
		// TODO Auto-generated method stub
		daoRef.deleteById(id);
	}

	@Override
	public List<Role> getAllRole() {
		
		return daoRef.findAll();
	}
	
	
}

package com.example.employeemngmt.service;

import java.util.List;

import com.example.employeemngmt.dto.Role;

public interface IRoleService {

	List<Role> getRoleList(int empId);

	Role getRoleById(int id);

	void addRole(Role proj);

	void updateRole(Role proj);

	void deleteRoleById(int id);

	List<Role> getAllRole();
	
}

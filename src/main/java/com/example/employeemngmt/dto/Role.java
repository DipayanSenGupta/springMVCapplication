package com.example.employeemngmt.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Role {

	@Id
	private int RoleId;
	private String RoleName;
	
	@ManyToOne
	private Employee employee;
	
	public Role() {
		
	}

	
	public Role(int RoleId, String RoleName, int empId) {
		super();
		this.RoleId = RoleId;
		this.RoleName = RoleName;
		this.employee = new Employee(empId,"","");
	}


	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int RoleId) {
		this.RoleId = RoleId;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String RoleName) {
		this.RoleName = RoleName;
	}


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}

package com.example.employeemngmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemngmt.dto.Role;

@Repository
public interface IRoleDAO extends JpaRepository<Role, Integer> {

	List<Role> findByEmployeeEmpId(int empId);

}

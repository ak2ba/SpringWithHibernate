package com.tap.dao;

import java.util.List;

import com.tap.entity.Employee;

public interface EmployeeDO {
	int save(Employee e);
	void updateEmployee(Employee e);
	List<EmployeeDO> getAllEmployees();
	int deleteEmployee(int id);
}

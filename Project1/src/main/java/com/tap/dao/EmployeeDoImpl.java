package com.tap.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tap.entity.Employee;

public class EmployeeDoImpl implements EmployeeDO {
	SessionFactory sessionFactory = null;
	
	public int save(Employee e) {
		Session session = sessionFactory.openSession();
		Integer i = (Integer)session.save(e);
		return i; 
	}

	public void updateEmployee(Employee e) {
		Session session = sessionFactory.openSession();
		e.setSalary(e.getSalary()+2000);
		session.update(e);
	}

	public List<EmployeeDO> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
}

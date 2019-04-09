package com.btpn.jpahibernate.jpahibernate.service;

import java.util.List;

import com.btpn.jpahibernate.jpahibernate.model.Employees;

public interface IEmployeeService {
	Employees addEmployee(Employees employee);

	List<Employees> findAllEmployee();

	Employees findByEmployeeName(String name);

	void deleteEmployee(Integer id);

	Employees findByEmployeeId(Integer employeeId);
	
	List<Employees>  addListEmployees(List<Employees> employees);
}

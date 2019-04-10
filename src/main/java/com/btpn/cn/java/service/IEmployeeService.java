package com.btpn.cn.java.service;

import java.util.List;

import com.btpn.cn.java.model.Employees;

public interface IEmployeeService {
	Employees addEmployee(Employees employee);

	List<Employees> findAllEmployee();

	Employees findByEmployeeName(String name);

	void deleteEmployee(Integer id);

	Employees findByEmployeeId(Integer employeeId);
	
	List<Employees>  addListEmployees(List<Employees> employees);
}

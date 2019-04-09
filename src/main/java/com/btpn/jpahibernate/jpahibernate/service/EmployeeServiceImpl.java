package com.btpn.jpahibernate.jpahibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btpn.jpahibernate.jpahibernate.model.Employees;
import com.btpn.jpahibernate.jpahibernate.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Override
	public Employees addEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employees> findAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employees findByEmployeeName(String name) {
		return employeeRepository.findByEmployeeName(name);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.delete(id);
	}

	@Override
	public Employees findByEmployeeId(Integer employeeId) {
		return employeeRepository.findOne(employeeId);
	}

	@Override
	public List<Employees> addListEmployees(List<Employees> employees) {
		return employeeRepository.save(employees);
	}

	

}

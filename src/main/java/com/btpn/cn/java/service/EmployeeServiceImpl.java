package com.btpn.cn.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btpn.cn.java.model.Employees;
import com.btpn.cn.java.repository.IEmployeeRepository;

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

	public void setEmployeeRepository(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


}

package com.btpn.cn.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btpn.cn.java.model.Employees;
import com.btpn.cn.java.service.IEmployeeService;

@RestController
@RequestMapping("/company")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/employee/add")
	private Employees addEmployee(@RequestBody Employees employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PostMapping("/employee/add/list")
	private List<Employees> addEmployees(@RequestBody List<Employees> employees) {
		return employeeService.addListEmployees(employees);
	}
	
	@GetMapping("/employee/all")
	private List<Employees> getAllEmployee(){
		return employeeService.findAllEmployee();
	}
	
	@GetMapping("/employee/{employeeName}")
	private Employees getEmployeeById(@PathVariable("employeeName") String employeeName) {
		return employeeService.findByEmployeeName(employeeName);
	}
	
	@PutMapping("/employee/update/{employeeId}")
	private Employees updateEmployee(@RequestBody Employees employee, @PathVariable("employeeId") Integer employeeId) {
		Employees emp = employeeService.findByEmployeeId(employeeId);
		
		if(emp != null) {
			employee.setEmployeeId(emp.getEmployeeId());
			return employeeService.addEmployee(employee);
		}
		return null;
	}
	
	@GetMapping("/employee/delete/{employeeId}")
	private String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Employee with employee id  = "+employeeId +" deleted";
	}
}

package com.btpn.cn.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btpn.cn.java.model.Employees;

public interface IEmployeeRepository extends JpaRepository<Employees, Integer>{
	Employees findByEmployeeName(String name);
}

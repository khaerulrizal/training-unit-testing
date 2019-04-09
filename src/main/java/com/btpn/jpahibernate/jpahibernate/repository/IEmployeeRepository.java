package com.btpn.jpahibernate.jpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btpn.jpahibernate.jpahibernate.model.Employees;

public interface IEmployeeRepository extends JpaRepository<Employees, Integer>{
	Employees findByEmployeeName(String name);
}

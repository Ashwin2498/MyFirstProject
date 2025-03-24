package com.first.springbootproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.first.springbootproject.model.Employee;
import com.first.springbootproject.repository.EmployeeRepository;
import com.first.springbootproject.service.EmployeeService;

public class EmployeeSeviceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmloyee() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee saveUser(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public String getEmail(String name) {
		System.out.println("name is " + name);
		String response = employeeRepository.findByName(name);
		if (response != null) {
			return response;
		}else {
			return "employee is not present";
		}
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		
		
		return employeeRepository.save(employee);
		
	}

}

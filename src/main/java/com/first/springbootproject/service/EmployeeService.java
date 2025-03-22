package com.first.springbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.springbootproject.model.Employee;

import com.first.springbootproject.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmloyee() {
		return employeeRepository.findAll();
	}

	public Employee saveUser(Employee employee) {
		return employeeRepository.save(employee);
	}

	public String getEmail(String name) {
		System.out.println("name is " + name);
		String response = employeeRepository.findByName(name);
		if (response != null) {
			return response;
		}else {
			return "employee is not present";
		}
	}

}

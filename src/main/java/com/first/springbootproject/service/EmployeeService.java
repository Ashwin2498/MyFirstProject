package com.first.springbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.springbootproject.model.Employee;

import com.first.springbootproject.repository.EmployeeRepository;

@Service
public interface EmployeeService {

	List<Employee> getAllEmloyee();

	Employee saveUser(Employee employee);

	String getEmail(String name);

	public Employee updateEmployee(Employee employee);

}

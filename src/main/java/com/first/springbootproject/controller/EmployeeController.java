package com.first.springbootproject.controller;


import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first.springbootproject.model.Employee;

import com.first.springbootproject.service.EmployeeService;


@RestController
@RequestMapping("/employees")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;

	
	
	@PostMapping("/Employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		System.out.println("request body  : " + employee.getName());
		System.out.println("request body  : " + employee.getEmail());
	    return employeeservice.saveUser(employee);
	}
	
	@GetMapping()
	public List<Employee> getAll(){
	    return employeeservice.getAllEmloyee();
	}
	
	@GetMapping("/name")
	public String getMailId(@RequestParam String name){
		return employeeservice.getEmail(name);
	}
	
	

}

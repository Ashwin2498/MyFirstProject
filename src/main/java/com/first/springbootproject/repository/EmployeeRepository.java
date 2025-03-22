package com.first.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.first.springbootproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query(value="select email from employee where name=?1",nativeQuery = true)
	public String findByName(String name);

}

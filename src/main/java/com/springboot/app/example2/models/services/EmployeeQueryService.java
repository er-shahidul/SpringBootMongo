package com.springboot.app.example2.models.services;


import java.util.List;
import com.springboot.app.example2.models.Employee;

public interface EmployeeQueryService {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getSingleEmployeeByLastName(String lastName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getOneEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);

	List<Employee> getEmployeeByCondition(Employee employee);
}

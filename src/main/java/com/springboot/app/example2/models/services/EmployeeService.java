package com.springboot.app.example2.models.services;


import java.util.List;
import com.springboot.app.example2.models.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();

	List<Employee> getEmployeeByFirstName(String firstName);

	Employee getOneEmployeeByFirstName(String firstName);

	List<Employee> getEmployeeByFirstNameLike(String firstName);

	Employee getEmployeeById(int empId);
	
	Employee getEmployeeByLastName(String lastName);

	List<Employee> getEmployeeBySalaryGreaterThan(int salary);
	
	List<Employee> getEmployeeByCondition(Employee employee);
}

package com.gloifyassignment.Service;

import java.util.List;

import com.gloifyassignment.entities.Employee;

public interface EmployeeService {
	
	public List<Employee>getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(long parseLong);

}
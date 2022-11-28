package com.gloifyassignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gloifyassignment.EmployeeDAO.EmployeeDAO;
import com.gloifyassignment.entities.Employee;



@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
        employeeDao.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
     Employee entity =employeeDao.getOne(parseLong);
     employeeDao.delete(entity);
	}

}
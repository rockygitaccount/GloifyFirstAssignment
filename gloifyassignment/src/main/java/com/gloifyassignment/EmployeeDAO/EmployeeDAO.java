package com.gloifyassignment.EmployeeDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gloifyassignment.entities.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}

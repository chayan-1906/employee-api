package com.pdas.employeemanagement.service;

import java.util.List;

import com.pdas.employeemanagement.dto.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int empId);

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee, int empId);

	void deleteEmployee(int empId);

}

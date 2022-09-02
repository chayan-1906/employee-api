package com.pdas.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pdas.employeemanagement.dto.Employee;
import com.pdas.employeemanagement.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeServiceRef;

	@RequestMapping("/welcome")
	public String welcomeEmployee() {
		return "Hello Employee";
	}

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return (employeeServiceRef.getAllEmployees());
	}

	@RequestMapping("/employees/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") int empId) {
		return employeeServiceRef.getEmployeeById(empId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeServiceRef.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{employeeId}")
	public void updateEmployee(@RequestBody Employee employee,
			@PathVariable("employeeId") int empId) {
		employeeServiceRef.updateEmployee(employee, empId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") int empId) {
		employeeServiceRef.deleteEmployee(empId);
	}

}

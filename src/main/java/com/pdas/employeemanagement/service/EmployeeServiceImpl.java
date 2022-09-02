package com.pdas.employeemanagement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdas.employeemanagement.dao.IEmployeeDAO;
import com.pdas.employeemanagement.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	List<Employee> employees = new ArrayList<Employee>(Arrays.asList(
			new Employee(1, "Padmanabha", "Payments"),
			new Employee(2, "PKD", "DSOS"),
			new Employee(3, "Chandrima", "PCF")));

	@Autowired
	private IEmployeeDAO imEmployeeDAORef;

	@Override
	public List<Employee> getAllEmployees() {
		return imEmployeeDAORef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return imEmployeeDAORef.getOne(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		imEmployeeDAORef.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		/*
		 * for (int i = 0; i < employees.size(); i++) { Employee emp =
		 * employees.get(i); if (emp.getEmpId() == empId) { employees.set(i,
		 * employee); return; } }
		 */
		imEmployeeDAORef.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		imEmployeeDAORef.deleteById(empId);
	}

}

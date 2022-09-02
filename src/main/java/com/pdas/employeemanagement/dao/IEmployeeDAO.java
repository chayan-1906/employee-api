package com.pdas.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdas.employeemanagement.dto.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {


}

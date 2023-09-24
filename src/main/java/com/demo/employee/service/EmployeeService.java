package com.demo.employee.service;

import java.util.List;

import com.demo.employee.payload.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	List<EmployeeDto> getAllEmployees();

}

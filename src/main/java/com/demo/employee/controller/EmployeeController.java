package com.demo.employee.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.payload.EmployeeDto;
import com.demo.employee.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class EmployeeController {
	
	private  EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
    @PostMapping("/createEmployee")
	public ResponseEntity<EmployeeDto> saveEmployee(@Valid @RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<>(employeeService.saveEmployee(employeeDto),HttpStatus.CREATED);}
		
		
    @GetMapping("/getEmployees")
	    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
	        return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
		
	}
  
  
  } 
 
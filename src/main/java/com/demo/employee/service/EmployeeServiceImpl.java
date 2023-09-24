package com.demo.employee.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.demo.employee.model.Employee;
import com.demo.employee.payload.EmployeeDto;
import com.demo.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		   this.employeeRepository = employeeRepository;
	}



	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		// convert Dto to Entity
		Employee employee= new Employee();
		
		//employee.getId(employeeDto.setId())
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setGender(employeeDto.getGender());
		employee.setEmail(employeeDto.getEmail());
	    employee.setComment(employeeDto.getComment());
		
		Employee newEmployee= employeeRepository.save(employee);
		
		//convert Entity to Dto
		
		EmployeeDto employeeResponceDto = new EmployeeDto();
		
		employeeResponceDto.setFirstName(newEmployee.getFirstName());
		employeeResponceDto.setLastName(newEmployee.getLastName());
		employeeResponceDto.setGender(newEmployee.getGender());
		employeeResponceDto.setEmail(newEmployee.getEmail());
		employeeResponceDto.setComment(newEmployee.getComment());
		
		
		
		
       return employeeResponceDto;
	}



	@Override
	public List<EmployeeDto> getAllEmployees() {
		
		List<Employee> employeeList= new ArrayList<Employee>();
		
		employeeList = employeeRepository.findAll();
		 
		List<EmployeeDto> employeeResponceDto= new ArrayList<EmployeeDto>();
		
		for(Employee employee:employeeList) {
			
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setFirstName(employee.getFirstName());
			employeeDto.setLastName(employee.getLastName());
			employeeDto.setGender(employee.getGender());
			employeeDto.setEmail(employee.getEmail());
			employeeDto.setComment(employee.getComment());
			
			employeeResponceDto.add(employeeDto);
		}
		
       
		return  employeeResponceDto;
	}

}

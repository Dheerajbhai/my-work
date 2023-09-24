package com.demo.employee.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EmployeeDto {
	
	
	private long id;
	
	@NotNull
	@NotEmpty(message="This is the mandatory feild")
	private String firstName;
	
	@NotEmpty(message="This is the mandatory feild")
    private String lastName;
	
	@NotEmpty(message="This is the mandatory feild")
    private String gender;
	
	@NotEmpty
	@Email(message="Email is not in valid format")
    private String email;
    
    @Size(min=11,max=24,message="Comment should have miminum 11 to Maximum 24 Characters")
    private String comment;
	
    
    
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public  String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	

}

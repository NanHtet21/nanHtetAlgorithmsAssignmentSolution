package com.greatlearning.model;

public class Employee {
	//Define/Declare  first, Last name, Department of Employee
	private String firstName;
	private String lastName;
	private String department;
	
	// Create a constructor
	public Employee(String firstName, String lastName, String Department) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDepartment(department);
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// Create a getter and setter 
	


}

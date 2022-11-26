package com.simplilearn.superthis;

public class Employee {

	private String empname;
	private String empDesignation;
	private int empAge;
	// Object Class is the Super class of all the class (User Defined/JAVA in build class)
	
	// Constructor using Field
	public Employee(String empname, String empDesignation, int empAge) {
		super();
		this.empname = empname;
		this.empDesignation = empDesignation;
		this.empAge = empAge;
	}

	// Constructor using Super Class
	public Employee() {
		super();// Calling object Class Constructor
	}


	

	
	
}

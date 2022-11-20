package com.simplilearn.constructor1;

public class EmployeeEmail {

	public static void main(String[] args) {
		
		Employee emp= new Employee(); // HOW
		
		// JVM will automatically create one default constructor for the class
		// IF and only if class does not have any parametrized constructor.
		
		
		System.out.println(emp);

	}

}

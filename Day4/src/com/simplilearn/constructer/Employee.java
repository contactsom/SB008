package com.simplilearn.constructer;

public class Employee {

	
	int empid;
	String empname;
	int empAge;
	int salery;
	
	// No Argument Constructor or Default Constructor
	public Employee() {
	}
	
	
	// Parametrized Constructer OR Argument Constructor
	public Employee(int empid, String empname, int empAge) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empAge = empAge;
	}

	// Parametrized Constructer OR Argument Constructor
	public Employee(int empid, String empname, int empAge, int salery) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empAge = empAge;
		this.salery = salery;
	}

	// Parametrized Constructer OR Argument Constructor
		public Employee(String empname, int empAge, int salery) {
			super();
			this.empname = empname;
			this.empAge = empAge;
			this.salery = salery;
		}
		

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empAge=" + empAge + ", salery=" + salery + "]";
	}



	
}

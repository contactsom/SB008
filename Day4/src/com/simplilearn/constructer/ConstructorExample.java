package com.simplilearn.constructer;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Employee emp= new Employee(101, "MOHAN", 35);
								//int empid, String empname, int empAge
								//Employee [empid=101, empname=MOHAN, empAge=35, salery=0]
		System.out.println(emp);
		
		Employee emp1= new Employee(101, "MOHAN", 35,1001);
									//int empid, String empname, int empAge, int salery
									//Employee [empid=101, empname=MOHAN, empAge=35, salery=1001]
		System.out.println(emp1);
			
				
						
		
		
	}
}

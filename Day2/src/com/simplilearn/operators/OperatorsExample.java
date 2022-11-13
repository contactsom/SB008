package com.simplilearn.operators;

public class OperatorsExample {

	public static void main(String[] args) {
		System.out.println("**********Operators Example***********");

		int a=10;
		int b=++a; // Pre increment
		// First increment happend then assigned to b
		System.out.println("Value of b : "+b);
		
		int c=a++; // Post Increment
		// First assigned then increment hqappen
		System.out.println("Value of c : "+c);
		
		
		//int d=c++; 
		int d=++c; 
		System.out.println("Value of d : "+d);
				
		// ++a; ===  a++;
		
		
		System.out.println("************************************");
		
		
		int a1=20;
		int a2=30;
		System.out.println(a1>a2);// false
		
		int a3=20;
		int a4=30;
		System.out.println(a4>a3);// true
		
		
		int a5=5;
		int a6=5;
		System.out.println(a5==a6); // true
		
		int a7=6;
		int a8=5;
		System.out.println(a7==a8);//false
		
		
		int a9=6;
		int a10=5;
		System.out.println(a9!=a10);//true
		
		
	}

}

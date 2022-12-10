package com.simplilearn.exception;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {

		System.out.println("I am statement -1");
		int a = 0;
		int b = 10;
		int c = b/a; 	// Risky Code 
		System.out.println("I am statement -2");
	
		
		System.out.println(c);
		System.out.println("I am statement -3");
		
			/*
			 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.simplilearn.exception.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:9)*/
	}

}

package com.simplilearn.exception;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {

		try {
			System.out.println("I am statement -1");
			int a = 2;
			int b = 10;
			int c = b/a; 	// Risky Code 
			System.out.println(c);
			System.out.println("I am statement -2");
			
		} catch (Exception e) {
			System.out.println("I am statement -3");
			System.out.println("Error Occured in try Block");
			// Handle the Risky Code Exception
		}
		
		System.out.println("I am statement -4");
		
		
		
		
			
	}

}

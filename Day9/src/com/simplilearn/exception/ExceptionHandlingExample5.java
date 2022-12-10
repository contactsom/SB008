package com.simplilearn.exception;

public class ExceptionHandlingExample5 {

	public static void main(String[] args) {

		try {
			System.out.println("I am statement -1");
			int a = 0;
			int b = 10;
			int c = b/a; 	// Risky Code 
			System.out.println(c);
			System.out.println("I am statement -2");
			
		} catch (Exception e) {
			System.out.println("I am statement -3");
			System.out.println("Error Occured in try Block");
			// Handle the Risky Code Exception
		}finally {
			
			System.out.println("I am statement -4");
			
		}
		
		System.out.println("I am statement -5");
		
		
		
			
	}

}

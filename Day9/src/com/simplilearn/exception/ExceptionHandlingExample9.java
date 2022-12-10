package com.simplilearn.exception;

public class ExceptionHandlingExample9 {

	public static void main(String[] args) {

			
			System.out.println("Try");
			int a = 0;
			int b = 10;
			int c = b/a; 
			System.out.println(c);
			
			throw new ArithmeticException("/ by zero");
		
		
		
		
			
	}

}

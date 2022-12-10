package com.simplilearn.exception;

public class ExceptionHandlingExample6 {

	public static void main(String[] args) {

		try {
			
			System.out.println("Try");
			int a = 0;
			int b = 10;
			//System.exit(0);
			int c = b/a; 
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("Catch");
			System.exit(0); /* To terminate the JVM abnormally */
			
		}finally {
			
			System.out.println("Finally");
			
		}
		
		System.out.println("I am Done");
		
		
		
			
	}

}

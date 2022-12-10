package com.simplilearn.exception;

public class ExceptionHandlingExample7 {

	public static void main(String[] args) {

		try {
			
			System.out.println("Try");
			int a = 0;
			int b = 10;
			int c = b/a; 
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("Catch");
			System.out.println("__________________");
			e.printStackTrace();
			System.out.println("__________________");
			System.out.println(e.toString());
			System.out.println("__________________");
			System.out.println(e.getMessage());
			System.out.println("__________________");
		}finally {
			
			System.out.println("Finally");
			
		}
		
		System.out.println("I am Done");
		
		
		
			
	}

}

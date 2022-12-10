package com.simplilearn.exception;

public class CustomeException {

	public static void main(String[] args) {
		
		String swap="Fail";
		
		if(swap.equalsIgnoreCase("Fail")) {
			
			System.out.println("Not alloed to enter the office");
			
			throw new ForgetIdCardException("Please wait till Admin team preparing Temproary ID card for you ");
			
		}else {
			System.out.println(" alloed to enter the office");
		}
		
	}
}

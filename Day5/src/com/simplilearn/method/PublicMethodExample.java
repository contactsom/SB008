package com.simplilearn.method;

import com.simpliearn.method1.PublicMethodExample1;

public class PublicMethodExample {

	public static void main(String[] args) {

		MethodSamepackage methodSamepackage = new MethodSamepackage();
		String output=methodSamepackage.getMyName();
		System.out.println(output);
		
		
		PublicMethodExample1 publicMethodExample1 = new PublicMethodExample1();
		int age=publicMethodExample1.getMyAge();
		System.out.println(age);
		
		
		
	}

}

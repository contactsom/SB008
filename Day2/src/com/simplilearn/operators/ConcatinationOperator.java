package com.simplilearn.operators;

public class ConcatinationOperator {

	public static void main(String[] args) {
		
		String  firstname="Harshkumar";
		String  lastname="Joshi";
		
		System.out.println("First Name  : "+firstname);
		System.out.println("Last Name  : "+lastname);
		// Harshkumar Joshi
		
		String name=firstname+" "+lastname;
		// I am concatinating his first name and last name having space in between
		// Hence + is also call concatination operator .
		
		System.out.println("NAME: "+name);
		
		
		int a =10;
		int b =20;
		System.out.println(a+b);//30
		
		
		String a1 ="10";
		String b1 ="20";
		System.out.println(a1+b1);// 1020
		
	}

}

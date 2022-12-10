package com.simplilearn.string;

public class StringExample3 {

	public static void main(String[] args) {
		
		String str1 = "ABC";
		System.out.println(str1);
		
		
		String str2= "ABC";
		System.out.println(str2);
		
		
		// == and equals()
		
		System.out.println(str1==str2); // true
		System.out.println(str1.equals(str2)); // true
		
		System.out.println("-------------------------");
		
		
		String myString1= new String("XYZ");
		String myString2= new String("XYZ");
		
		System.out.println(myString1==myString2); // false
		System.out.println(myString1.equals(myString2)); // true
		
		
	}
}

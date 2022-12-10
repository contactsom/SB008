package com.simplilearn.string;

public class StringExample5 {

	public static void main(String[] args) {
		
		String str="ABCDEF";
		
		// A - 0 Index
		// B - 1 Index
		// C - 2 Index
		// D - 3 Index
		// E - 4 Index
		// F - 5 Index
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		
		String str1="  ABC DEF  ";
		System.out.println(str1.trim()); // It remove the space from start and End
		
		System.out.println(str.indexOf('D'));
		
		
		
		
		
		
	}
}

package com.simplilearn.operators;

public class Difference {

	public static void main(String[] args) {
		
		//Difference between b++ and b+1 
		// case : int 
		// Meaning is same 
		// b++  : increment the value 
		// b+1  : adding 1 in to the value 
		
		int x=10;
		int y=x++;
		int z=x+1;
		
		System.out.println(y);		
		System.out.println(z);	
		
		// case : byte 
		// Meaning is different  
		// b++  : increment the value 
		// b+1  : adding 1 in to the value 
		// a+1;  a(byte) + 1 (int)

		byte a=10;
		byte m=a++;
		//byte n=a+1;// Type mismatch: cannot convert from int to byte
		
		System.out.println(m);		
		//System.out.println(n);	
		
		// A + 1 = 
		// 1 + 1 = 2
		
		//robinsinghkuntal . to Everyone (9:24 PM)
		// Type Casting 
		// Implict type casting 
		// explicit type casting 
		
	
	}
}

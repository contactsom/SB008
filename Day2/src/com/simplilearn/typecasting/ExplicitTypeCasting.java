package com.simplilearn.typecasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		double d1= 123456789; // 8 byte 
		byte b1=(byte) d1;		// 1 byte 
		System.out.println("double (8 byte) -> byte (1 byte) :  "+b1);
		
		short s1=(short) d1;		// 1 byte 
		System.out.println("double (8 byte) -> short (2 byte) :  "+s1);
		
		float f1=(float) d1;		// 1 byte 
		System.out.println("double (8 byte) -> float (4 byte) :  "+f1);
		
		char c1=(char) d1;		// 1 byte 
		System.out.println("double (8 byte) -> char (4 byte) :  "+c1);
		
	}
}

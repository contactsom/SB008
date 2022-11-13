package com.simplilearn.typecasting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		
		byte b1= 123;
		short s1=b1; // I am putting byte in to short, Means 1 byte in to 2 byte memory space
		System.out.println("Byte -> short : "+s1);
		
		int i1=b1;
		System.out.println("Byte -> int : "+i1);
		
		long l1=b1;
		System.out.println("Byte -> long : "+l1);
		
		float f1=b1;
		System.out.println("Byte -> float : "+f1);
		
		double d1=b1;
		System.out.println("Byte -> double : "+d1);
		
		long l2=123L;
		float f2=l2;
		
		System.out.println("long(8 byte) -> float(4 byte) : "+f2);
		
		//Harshkumar K Joshi . to Everyone (9:25 PM)
		int a = 12;
		float b =15;
		System.out.println((a+b));//27.0
		
	}
}

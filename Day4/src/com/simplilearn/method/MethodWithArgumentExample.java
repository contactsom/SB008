package com.simplilearn.method;

public class MethodWithArgumentExample {

	public static void main(String[] args) {

		int output1=getSum(20,30);
		System.out.println(output1);
		
		
		int output2=getSum(10,20);
		System.out.println(output2);
		
		
	}
	
	
	public static int getSum(int a,int b) {
		return a+b;
	}

}

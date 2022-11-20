package com.simplilearn.method;

public class MethodExample {

	public static void main(String[] args) {
		
		float output=getPaiValue();
		System.out.println(output);
		getSum();
		
		int sum=getMySum();
		System.out.println(sum);
		
	
	}

	public static void getSum() {
		int a=10;
		int b=20;
		int c=a+b;
		//System.out.println("Sum Of Two Number : "+c);
	}
	
	public static int getMySum() {
		int a=10;
		int b=20;
		return a+b;
		//System.out.println("Sum Of Two Number : "+c);
	}
	
	
	public static void getSubtraction() {
		int x=20;
		int y=10;
		int z=x-y;
		//.out.println("Difference of Two Number: "+z);
	}
	
	public static void getDiv() {
		int m=20;
		int n=2;
		int p=m/n;
		//System.out.println("Division of Two Numbers: "+p);
		
	}
	
	public static float getPaiValue() {
		return 22/7;
	}
}

package com.simplilearn.array;

public class ArrayElementAccess {

	public static void main(String[] args) {
		
		
		int[] myIntArray= {100,200,34,54,67,89};
		
		System.out.println("Size- "+myIntArray.length);
		System.out.println("Index At 0 - "+myIntArray[0]); // 
		System.out.println("Index At 1 - "+myIntArray[1]); // 
		System.out.println("Index At 2 - "+myIntArray[2]); // 
		System.out.println("Index At 3 - "+myIntArray[3]); // 
		System.out.println("Index At 4 - "+myIntArray[4]); // 
		System.out.println("Index At 5 - "+myIntArray[5]); // 
		
		// Length of This Array in 6
		// Start from 0 till 5 === Start from 0 till (length-1)
		
		System.out.println("****************************************");
		// 100 Element
		
		int[] myIntArray1= {100,200,34,54,67,89,54,67,89,100,200,34,5100,200,34,54,67,89};
		System.out.println("Size- "+myIntArray1.length);
		
		/*
		 * i= this is index of an Array
		 * */
		for (int i = 0; i < myIntArray1.length; i++) {
			
			System.out.println("Index At "+ i + " : "+myIntArray1[i]); // 
			
		}
		
		
		
		
		
	}
}

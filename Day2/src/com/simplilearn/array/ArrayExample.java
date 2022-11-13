package com.simplilearn.array;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		int[] a1= {1,2,3,4,5,6,7,8,9}; // Integer Array 1D
		int a2[]= {1,2,3,4,5,6,7,8,9}; // Integer Array 1D
		int []a3= {1,2,3,4,5,6,7,8,9}; // Integer Array 1D
		
		// This is the collection of Roll Number stored in integer Array
		int[] rollnum= {101,102,103,104,105,106,107,108};
		
		System.out.println(rollnum[0]);
		System.out.println(rollnum[7]);
		//System.out.println(rollnum[8]);
		System.out.println(rollnum[3]); //104
		
		System.out.println("SIZE: "+rollnum.length);
		
		String[] studentName= {"MOHAN","JOHN","RAVI"};
		
	}
}

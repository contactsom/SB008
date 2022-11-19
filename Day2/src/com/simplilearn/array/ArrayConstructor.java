package com.simplilearn.array;

public class ArrayConstructor {

	public static void main(String[] args) {

		// Every Array in java is an Object.
		
		// This is integer Array of Size 5 having NO element
		int[] a = new int[5];// 
		
		// Inserting the DATA
			a[0]=9;
			a[1]=10;
			a[2]=11;
			a[3]=12;
			a[4]=13;
			//a[5]=14;//  java.lang.ArrayIndexOutOfBoundsException
		
		
		// This is integer Array of Size 5 having 1,2,3,4,5 as element
		int[] b = {1,2,3,4,5}; 
		
		
		System.out.println("Lenth of Array a - "+a.length);// 5 
		System.out.println("Lenth of Array b - "+b.length);
	}

}

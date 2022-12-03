package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : 11.How to Find Multiple Missing number in Given Integers Array with Duplicates in Java?
 * INPUT           : { 0, 1, 2, 3, 5, 5, 7, 9, 9, 9, 9, 9 }; Constraint : ArrayData < Array.Length 
 * Actual Sequence : { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
 * OUTPUT          : { 4, 6, 8, 10, 11}	
 * */

public class FindMoreMissingElementIntArray {

	public static void main(String[] args) {

		int[] inputArray = { 0, 1, 2, 3, 5, 5, 7, 9, 9, 9, 9, 9};

		FindMoreMissingElementIntArray.getMissing(inputArray);

	}

	private static void getMissing(int[] inputArray) {

		int[] userArray = inputArray;

		System.out.println(Arrays.toString(userArray));
		System.out.println("Length of User Array-> " + userArray.length);

		int[] CopyArray = new int[userArray.length];
		
		for (int userData : userArray) {
			
			CopyArray[userData]=1;
		}

		System.out.println(Arrays.toString(CopyArray));
		
		
		for (int i = 0; i < CopyArray.length; i++) {
			
			if(CopyArray[i]==0){
				System.out.println(i);
			}
		}
	}

}

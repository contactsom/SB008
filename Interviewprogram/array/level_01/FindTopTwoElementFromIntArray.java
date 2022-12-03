package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : 05.How to find top two numbers from an integer array.
 * INPUT   : { 1, 34, 89, 2, 43, 34, 65, 67, 98, 10, 100 };
 * Output  : 
 * 			TOP First Element of an Array  :100 
			TOP Second Element of an Array :98

 * */

public class FindTopTwoElementFromIntArray {

	public static void main(String[] args) {

		int[] integerArray = { 1, 34, 89, 2, 43, 34, 65, 67, 98, 10, 100 };

		int[] sortedArray = FindTopTwoElementFromIntArray.getTopTwoElement(integerArray);
		System.out.println("***-Sorted Array-***");
		System.out.println(Arrays.toString(sortedArray));

		FindTopTwoElementFromIntArray.displayTopTwoElement(sortedArray);

	}

	/* Start-Logic for Sorting */
	private static int[] getTopTwoElement(int[] integerArray) {

		int[] input = integerArray;
		int tmp;
		System.out.println("***-User Input-***");
		System.out.println(Arrays.toString(input));

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (input[i] > input[j]) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
		return input;

	}
	/* End-Logic for Sorting */

	/* Start-Logic to display */
	private static void displayTopTwoElement(int[] sortedArray) {
		
		int[] array=sortedArray;
		System.out.println("***-In displayTopTwoElement-***");
		System.out.println(Arrays.toString(array));

		System.out.println("TOP First Element of an Array->"+array[0]);
		System.out.println("TOP Second Element of an Array->"+array[1]);
		
	}
	/* End-Logic to display */

}

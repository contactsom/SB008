package com.apipothi.array.level_00;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * 8.2     : Write a Java program to sort the numeric sub-array using “Arrays.sort(Array, 2, 8)”
 * API     : Arrays.sort(Array, From, To)”
 * INPUT   : { 6, 7, 3, 4, 5, 8, 9, 10, 1, 2 }     
 * Output  : { 6, 7, 1, 3, 4, 5, 8, 9, 0, 2 }
 * Recommended Watch:
 * 			8 Write a Java program to sort the numeric array
*/

public class ReverseIntArrayUsing_sort_API2 {

	public static void main(String[] args) {

		int[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		System.out.println("***-Using Arrays.sort- for subarray.***");
		
		
		ReverseIntArrayUsing_sort_API2.getSortedArray(inputArray);
		
	}

	private static void getSortedArray(int[] inputArray) {
		
		int[] input=inputArray;
		System.out.println("***-Before Sorting the Array-***");
		System.out.println(Arrays.toString(input));
		
		//Logic for sorting
		Arrays.sort(input, 2, 8);
		
		System.out.println("***-After Sorting the Array-***");
		System.out.println(Arrays.toString(input));
		
//		[6, 7, 4, 5, 8, 3, 9, 1, 0, 2]-Input
//             4, 5, 8, 3, 9, 1,
//		[6, 7, 1, 3, 4, 5, 8, 9, 0, 2]-Output
		
	}


}

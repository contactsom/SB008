package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;

/*
 * JAVA    : 1.8
 * 8.3     : Write a Java program to sort the numeric array using in descending order.
 * API     : Arrays.sort(userInput, Collections.reverseOrder());
 * INPUT   : { 6, 7, 3, 4, 5, 8, 9, 10, 1, 2 }     
 * Output  : { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }
*/

public class ReverseIntArrayUsing_sort_API3 {

	public static void main(String[] args) {

		Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		System.out.println("***-Using Arrays.sort- for descending order.***");

		ReverseIntArrayUsing_sort_API3.getSortedArrayDesendingOrder(inputArray);
		

	}

	private static void getSortedArrayDesendingOrder(Integer[] inputArray) {
	
		Integer[] input=inputArray;
		System.out.println("***-Before Sorting-***");
		System.out.println(Arrays.toString(input));

		Arrays.sort(input,Collections.reverseOrder());
		
		System.out.println("***-After Sorting-***");
		System.out.println(Arrays.toString(input));
		
	}
	


}

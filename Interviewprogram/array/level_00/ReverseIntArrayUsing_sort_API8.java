package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * JAVA    : 1.8
 * 8.8     : Write a Java program to sort the numeric array using 
 * 		     “Arrays.parallelSort(userInput,Collections.reverseOrder())”in descending order.
 * API     : “Arrays.parallelSort(userInput,Collections.reverseOrder())"
 * INPUT   : { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 }     
 * Output  : { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }
*/

public class ReverseIntArrayUsing_sort_API8 {

	public static void main(String[] args) {

		Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		System.out.println("***-Using Arrays.parallelSort(array, Collections.reverseOrder())- "
				+ "Sort in descending order. ***");
		
		ReverseIntArrayUsing_sort_API8.getReversedArrayDesendingOrder(inputArray);
	}

	private static void getReversedArrayDesendingOrder(Integer[] inputArray) {
		
		Integer[] input=inputArray;
		
		System.out.println("***-Before Sorting-***");
		System.out.println(Arrays.toString(input));
		
		//descending order sorting 
		Arrays.parallelSort(input,Collections.reverseOrder());
		
		System.out.println("***-After Sorting-***");
		System.out.println(Arrays.toString(input));
	}

}

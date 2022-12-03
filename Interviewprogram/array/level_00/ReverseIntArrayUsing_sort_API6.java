package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * JAVA    : 1.8
 * 8.6 Write a Java program to sort the numeric array using “Arrays.parallelSort(userInput)”.
 * API     : Arrays.parallelSort(userInput);
 * INPUT   : { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 }     
 * Output  : { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
*/

public class ReverseIntArrayUsing_sort_API6 {

	public static void main(String[] args) {

		Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		System.out.println("***-Using Arrays.parallelSort();- Sort an Integer Array ***");
		
		ReverseIntArrayUsing_sort_API6.getSortedArray(inputArray);
	}

	private static void getSortedArray(Integer[] inputArray) {
		
		Integer[] input=inputArray;
		
		System.out.println("***-Before Sorting-***");
		System.out.println(Arrays.toString(input));
		
		//Sorting logic
		Arrays.parallelSort(input);
		
		System.out.println("***-After Sorting-***");
		System.out.println(Arrays.toString(input));
	}

}

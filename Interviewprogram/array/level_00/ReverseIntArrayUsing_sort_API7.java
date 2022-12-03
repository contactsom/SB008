package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * JAVA    : 1.8
 * 8.7 Write a Java program to sort the numeric sub-array using “Arrays.parallelSort(Array,From,To)”
 * API     :Arrays.parallelSort(userInput, 2, 6);
 * INPUT   : { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 }     
 * Output  : { 6, 7, 3, 4, 5, 8, 9, 1, 0, 2 }
*/

public class ReverseIntArrayUsing_sort_API7 {

	public static void main(String[] args) {

		Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		int fromIndex=2;
		int toIndex=6;
		
//		[6, 7, 4, 5, 8, 3, 9, 1, 0, 2]
//			   4, 5, 8, 3, 9
//		[6, 7, 3, 4, 5, 8, 9, 1, 0, 2]
						
		System.out.println("***-Using Arrays.parallelSort(array,from,to);- Sort a Sub-Array ***");
		
		ReverseIntArrayUsing_sort_API7.getSortSubArray(inputArray,fromIndex,toIndex);
	}

	private static void getSortSubArray(Integer[] inputArray, int fromIndex, int toIndex) {
		
		Integer[] input=inputArray;
		int from=fromIndex;
		int to=toIndex;
		
		System.out.println("***-Before Sorting-***");
		System.out.println(Arrays.toString(input));
		
		//Logic to sort for sub-array 
		Arrays.parallelSort(input, from, to);
		
		System.out.println("***-After Sorting-***");
		System.out.println(Arrays.toString(input));
		
	}


}

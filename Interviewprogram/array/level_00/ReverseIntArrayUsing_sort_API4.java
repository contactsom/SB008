package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * JAVA    : 1.8
 * 8.4     : Write a Java program to sort the numeric array using "Collections.sort()".
 * API     : Collections.sort(list);
 * INPUT   : { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2}     
 * Output  : { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
*/

public class ReverseIntArrayUsing_sort_API4 {

	public static void main(String[] args) {

		Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };
		System.out.println("***-Using Collections.sort() Sort a Array-***");

		ReverseIntArrayUsing_sort_API4.getSortedArray(inputArray);
		
	}

	private static void getSortedArray(Integer[] inputArray) {
		Integer[] input=inputArray;
		
		System.out.println("***-Before Sort-***");
		System.out.println(Arrays.toString(input));
		
		//Convert from Array to List
		List<Integer> list=Arrays.asList(input);
		Collections.sort(list);
		
		//Convert from List to Array
		Integer[] outputArray=(Integer[]) list.toArray();
		
		System.out.println("***-After Sort-***");
		System.out.println(Arrays.toString(outputArray));
	}

}

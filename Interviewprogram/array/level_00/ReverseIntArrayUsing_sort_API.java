package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.List;

/*
 * JAVA    : 1.8
 * 8.1     : Write a Java program to sort the numeric array using “Arrays.sort”.
 * API     : Arrays.sort(Array);
 * INPUT   : { 6, 7, 3, 4, 5, 8, 9, 10, 1, 2 }     
 * Output  : { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
 * Recommended Watch:
 * 			8 Write a Java program to sort the numeric array
*/

public class ReverseIntArrayUsing_sort_API {

	public static void main(String[] args) {

		int[] inputArray = { 6, 7, 3, 4, 5, 8, 9, 10, 1, 2 };
		int[] _inputArray = { 5, 1, 4 };
		int length = 3;

		int output=ReverseIntArrayUsing_sort_API.FindIt(_inputArray, length);
		System.out.println(output);
		// ReverseIntArrayUsing_sort_API.getArraySorted(inputArray);

	}

	private static int getArraySorted(int[] inputArray) {

		if (inputArray.length > 0 && inputArray != null) {

		}

		int[] input = inputArray;
		int output;
		System.out.println("***-Before Sorting the Array-***");
		System.out.println(Arrays.toString(input));

		// Sorting Logic
		Arrays.sort(input);

		System.out.println("***-After Sorting the Array-***");
		System.out.println(Arrays.toString(input));

		// output=Arrays.toString(input).charAt(0);

		output = Arrays.asList(input).indexOf(0);
		System.out.println("Output-> " + output);

		return output;
	}

	static int FindIt(int[] arr, int n) {
		// Write your code here

		int[] inputArray = arr;
		int length = n;
		int output = 0;

		if (inputArray.length > 0 && inputArray != null) {
			
			Arrays.sort(inputArray);
			System.out.println("***-After Sorting the Array-***");
			output=inputArray[0];
		    System.out.println("Min value "+output);

		}
		return output;
	}
}

package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * JAVA    : 1.8
 * 13.1	Reverse the Integer array using "Collections.reverse(list)"
 * INPUT   : { 1, 4, 9, 16, 9, 7, 4, 9, 11 };   
 * Output  : { 11, 9, 4, 7, 9, 16, 9, 4, 1 };
 * 
 * Recommendation Watch: 
 * 	13. Write a Java program to reverse an array of integer values.
*/

public class ReverseIntArrayAPI {

	public static void main(String[] args) {

		Integer[] userArray = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };

		ReverseIntArrayAPI.getReversedArray(userArray);

	}

	private static void getReversedArray(Integer[] userArray) {

		Integer[] inputArray = userArray;

		System.out.println("***-Before Reverse-*** ");
		System.out.println(Arrays.toString(inputArray));

		// Conver from Array to List ->Arrays.asList(array)

		List<Integer> list = Arrays.asList(inputArray);

		// List got Reversed
		Collections.reverse(list);

		// Convert from List to Array ->list.toArray();
		Integer[] arr = (Integer[]) list.toArray();

		System.out.println("***-After Reverse-*** ");
		System.out.println(Arrays.toString(arr));

	}

}

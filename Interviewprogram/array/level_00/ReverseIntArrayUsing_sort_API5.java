package com.apipothi.array.level_00;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * JAVA    : 1.8
 * 8.5     : Write a Java program to sort the numeric array using "Collections.sort()" 
 * 			 in descending order.
 * API     : Collections.sort(list,Collections.reverseOrder());
 * INPUT   : { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2}     
 * Output  : { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }
*/

public class ReverseIntArrayUsing_sort_API5 {

	public static void main(String[] args) {

		/* Start- Get the Data from User */
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the length of the array:");

		Integer length = s.nextInt();
		Integer[] inputArray = new Integer[length];

		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			inputArray[i] = s.nextInt();
		}
		/* End-Get the Data from User */

		System.out.println(
				"***-Using Collections.sort(list,Collections.reverseOrder())" + "- Sort a Array in Revese Order ***");

		//Integer[] inputArray = { 6, 7, 4, 5, 8, 3, 9, 1, 0, 2 };

		ReverseIntArrayUsing_sort_API5.getDesendingOrderArray(inputArray);

	}

	private static void getDesendingOrderArray(Integer[] inputArray) {
		Integer[] input = inputArray;

		System.out.println("***-Before Revrse-***");
		System.out.println(Arrays.toString(input));

		// From Array to List
		List<Integer> list = Arrays.asList(input);

		// Reverse the list in descending order
		Collections.sort(list, Collections.reverseOrder());
		
		// Typecasting and Converting from List to Array
		Integer[] outputArray = (Integer[]) list.toArray();

		System.out.println("***-After Revrse-***");
		System.out.println(Arrays.toString(outputArray));

	}

}

/*
 * JAVA    : 1.8
 * 
 * 10.Write a Java program to find the second largest element in an Integer array.
 * INPUT : { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
 * Output: 55
*/
package com.apipothi.array.level_00;

public class SecondLargestValue {

	public static void main(String[] args) {

		int[] userInput = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		int output = SecondLargestValue.getSecondHigestElement(userInput);
		System.out.println("Second Higest Element is -> " + output);

	}

	private static int getSecondHigestElement(int[] userInput) {

		int[] input = userInput;

		int firstHigest = input[0];
		int secondHigest = input[0];

		for (int i = 1; i < input.length; i++) {

			if (input[i] > firstHigest) {

				secondHigest = firstHigest;
				firstHigest = input[i];
			}
		}

		return secondHigest;

	}

}

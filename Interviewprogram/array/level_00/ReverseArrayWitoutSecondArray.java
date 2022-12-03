/*
 * JAVA    : 1.8
 *14. Write a java program to reverse an array without using an additional array
 *INPUT     :  { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
 *Output    :  { 95, 55, 36, 48, 52, 20, 20, 47, 46, 10 }; 
*/
package com.apipothi.array.level_00;

import java.util.Arrays;

public class ReverseArrayWitoutSecondArray {

	public static void main(String[] args) {

		int[] userInput = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		ReverseArrayWitoutSecondArray.getReverseWithoutAdditionalArray(userInput);

	}

	private static void getReverseWithoutAdditionalArray(int[] userInput) {

		int[] input = userInput;

		System.out.println("Before Reverse");
		System.out.println(Arrays.toString(input));
		
		int middle = input.length / 2;
		int j = input.length - 1;

		for (int i = 0; i < middle; i++, j--) {

			int tmp = input[i];
			input[i] = input[j];
			input[j] = tmp;
		}

		System.out.println("After Reverse");
		System.out.println(Arrays.toString(input));

	}
}

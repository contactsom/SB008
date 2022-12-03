/*
 * JAVA    : 1.8
 *
 *13. Write a Java program to reverse an array of integer values.
 *INPUT     :  { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
 *Output    :  { 95, 55, 36, 48, 52, 20, 20, 47, 46, 10 }; 
*/

package com.apipothi.array.level_00;

import java.util.Arrays;

public class ReverseArrayElement {

	public static void main(String[] args) {

		int[] userInput = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		ReverseArrayElement.getReverse(userInput);

	}

	private static void getReverse(int[] userInput) {

		int[] input = userInput;
		int[] reverse = new int[input.length];
		int k = 0;
        
		System.out.println("Befor Reverse");
		System.out.println(Arrays.toString(input));

		for (int i = input.length - 1; i >= 0; i--) {

			reverse[k] = input[i];
			k++;
		}
		System.out.println("After Reverse");
		System.out.println(Arrays.toString(reverse));

	}
}

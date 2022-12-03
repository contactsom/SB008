/*
 * JAVA    : 1.8
 *
 * 12.Write a Java program to copy an array element from OLD array to new Array by iterating the OLD array.
 *INPUT     :  
 		OLD Array->[10, 46, 47, 20, 20, 52, 48, 36, 55, 95]
 *Output    :
		New Array->[10, 46, 47, 20, 20, 52, 48, 36, 55, 95]
*/

package com.apipothi.array.level_00;

import java.util.Arrays;

public class CoppyArrayFromOLDtoNEW {

	public static void main(String[] args) {

		int[] userInput = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		CoppyArrayFromOLDtoNEW.getCopy(userInput);

	}

	private static void getCopy(int[] userInput) {

		int[] input = userInput;
		int[] newArray = new int[input.length];

		System.out.println("OLD Array");
		System.out.println(Arrays.toString(input));

		for (int i = 0; i < input.length; i++) {

			newArray[i] = input[i];
		}

		System.out.println("NEW Array");
		System.out.println(Arrays.toString(newArray));

	}
}

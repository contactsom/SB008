package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : 01.How to find first non-repeating element in array of Integers.
 * INPUT   : { 19, 24, 19, 36, 47, 24 };
 * Output  : 36
 
 * */
public class FirstNonRepeatingElement {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 36, 47, 24, 19 };
		int output=FirstNonRepeatingElement.getNonRepeatingElement(arr);
		System.out.println("First Non Repeating Element->"+output);

	}

	public static int getNonRepeatingElement(int[] arr) {

		int[] inputArray = arr;

		System.out.println("Input Array");
		System.out.println(Arrays.toString(inputArray));

		int length = inputArray.length;

		System.out.println("Length Of Array->" + length);

		for (int i = 0; i < length; i++) {

			int j;
			for (j = 0; j < length; j++) {

				if (i != j && inputArray[i] == inputArray[j]) {
					break;
				}
			}

			if (j == length) {
				return inputArray[i];
			}
		}
		return -1;

	}

}

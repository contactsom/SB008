package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : 02.How find the first repeating element in an array of integers.
 * INPUT   : { 19, 24, 19, 36, 47, 24 };
 * Output  : 19

 * */
public class FirstRepeatingElement {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 19, 36, 47, 24 };

		int output = FirstRepeatingElement.getFirstRepeatingElement(arr);

		if (output == -1) {
			System.out.println("This is not first repeating element");
		} else {

			System.out.println("first repeating element->" + output);
		}

	}

	private static int getFirstRepeatingElement(int[] arr) {

		int[] input = arr;

		System.out.println("Input Element");
		System.out.println(Arrays.toString(input));

		int length = input.length;

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length; j++) {

				if (i != j && input[i] == input[j]) {
					return input[i];
				}
			}
		}
		return -1;

	}

}

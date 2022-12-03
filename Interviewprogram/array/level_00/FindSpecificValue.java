package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * Program : 4.Write a Java program to test if an array contains a specific value.
 * INPUT   : { 1, 4, 5, 6, 7, 20 };
 * Element : 7
 * Output  : YES
 * */

public class FindSpecificValue {

	public static void main(String[] args) {

		int[] userInput = { 1, 4, 5, 6, 7, 20 };
		int specificElement = 7;

		FindSpecificValue.getSpecificValue(userInput, specificElement);
	}

	public static void getSpecificValue(int[] userInput, int specificElement) {

		int[] input = userInput;
		int element = specificElement;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == element) {
				System.out.println("YES");
			}

		}

	}

}

package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * Program : 7.Write a Java program to find the maximum and minimum value of an array.
 * INPUT   : { 1, 5, 9, 50, 20, 30 };
 * Output  : 
 * 			MAX : 50
 * 			MIN : 1
 * */

public class MaxAndMinElement {

	public static void main(String[] args) {

		int[] userInput = { 1, 5, 9, 50, 20, 30 };

		MaxAndMinElement.getMax(userInput);
		MaxAndMinElement.getMin(userInput);
	}

	public static void getMax(int[] userInput) {

		int[] input = userInput;
		int maxVal = input[0];

		for (int i = 1; i < input.length; i++) {

			if (input[i] > maxVal) {
				maxVal = input[i];
			}
		}

		System.out.println("MAX->" + maxVal);

	}

	public static void getMin(int[] userInput) {

		int[] input = userInput;
		int minVal = input[0];

		for (int i = 1; i < input.length; i++) {

			if (input[i] < minVal) {
				minVal = input[i];
			}
		}

		System.out.println("MIN->" + minVal);

	}
}

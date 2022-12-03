package com.apipothi.array.level_00;
/*
 * JAVA    : 1.8
 * Program : 2.Write a Java program to sum values of an array.
 * INPUT   : { 1, 4, 5, 6, 7, 20 };
 * Output  : 43
 * */

public class ArrayValueSum {

	public static void main(String[] args) {

		int userInput[] = { 1, 4, 5, 6, 7, 20 };
		int output=ArrayValueSum.getArraySum(userInput);
		System.out.println("Output SUM is->"+output);

	}

	public static int getArraySum(int[] userInput) {

		int[] input = userInput;
		int sum = 0;

		for (int i = 0; i < input.length; i++) {

			sum = sum + input[i];
		}

		return sum;
	}

}

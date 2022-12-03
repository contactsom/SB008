package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * Program : 3.Write a Java program to calculate the average value of array!.
 * INPUT   : { 1, 4, 5, 6, 7, 20 };
 * Output  : 7.167
 * */
public class AverageOfArray {

	public static void main(String[] args) {

		int[] userInput = { 1, 4, 5, 6, 7, 20 };

		float output = AverageOfArray.getAverage(userInput);

		System.out.println("Average of an array is->" + output);

	}

	public static float getAverage(int[] userInput) {

		int[] input = userInput;
		int sum = 0;
		float length = 0;
		float average = 0;
		
		for (int i = 0; i < input.length; i++) {

			sum = sum + input[i];
		}
		length = input.length;
		average = sum / length;
		return average;
	}
}

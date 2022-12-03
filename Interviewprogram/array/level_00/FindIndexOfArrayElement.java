package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * Program : 4.Write a Java program to find the index of specific element in an array
 * INPUT   : { 1, 4, 5, 6, 7, 20 };
 * Element : 7
 * Output  : 4
 * */

public class FindIndexOfArrayElement {

	public static void main(String[] args) {

		int inputArray[] = { 1, 4, 5, 6, 7, 20 };
		int element = 7;

		FindIndexOfArrayElement.getIndexinArray(inputArray, element);

	}

	public static void getIndexinArray(int[] inputArray, int element) {

		int[] input = inputArray;
		int arrayElement = element;

		for (int i = 0; i < input.length; i++) {

			if (input[i] == arrayElement) {
			
				System.out.println("Got the  element at index ->"+i);
			
			} 
		}

	}

}

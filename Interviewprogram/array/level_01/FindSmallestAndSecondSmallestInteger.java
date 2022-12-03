package com.apipothi.array.level_01;

/*
 * JAVA    : 1.8
 * Program : 04.Write a Java program to find smallest and second smallest elements of a given Integer array
 * INPUT   : { 1, 34, 89, 2, 43, 34, 65, 67, 98, 10, 100 };
 * Output  : 
 * 			Smallest Element of an Array        :1 
			Second Smallest Element of an Array :2		

 * */

import java.util.Arrays;

public class FindSmallestAndSecondSmallestInteger {

	public static void main(String[] args) {

		int[] integerArray = { 1, 34, 89, 2, 43, 34, 65, 67, 98, 10, 100 };

		int[] sortedArray = FindSmallestAndSecondSmallestInteger.getSmallestAndSecondSmallestInteger(integerArray);

		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(sortedArray));
		
		FindSmallestAndSecondSmallestInteger.display(sortedArray);

	}

	private static int[] getSmallestAndSecondSmallestInteger(int[] integerArray) {

		int[] input = integerArray;
		System.out.println("Input Array ");
		System.out.println(Arrays.toString(input));

		int tmp = 0;

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (input[i] > input[j]) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}

		return input;

	}
	
	public static void display(int[] sortedArray){
		System.out.println("Smallest Element of an Array->"+sortedArray[sortedArray.length-1]);
		System.out.println("Second Smallest Element of an Array ->"+sortedArray[sortedArray.length-2]);
		
	}
	
	
	
	
	
	

}

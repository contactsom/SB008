package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : 03.Write a Java program to find the duplicate values of an integer array values.
 * INPUT   : { 19, 24, 19, 36, 47, 24 };
 * Output  : { 19, 24 }

 * */

public class FindDuplicateIntValues {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 19, 36, 47, 24 };
		FindDuplicateIntValues.getDuplicateValues(arr);

	}

	private static void getDuplicateValues(int[] arr) {

		int[] input = arr;

		System.out.println("Input Element");
		System.out.println(Arrays.toString(input));

		int length = input.length;
		
		int[] tmpArray=new int[length];

		int k=0;
		
		for (int i = 0; i < input.length; i++) {

			for (int j = i; j < input.length; j++) {

				if (i != j && input[i] == input[j]) {
					
					tmpArray[i]=input[i];
					k++;
				}
			}
		}
		
/*		System.out.println("Tmp Array");
		System.out.println(Arrays.toString(tmpArray));
		System.out.println("What is K Value->"+k);
*/		
		int[] output_Array=new int[k];
		
		for (int i = 0; i < output_Array.length; i++) {
			
			output_Array[i]=tmpArray[i];
		}
		
		System.out.println("OutPut Array");
		System.out.println(Arrays.toString(output_Array));
	}

}

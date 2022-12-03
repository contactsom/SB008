package com.apipothi.array.level_01;

import java.util.Arrays;

/*
 * JAVA    : 1.8
 * Program : Write a Java Program to rotate the Array depends on number of rotation dynamically.
 * INPUT   : Array=[1,2,3,4,5], Number or Rotation=3
 *      Ex :
 * 		     Rotation 0 -[1,2,3,4,5]
 * 			 Rotation 1 -[2,3,4,5,1]
 * 			 Rotation 2 -[3,4,5,1,2]
 * 			 Rotation 3 -[4,5,1,2,3]
 *           Rotation 4 -[5,1,2,3,4]
 *           Rotation 5 -[1,2,3,4,5]
 * Output  : 
 * 			[4,5,1,2,3] 

 * */
public class ArraysLeftRotation {

	public static void main(String[] args) {

		int input_arr[] = { 1, 2, 3, 4, 5 };
		int rotation = 3;

		int[]  rotateArray=ArraysLeftRotation.getRotate(input_arr, rotation);
		
		ArraysLeftRotation.diaplayArray(rotateArray);
		

	}


	private static int[] getRotate(int[] input_arr, int rotation) {

		int[] array = input_arr;
		int rotate = rotation;

		for (int i = 0; i < rotate; i++) {

			int tmp = array[0];
			int j = 0;

			for (j = 0; j < array.length-1; j++) {

				array[j] = array[j + 1];

			}
			array[j] = tmp;

		}
		return array;
	}
	

	private static void diaplayArray(int[] rotateArray) {
		
		int[] array=rotateArray;
/*
		System.out.println("***Rotate Array***");
		System.out.println(Arrays.toString(array));*/
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}

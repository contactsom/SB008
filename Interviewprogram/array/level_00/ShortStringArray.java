package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * 9.Write a Java program to sort the String array.
 * INPUT   : { "Z", "D", "A", "M", "B", "L", "C", "X" }     
 * Output  : { “A”, “B”, “C”, “D”, “L”, “M”, “X”, “Z”}
*/

public class ShortStringArray {

	public static void main(String[] args) {

		String[] inputArray = { "Z", "D", "A", "M", "B", "L", "C", "X" };
		String[] output=ShortStringArray.getShortedStringArray(inputArray);
		
		for (int i = 0; i < output.length; i++) {
			
			System.out.print(output[i]+" ");
		}

	}

	public static String[] getShortedStringArray(String[] inputArray) {

		String[] input = inputArray;

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				// compareTo(); +Ve,-Ve,0

				if (input[i].compareTo(input[j]) > 0) {

					String tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}

				//A B C D L M X Z 
				//Z X M L D C B A 
			}
		}
		// End
		return input;

	}

}

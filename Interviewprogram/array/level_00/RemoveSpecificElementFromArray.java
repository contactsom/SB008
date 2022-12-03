/*
 * JAVA    : 1.8
 *
 * 11.Write a Java program to remove the specific element from an an integer array.
 *
 *INPUT     :  { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
 *To Remove :  55       
 *Output    :  { 10, 46, 47, 20, 20, 52, 48, 36, 95, 0 }; 
*/
package com.apipothi.array.level_00;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {

		int[] userInput = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };
		int toRemove = 55;

		RemoveSpecificElementFromArray.toRemoveElement(userInput, toRemove);

	}

	private static void toRemoveElement(int[] userInput, int toRemove) {

		int[] input = userInput;
		int remove = toRemove;

		System.out.println("Before Remoning the Element");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		
		for (int i = 0; i < input.length; i++) {

			if (input[i] == remove) {
				// remove logic
				input[i] = input[i + 1];
				input[i + 1] = 0;

			} 
		}
		System.out.println();
		System.out.println("After removing the element "+remove);
		for (int i = 0; i < input.length; i++) {
			
			System.out.print(input[i]+" ");
		}

	}

}

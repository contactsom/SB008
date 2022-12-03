/*
 * JAVA    : 1.8
 * 15.Write a Java program to find the common elements between two integers arrays.
 * INPUT     : 
 * 		firstArray  = { 1, 4, 6, 90, 34, 76, 89 };
 *  	secondArray = { 34, 76, 89, 1, 4, 6, 90,100 };
 *  
 * Output    :  { 1, 4, 6, 90, 34, 76, 89};
*/
package com.apipothi.array.level_00;

public class CommonIntegerElement {

	public static void main(String[] args) {

		int[] firstArray = { 1, 4, 6, 90, 34, 76, 89 };
		int[] secondArray = { 34, 76, 89, 1, 4, 6, 90, 100 };

		CommonIntegerElement.getCommanElement(firstArray, secondArray);

	}

	private static void getCommanElement(int[] firstArray, int[] secondArray) {

		int[] _firstArray = firstArray; // 10
		int[] _secondArray = secondArray;// 7

		int length = (_firstArray.length < _secondArray.length) ? _firstArray.length : _secondArray.length;

		int[] tmpArray = new int[length];// 10 & 7,6
		int k = 0;

		for (int i = 0; i < _firstArray.length; i++) {

			for (int j = 0; j < _secondArray.length; j++) {

				if (_firstArray[i] == _secondArray[j]) {

					tmpArray[k] = _firstArray[i];
					k++;
				}
			}
		}

		int[] output = new int[k];
		int m = 0;

		for (int i = 0; i < output.length; i++) {

			output[i] = tmpArray[m];
			m++;
		}

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

}

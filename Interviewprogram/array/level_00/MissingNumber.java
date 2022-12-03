/*
 * How to find the missing number in integer array of 1 to 10?
 * INPUT : 1,2,3,4,5,6,8,9,10
 * Output: 7
*/

package com.apipothi.array.level_00;

public class MissingNumber {

	public static void main(String[] args) {
		int myArray[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int len = 10;
		int otput=MissingNumber.getMissingInteger(myArray, len);
		System.out.println("Missing Number is ->"+otput);

	}

	public static int getMissingInteger(int[] myArray, int len) {

		int[] inputArray = myArray;
		int inputLength = len;
		int sum = 0;
		int actualSum = 0;
		int missingNumber = 0;

		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}
		// [n*(n+1)]/2
		// Were n= number of Element
		actualSum = (inputLength * (inputLength + 1)) / 2;
		missingNumber = actualSum - sum;
		return missingNumber;
	}

}

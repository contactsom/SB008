package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 11.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI"
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringSecondWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringSecondWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		String output = "";

		char[] inputChar = inputString.toCharArray();

		for (int i = inputChar.length; i > 0; i--) {

			output = output + inputChar[i - 1];
		}

		System.out.println("***-After Reverse-***");
		System.out.println(output);

	}

}

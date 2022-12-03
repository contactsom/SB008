package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 14.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI"
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringFifthWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringFifthWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			stringBuilder.append(inputString.charAt(i));

		}

		System.out.println("***-After Reverse-***");
		System.out.println(stringBuilder);

	}

}

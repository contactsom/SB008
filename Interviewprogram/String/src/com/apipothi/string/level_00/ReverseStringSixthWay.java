package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 15.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI"
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringSixthWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringSixthWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuffer sb = new StringBuffer();

		for (int i = inputString.length() - 1; i >= 0; i--) {

			sb = sb.append(inputString.charAt(i));

		}

		System.out.println("***-After Reverse-***");
		System.out.println(sb);
	}

}

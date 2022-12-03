package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 12.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI"
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringThirdWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringThirdWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;

		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		StringBuffer sb = new StringBuffer();
		sb.append(inputString);

		StringBuffer output = sb.reverse();
		System.out.println("***-After Reverse-***");
		System.out.println(output);

	}

}

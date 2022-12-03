package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 10.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI" 
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringFirstWay {

	public static void main(String[] args) {
		String str = "APIPOTHI";

		ReverseStringFirstWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String userinput = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(userinput);
		String outPut = "";

		for (int i = 0; i < userinput.length(); i++) {
			outPut = outPut + userinput.charAt(userinput.length() - 1 - i);
		}

		System.out.println("***-After Reverse-***");
		System.out.println(outPut);

	}

}

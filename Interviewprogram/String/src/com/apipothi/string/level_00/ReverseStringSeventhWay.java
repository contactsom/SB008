package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 16.Write a java program to reverse a string?
 * INPUT     : "APIPOTHI"
 * Output    : "IHTOPIPA" 
 * */

public class ReverseStringSeventhWay {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		ReverseStringSeventhWay.getReverseString(str);

	}

	private static void getReverseString(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		byte[] inputAsByteArray = inputString.getBytes();
		String outout = "";

		for (int i = 0; i < inputAsByteArray.length; i++) {

			char c = (char) inputAsByteArray[inputAsByteArray.length - i - 1];
			outout = outout + c;

		}
		System.out.println("Output String : " + outout);

	}

}

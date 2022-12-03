package com.apipothi.string.level_00;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 17.Write a java program to reverse each word of a given string?
 * INPUT     : "I LOVE API POTHI"
 * Output    : "POTHI API LOVE I" 
 * */

public class ReverseWord {

	public static void main(String[] args) {

		String str = "I LOVE API POTHI";

		ReverseWord.getReverseWord(str);

	}

	private static void getReverseWord(String str) {

		String inputString = str;
		System.out.println("***-Before Reverse-***");
		System.out.println(inputString);

		String wordArray[] = inputString.split(" ", inputString.length());
		String output = "".trim();

		for (int i = wordArray.length - 1; i >= 0; i--) {

			output = output + wordArray[i]+" ";

		}
		
		System.out.println("***-After Reverse-***");
		System.out.println(output);

	}

}

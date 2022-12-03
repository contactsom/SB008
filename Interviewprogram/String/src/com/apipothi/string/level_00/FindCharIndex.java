package com.apipothi.string.level_00;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 2.Write a Java program to get the character at the given index within the String.
 * INPUT   : 
 * 			 String : APIPOTHI;
 * 			 Index  : 5
 * Output  : 
 * 			Character :T at Index :5
 * */

public class FindCharIndex {

	public static void main(String[] args) {

		String str = "APIPOTHI";
		int index = 5;

		FindCharIndex.getChar(str, index);

	}

	private static void getChar(String str, int index) {

		String userString = str;
		int userIndex = index;

		System.out.println("User String- " + userString + " -User Index- " + userIndex);

		char[] chaarArray = userString.toCharArray();

		for (int i = 0; i < chaarArray.length; i++) {

			if (i == userIndex) {

				System.out.println("Character->" + chaarArray[i] + "-at Index->" + i);
			}

		}

	}

}

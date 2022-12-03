package com.apipothi.string.level_00;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 4.How to count occurrence of a given character in String
 * INPUT   : 
 * 			 String : APIPOTHI;
 * 			 character = 'I';
 * Output  : 
 * 			Character -I Occurs -2 Times
 * */
public class FindCount {

	public static void main(String[] args) {

		String str = "APIPOTHI";
		char character = 'I';

		FindCount.getOccurance(str, character);

	}

	private static void getOccurance(String str, char character) {

		String userString = str;
		char userChar = character;
		int counter = 0;

		System.out.println("-User String-" + userString + "-User Charecter->" + userChar);

		char[] userCharacter = userString.toCharArray();

		for (int i = 0; i < userCharacter.length; i++) {

			if (userCharacter[i] == userChar) {
				counter++;
			}

		}

		System.out.println("Character " + userChar + " Occurs " + counter + " Times");
	}

}

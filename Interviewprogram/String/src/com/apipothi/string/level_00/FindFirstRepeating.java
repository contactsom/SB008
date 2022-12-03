package com.apipothi.string.level_00;

import java.util.HashMap;
import java.util.Map;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 8.How do you find first repeated character in the given string in java?
 * INPUT     : APIPOTHI;
 * Output    : First repeated character in String "APIPOTHI" is:P occurred  -2 times
 * *Recommendation : 7. Write a program to print first non repeated character from String?
 * */
public class FindFirstRepeating {

	public static void main(String[] args) {

		String str = "APIPOTHI";
		FindFirstRepeating.getFirstRepetedChar(str);

	}

	private static void getFirstRepetedChar(String str) {

		String userInput = str;
		System.out.println("User Input->" + userInput);

		char[] userChar = userInput.toCharArray();

		Map<Character, Integer> occuranceMap = new HashMap<Character, Integer>();

		for (int i = 0; i < userChar.length; i++) {

			if (occuranceMap.containsKey(userChar[i])) {

				occuranceMap.put(userChar[i], occuranceMap.get(userChar[i]) + 1);

			} else {
				occuranceMap.put(userChar[i], 1);
			}
		}

		System.out.println("Character Occurance");
		System.out.println(occuranceMap);

		for (char charValue : userChar) {

			if (occuranceMap.get(charValue) > 1) {
				System.out.println("First repeated character in String  " + userInput +
									" is " + charValue
									+ " occurred " + occuranceMap.get(charValue)+" times");
				break;
			}
		}
	}
}

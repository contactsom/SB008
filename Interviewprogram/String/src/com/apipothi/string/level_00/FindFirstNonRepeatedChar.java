package com.apipothi.string.level_00;

import java.util.HashMap;
import java.util.Map;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/c/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 7. Write a program to print first non repeated character from String?
 * INPUT     : APIPOTHI;
 * Output    : First non repeated character in String "APIPOTHI" is:A
 * */
public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {

		String str = "APIPOTHI";

		FindFirstNonRepeatedChar.getFirstNonRepeatChar(str);

	}

	private static void getFirstNonRepeatChar(String str) {

		String userString = str;

		char[] inputChar = userString.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < inputChar.length; i++) {

			if (map.containsKey(inputChar[i])) {
				map.put(inputChar[i], map.get(inputChar[i]) + 1);
			} else {
				map.put(inputChar[i], 1);

			}
		}

		System.out.println("Map Element->" + map);

		for (char ch : inputChar) {

			if (map.get(ch) == 1) {
				System.out.println("First non repeated character in String " + 
						userString + " is " + ch);
				break;
			}

		}

	}

}

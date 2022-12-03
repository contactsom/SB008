package com.apipothi.string.level_00;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Author  : API POTHI [https://www.youtube.com/c/apipothi]
 * JAVA    : 1.8
 * Program : 6. How  to return highest occurred character in a String?
 * INPUT   : APIPOTHI;
 * Output  :Character - P Repeat - 2 Times Of Input String - APIPOTHI 
 * 			Character - I Repeat - 2 Times Of Input String - APIPOTHI
 * */

public class FindHigestOccurance {

	public static void main(String[] args) {

		String str = "APIPOTHI";
		/* 1. Get the Occurance of Each Charecter */
		Map<Character, Integer> map = FindHigestOccurance.getOccurance(str);

		// 2. Get higest Occurance of Charecter
		FindHigestOccurance.getHigestOccurance(map, str);

	}

	private static Map<Character, Integer> getOccurance(String str) {

		String userString = str;
		System.out.println("User Input String->" + userString);

		char[] charInput = userString.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < charInput.length; i++) {

			if (map.containsKey(charInput[i])) {

				map.put(charInput[i], map.get(charInput[i]) + 1);

			} else {
				map.put(charInput[i], 1);
			}
		}

		return map;

	}

	private static void getHigestOccurance(Map<Character, Integer> map, String str) {

		Map<Character, Integer> occuranceElement = map;
		String userString = str;
		
		int maxValueInMap = Collections.max(occuranceElement.values());
		
		for (Entry<Character, Integer> entry : occuranceElement.entrySet()) {

			if (entry.getValue() == maxValueInMap) {
				System.out.println("Character-" + entry.getKey() + " Repeat-" + maxValueInMap
						+ " Times Of Input String-" + userString);
			}
		}

	}

}

package com.apipothi.string.level_00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : STRING-Level-00
 * JAVA      : 1.8
 * Program   : 9.Write a java program to find the duplicate words and their number of occurrences
 * 				 in a string?
 * INPUT     : "Hello API POTHI I like to learn JAVA Programming from API POTHI ;
 * Output    : 
 *				Word - API Repeat - 2 Times Of Input String - Hello API POTHI I like to learn 
 *				JAVA Programming from API POTHI
 *				
 *				Word - POTHI Repeat - 2 Times Of Input String - Hello API POTHI I like to learn
 *				JAVA Programming from API POTHI
 *
 * */
public class FindDuplicateWordInString {

	public static void main(String[] args) {

		String str = "Hello API POTHI I  like to learn JAVA Programming from API POTHI";
		Map<String, Integer> finalOccurance = FindDuplicateWordInString.getWordOccurance(str);

		FindDuplicateWordInString.display(finalOccurance, str);

	}

	private static Map<String, Integer> getWordOccurance(String str) {

		String inputUser = str;

		System.out.println("-User Input-");
		System.out.println(inputUser);

		String[] words = inputUser.split(" ", inputUser.length());

		//System.out.println(Arrays.toString(words));

		Map<String, Integer> wordOccurance = new HashMap<>();

		for (int i = 0; i < words.length; i++) {

			if (wordOccurance.containsKey(words[i]) == true) {
				wordOccurance.put(words[i], wordOccurance.get(words[i]) + 1);

			} else {
				wordOccurance.put(words[i], 1);
			}

		}
		/*System.out.println("-Map Value-");
		System.out.println(wordOccurance);*/
		return wordOccurance;

	}

	private static void display(Map<String, Integer> finalOccurance, String str) {

		Map<String, Integer> wordOccur = finalOccurance;
		String userString = str;

		Set<String> keySet = wordOccur.keySet();

		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {

			String key = itr.next();
			Integer value = wordOccur.get(key);

			if (value > 1) {
				System.out.println("Word " + key + " Repeat  " + value
								+" Times Of Input String "+userString);
				
			}

		}

	}

}

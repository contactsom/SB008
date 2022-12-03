package com.apipothi.string.level_00;

/*
 * Author  : API POTHI
 * JAVA    : 1.8
 * Program : 5.Write a java program to count the total number of occurrences of a given character 
 * 			 in a string without using any loop
 * INPUT   : 
 * 			 String : APIPOTHI;
 * 			 character = 'I';
 * Output  : 
 * 			Number of occurrence of I in APIPOTHI = 2
 * */
public class FindOccurance {

	public static void main(String[] args) {

		String str = "APIPOTHI";
		char character = 'I';

		FindOccurance.getOccurance(str, character);

	}

	private static void getOccurance(String str, char character) {

		String userString = str;
		char userChar = character;
		String userCharStr = character + "";

		System.out.println("User Data");
		System.out.println("User String->" + userString + "-User Character->" + userChar);
		int lengthOfUserString = userString.length();
		// APIPOTHI - 8
		// APPOTH - 6
		// 'I' occuers (8-6) times
		// 'I' occuers (2) times

		String afterDeleteChar = userString.replace(userCharStr, "");
		int lengthAfterDelete = afterDeleteChar.length();
		int actualLength=lengthOfUserString-lengthAfterDelete;
		System.out.println("Number of Occurance of -"+userChar+" in "+userString+"="+actualLength);
		
		/*Start
		int count=userString.length()-userString.replace(userCharStr, "").length();
		System.out.println("Number of Occurance of -"+userChar+" in "+userString+"="+count);
		END*/
	}

}

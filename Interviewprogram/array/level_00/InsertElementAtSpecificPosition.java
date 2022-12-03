package com.apipothi.array.level_00;

/*
 * JAVA    : 1.8
 * Program : 6.Write a Java program to insert an element (specific position) into an array.
 * INPUT   :    
			 * int index     =   5;
			 * int arraysize =  11;
			 * int element   =  10;
 * Output  : 0 0 0 0 10 0 0 0 0 0 0
 * */
public class InsertElementAtSpecificPosition {

	public static void main(String[] args) {

		int index = 5;
		int arraysize = 11;
		int element = 10;

		InsertElementAtSpecificPosition.insertElement(index, arraysize, element);
	}

	public static void insertElement(int index, int arraysize, int element) {

		int array_index = index;
		int array_size = arraysize;
		int array_element = element;

		int[] userArray = new int[array_size];

		for (int i = 0; i < userArray.length; i++) {
			
			if(i==array_index){
				userArray[i]=array_element;
			}
		}
		
		for (int i = 0; i < userArray.length; i++) {
			
			System.out.println(userArray[i]);
		}

	}
}

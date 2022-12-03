package com.apipothi.array.level_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * JAVA    : 1.8
 * Program : 08. Write a java program to find union of two arrays?
 * INPUT   : 
	 * 		int arr_1[] = {1,2,3,4,5};
			int arr_2[] = {6,5,4,7,8};
 * Output  : 
 * 			{1,2,3,4,5,6,7,8} 
			

 * */

public class UnionArray {

	public static void main(String[] args) {

		Integer arr_1[] = { 1, 2, 3, 4, 5 };
		Integer arr_2[] = { 6, 5, 4, 7, 8 };
		
		UnionArray.getUnion(arr_1,arr_2);
		

	}

	private static void getUnion(Integer[] arr_1, Integer[] arr_2) {

		Integer[] firstArray=arr_1;
		Integer[] secondArray=arr_2;
		
		List<Integer> firstList=Arrays.asList(firstArray);
		List<Integer> secondList=Arrays.asList(secondArray);
		
		Set<Integer> set=new HashSet<Integer>();//Unique Elemet
		
		set.addAll(firstList);
		set.addAll(secondList);
		
		//System.out.println(set);
		
		Integer[] union={};
		union=set.toArray(union);
		
		System.out.println("Union Of Array");
		System.out.println(Arrays.toString(union));
		
		
	}

}

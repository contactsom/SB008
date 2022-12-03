package com.apipothi.array.level_01;

import java.util.Arrays;
/*
 * JAVA    : 1.8
 * Program : 06.Write a java program to find the most frequent element in an Integer array.
 * INPUT   : { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };
 * Output  : Value : 1 Occures Max : 5 Times

 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateIntValuesAndCount {

	public static void main(String[] args) {

		int arr[] = { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };

		Map<Integer, Integer> map=FindDuplicateIntValuesAndCount.FindMaxOccuranceNumber(arr);
		System.out.println(map);
		
		FindDuplicateIntValuesAndCount.display(map);
		

	}

	private static Map<Integer, Integer> FindMaxOccuranceNumber(int[] arr) {
		int[] inputArray = arr;

		System.out.println("***-User Input-***");
		System.out.println(Arrays.toString(inputArray));

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputArray.length; i++) {

			int key = 0;

			for (int j = 0; j < inputArray.length; j++) {

				if (inputArray[i] == inputArray[j]) {
					key++;
				}

			}

			//
			if (key > 1) {

				map.put(key, inputArray[i]);
			}
		}
		return map;

	}
	

	private static void display(Map<Integer, Integer> map) {
		
		Map<Integer, Integer> inputMap=map;
		
		Set<Integer> key=inputMap.keySet();
		
		TreeSet<Integer>  treeSet= new TreeSet<Integer>();
		treeSet.addAll(key);
		
		int lastKey=treeSet.last();
		
		System.out.println("Value->"+inputMap.get(lastKey)+"-Occures Max-"+lastKey+"-Times");
		
		
		
		
		
	}


}
package com.apipothi.array.level_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * JAVA    : 1.8
 * Program : 07.Write a Java program to find common elements from three sorted 
 * 				(in non-decreasing order) arrays.
 * INPUT   : 
	 * 		int arr_1[] = { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };
			int arr_2[] = { 19, 1, 24, 1, 19, 1, 36, 1, 89, 89 };
			int arr_3[] = { 19, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };
 * Output  : 
 * 			{1 19 36 24 89} 
			

 * */
public class CommonElementFromThreeArray {

	public static void main(String[] args) {

		int arr_1[] = { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };
		int arr_2[] = { 19, 1, 24, 1, 19, 1, 36, 1, 89, 89 };
		int arr_3[] = { 19, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };

		Set<Integer> commanElement=CommonElementFromThreeArray.getComman(arr_1, arr_2, arr_3);
		CommonElementFromThreeArray.displayComman(commanElement);

	}

	private static Set<Integer> getComman(int[] arr_1, int[] arr_2, int[] arr_3) {

		int[] firstArray = arr_1;
		int[] secondArray = arr_2;
		int[] thirdArray = arr_3;

		System.out.println("User Input");
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		System.out.println(Arrays.toString(thirdArray));

		/* START-Sorting logic */
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		Arrays.sort(thirdArray);
		/* End-Sorting logic */

		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		System.out.println(Arrays.toString(thirdArray));

		/* START-Find Comman element logic */

		Set<Integer> commanElement=new HashSet<Integer>();
		
		for (int i = 0; i < firstArray.length; i++) {

			for (int j = 0; j < secondArray.length; j++) {

				for (int k = 0; k < thirdArray.length; k++) {

					/* Find Comman */
					if (    firstArray[i] == secondArray[j] &&
							secondArray[j] == thirdArray[k] 
							) {
						
						commanElement.add(firstArray[i]);
					}

				}
			}
		}
		return commanElement;

		/* End-Find Comman element logic */

	}
	

	private static void displayComman(Set<Integer> commanElement) {
		
		Iterator<Integer> itr=commanElement.iterator();
		System.out.println("Comman Element");
		while(itr.hasNext()){
			System.out.print(itr.next()+"\n");
		}
		
	}

}

package com.simplilearn.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("A");
		
		System.out.println(hashSet);
		
		System.out.println("***** Using for Loop");
		
		for (String hs : hashSet) {

			System.out.println(hs);
		}
				
		
		System.out.println("***** Using Iterator ");
		Iterator<String> itr= hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}

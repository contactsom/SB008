package com.simplilearn.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<String>();
		//treeSet.add(null); // Not allowed 
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		System.out.println(treeSet);
		
		
		
	}
}

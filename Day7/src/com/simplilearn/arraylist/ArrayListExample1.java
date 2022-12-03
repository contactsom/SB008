package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();// 10
		l.add("Sushant");
		l.add("Jabeer");
		l.add("Sushant");
		l.add("Yogesh");
		l.add(null);
		
		System.out.println(l);
		System.out.println("***** On Index :");
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		// How to iterate the List Element
		System.out.println("***** Using For Each Loop :");
		
		for (String listValue : l) {
			System.out.println(listValue);
			
		}
		
		System.out.println("***** Using Iterator :");
		
		Iterator<String> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("***** Using List Iterator :");
		
		Iterator<String> listitr = l.listIterator();
		
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		
	}
	
	
	
	
	
}

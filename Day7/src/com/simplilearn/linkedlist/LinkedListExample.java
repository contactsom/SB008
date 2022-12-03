package com.simplilearn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		ll.add("Sushant");
		ll.add("Jabeer");
		ll.add("Sushant");
		ll.add("Yogesh");
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println("***** On Index :");
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));
		
		
		// How to iterate the List Element
		System.out.println("***** Using For Each Loop :");
				
		for (String listValue : ll) {
			
				System.out.println(listValue);
					
			}
				
		
		System.out.println("***** Using Iterator :");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		

		System.out.println("***** Using List Iterator :");
		
		Iterator<String> listitr = ll.listIterator();
		
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		
	}

	
	
	
}

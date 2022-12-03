package com.simplilearn.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<String> vector = new Vector<String>();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		
		System.out.println(vector);
		
		for (String vectors : vector) {
			
			System.out.println(vectors);
		}
		
		System.out.println("****** Using iterator");
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("****** Using List iterator");
		Iterator<String> litr = vector.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("****** Using Enumeration");
		
        Enumeration enumeration= Collections.enumeration(vector);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
		
		// nextElement();
		// hasMoreElements()
		
		
		
	}
}

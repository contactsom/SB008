package com.simplilearn.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Akash");
		map.put(102, "Yogesh");
		map.put(103, "Sushant");
		map.put(104, "Mayur");
		map.put(101, "AkashNew");
		map.put(105, "Mayur");
		
		System.out.println(map); 
		// {101=Akash, 102=Yogesh, 103=Sushant, 104=Mayur}
		// {101=AkashNew, 102=Yogesh, 103=Sushant, 104=Mayur}
		
		// How to iterate the Map
		
		 Set<Entry<Integer, String>> set = map.entrySet();
		
		 for (Entry<Integer, String> setelemet : set) {
			
			 int key =setelemet.getKey();
			 String value =setelemet.getValue();
			 
			System.out.println("KEY- "+key+" Value - "+value);
			 
		}
		
		 System.out.println("Using Key Set");
		 
		Set<Integer> keySet= map.keySet();
		
		for (Integer keyset : keySet) {
			
			Integer key = keyset;
			
			
			//System.out.println("KEY-"+key);
			String value = map.get(key);
			
			System.out.println("KEY- "+key+" VALUE- "+value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
	}
}

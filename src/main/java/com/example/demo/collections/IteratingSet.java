package com.example.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingSet {

	/**
	 * Set does not maintains insertion order
	 * does not Allows duplicates
	 * does not allows multiple null values
	 * only one null value is allowed
	 * 
	 * i/p for the below program is [Rekha, Kumar, null, null, Rekha]
	 * o/p for the below program is [null, Rekha, Kumar]
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Rekha");
		set.add("Kumar");
		set.add(null);
		set.add(null);
		set.add("Rekha");
		
		//enhanced for-loop
		for(String s:set) {
			System.out.println(s);
		}
		
		//iterator
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//streams forEach
		set.stream().forEach(System.out::println);
	}

}

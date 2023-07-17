package com.example.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {
	
	/**
	 * List maintains insertion order
	 * Allows duplicate
	 * allows multiple null values
	 * 
	 * i/p for the below program is [Rekha, Kumar, null, null, Rekha]
	 * o/p for the below program is [Rekha, Kumar, null, null, Rekha]
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rekha");
		list.add("Kumar");
		list.add(null);
		list.add(null);
		list.add("Rekha");
		
		//for-loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//enhanced for-loop
		for(String s:list) {
			System.out.println(s);
		}
		
		//while-loop
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		//iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//list iterator
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		//streams forEach
		list.stream().forEach(System.out::println);
	}

}

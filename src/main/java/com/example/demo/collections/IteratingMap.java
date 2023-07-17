package com.example.demo.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {

	/**
	 * Map does not maintains insertion order
	 * does not Allows duplicate keys
	 * allows duplicate values
	 * allows only one null key
	 * allows multiple null values
	 * 
	 * i/p for the below program is {Rekha:1, Rekha:2, Kumar:3, null:4, null:5, Mani:null, Manni:null}
	 * o/p for the below program is {Rekha:2, Kumar:3, null:5, Mani:null, Manni:null}
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Rekha", 1);
		map.put("Rekha", 2);
		map.put("Kumar", 3);
		map.put("null", 4);
		map.put("null", 5);
		map.put("Mani", null);
		map.put("Manni", null);
		
		//for-each loop
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " and Value: " + entry.getValue());
		}
		
		//using iterator
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key: " + entry.getKey() + " and Value: " + entry.getValue());
		}
		
		//using keySet()
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		
		//using values()
		for(Integer value: map.values()) {
			System.out.println(value);
		}
		
		//using forEach
		map.forEach((key,value) -> {
			System.out.println("Key: " + key + " and Value: " + value);
		});
		
		//iterating over keys and get its value
		for(String key: map.keySet()) {
			System.out.println("Key: " + key + " and Value: " + map.get(key));
		}

	}

}

package com.example.demo.duplicateIntegerArray;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}

package com.example.demo.duplicateIntegerList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		
		System.out.println(set);
	}

}

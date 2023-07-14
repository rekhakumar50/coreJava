package com.example.demo.minMaxIntegerList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollectionsSort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 18, 54, 2, 98, 10, 67, 4, 8, 89);

		Collections.sort(list);
		System.out.println("Max value: " + list.get(list.size() - 1));
		System.out.println("Min value: " + list.get(0));
	}

}

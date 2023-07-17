package com.example.demo.sortingIntegerArray;

import java.util.Arrays;
import java.util.Comparator;

public class UsingStreamsDescending {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};
		
		//first way
		Integer[] one = Arrays.stream(arr).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
		
		//third way
		Integer[] two = Arrays.stream(arr).sorted((i1, i2) -> Integer.compare(i2, i1)).toArray(Integer[]::new);
	}

}

package com.example.demo.sortingIntegerArray;

import java.util.Arrays;
import java.util.Collections;

public class UsingArraysSortDescending {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}

package com.example.demo.duplicateIntegerArray;

import java.util.Arrays;

public class UsingStream {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};
		
		Integer[] finalArr = Arrays.stream(arr).distinct().toArray(Integer[]::new);
		System.out.println(Arrays.toString(finalArr));
	}

}

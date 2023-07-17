package com.example.demo.largestNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};

		//for collections
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
		
		//for array
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}

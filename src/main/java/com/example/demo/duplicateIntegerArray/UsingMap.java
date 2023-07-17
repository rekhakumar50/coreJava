package com.example.demo.duplicateIntegerArray;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};

		Map<Integer, Boolean> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], true);
		}
		
		System.out.println(map.keySet());
	}

}

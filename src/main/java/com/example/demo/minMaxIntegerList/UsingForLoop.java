package com.example.demo.minMaxIntegerList;

import java.util.Arrays;
import java.util.List;

public class UsingForLoop {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 18, 54, 2, 98, 10, 67, 4, 8, 89);
		
		int min = Integer.MAX_VALUE;
		int max = -1;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
	}

}

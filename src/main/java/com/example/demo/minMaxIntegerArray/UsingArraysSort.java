package com.example.demo.minMaxIntegerArray;

import java.util.Arrays;

public class UsingArraysSort {

	public static void main(String[] args) {
		int[] arr = {5, 18, 54, 2, 98, 10, 67, 4, 8, 89};
		
		Arrays.sort(arr);
		System.out.println("Max Value: " + arr[arr.length - 1]);
		System.out.println("Min Value: " + arr[0]);
	}

}

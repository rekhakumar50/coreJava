package com.example.demo.minMaxIntegerArray;

import java.util.Arrays;

public class UsingArraysStream {

	public static void main(String[] args) {
		int[] arr = {5, 18, 54, 2, 98, 10, 67, 4, 8, 89};
		
		System.out.println("Max Value: " + Arrays.stream(arr).max().getAsInt());
		System.out.println("Min Value: " + Arrays.stream(arr).min().getAsInt());
		
		//System.out.println(Arrays.stream(arr).max(Integer::compare).getAsInt());
		//System.out.println(Arrays.stream(arr).max(Integer::compare).getAsInt());

	}

}

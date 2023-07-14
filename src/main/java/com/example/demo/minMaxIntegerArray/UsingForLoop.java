package com.example.demo.minMaxIntegerArray;

public class UsingForLoop {

	public static void main(String[] args) {
		int[] arr = {5, 18, 54, 2, 98, 10, 67, 4, 8, 89};
		
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);
	}

}

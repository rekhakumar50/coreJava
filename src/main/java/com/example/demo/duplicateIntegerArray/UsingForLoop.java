package com.example.demo.duplicateIntegerArray;

import java.util.Arrays;

public class UsingForLoop {

	public static void main(String[] args) {
		Integer[] arr = {1, 3, 4, 5, 3, 0, 4, 5};
		
		Arrays.sort(arr);
		Integer[] finalArr = new Integer[arr.length];
		int j = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				finalArr[j++] = arr[i];
			}
		}
		finalArr[j++] = arr[arr.length-1];
		
		System.out.println(Arrays.toString(finalArr));
	}

}

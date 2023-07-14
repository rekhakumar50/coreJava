package com.example.demo.minMaxIntegerArray;

import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsUtil {

	public static void main(String[] args) {
		Integer[] arr = {5, 18, 54, 2, 98, 10, 67, 4, 8, 89};
		
		System.out.println("Max Value: " + Collections.max(Arrays.asList(arr)));
		System.out.println("Min Value: " + Collections.min(Arrays.asList(arr)));
	}

}

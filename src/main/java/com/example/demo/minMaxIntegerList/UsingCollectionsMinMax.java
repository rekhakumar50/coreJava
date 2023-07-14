package com.example.demo.minMaxIntegerList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollectionsMinMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 18, 54, 2, 98, 10, 67, 4, 8, 89);

		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}

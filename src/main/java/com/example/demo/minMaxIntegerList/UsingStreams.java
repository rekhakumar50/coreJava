package com.example.demo.minMaxIntegerList;

import java.util.Arrays;
import java.util.List;

public class UsingStreams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 18, 54, 2, 98, 10, 67, 4, 8, 89);

		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
	}

}

package com.example.demo.duplicateIntegerList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		List<Integer> finalList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(finalList);
	}

}

package com.example.demo.sortingIntegerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamsDescending {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		//first way
		List<Integer> one = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		//second way
		List<Integer> two = list.stream().sorted((i1,i2) -> Integer.compare(i2, i1)).collect(Collectors.toList());
	}

}

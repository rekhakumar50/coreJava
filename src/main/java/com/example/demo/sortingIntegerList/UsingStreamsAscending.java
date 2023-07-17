package com.example.demo.sortingIntegerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamsAscending {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		//first way
		List<Integer> one = list.stream().sorted().collect(Collectors.toList());
		
		//second way
		List<Integer> two = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		//third way
		List<Integer> three = list.stream().sorted((i1,i2) -> Integer.compare(i1, i2)).collect(Collectors.toList());
	}

}

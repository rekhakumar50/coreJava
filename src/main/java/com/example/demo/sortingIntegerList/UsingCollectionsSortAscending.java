package com.example.demo.sortingIntegerList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCollectionsSortAscending {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		//first way
		Collections.sort(list);
		
		//second way
		Collections.sort(list, (i1, i2) -> Integer.compare(i1, i2));
		
		//third way
		Collections.sort(list, Comparator.naturalOrder());
		
		//fourth way
		list.sort(null);
		list.sort(Comparator.naturalOrder());
		list.sort((i1, i2) -> Integer.compare(i1, i2));
	}

}

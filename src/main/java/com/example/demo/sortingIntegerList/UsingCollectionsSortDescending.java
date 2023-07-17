package com.example.demo.sortingIntegerList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCollectionsSortDescending {

	public static void main(String[] args) {
List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		//first way
		Collections.reverse(list);
		
		//second way
		Collections.sort(list, (i1, i2) -> Integer.compare(i2, i1));
		
		//third way
		Collections.sort(list, Comparator.reverseOrder());
		
		//fourth way
		list.sort(Comparator.reverseOrder());
		list.sort((i1, i2) -> Integer.compare(i2, i1));
	}

}

package com.example.demo.duplicateIntegerList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingForLopp {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 3, 0, 4, 5);
		
		List<Integer> finalList = new ArrayList<>();
		for(Integer i : list) {
			if(!finalList.contains(i)) {
				finalList.add(i);
			}
		}
		
		System.out.println(finalList);
	}

}

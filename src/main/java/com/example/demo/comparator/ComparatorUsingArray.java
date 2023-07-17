package com.example.demo.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorUsingArray {

	public static void main(String[] args) {
		Player p1 = new Player("xxx", 40, 19);
		Player p2 = new Player("yyy", 35, 10);
		Player p3 = new Player("zzz", 45, 12);
		
		Player[] arr = {p1, p2, p3};
		
		//sorting based on ranking in ascending order
		Arrays.sort(arr, (l1, l2) -> Integer.compare(l1.getRanking(), l2.getRanking()));
		Arrays.sort(arr, Comparator.comparing(Player::getRanking));

		//sorting based on ranking in descending order
		Arrays.sort(arr, (l1, l2) -> Integer.compare(l2.getRanking(), l1.getRanking()));
		Arrays.sort(arr, Comparator.comparing(Player::getRanking).reversed());

				
				
		//sorting based on name in ascending order
		Arrays.sort(arr, (l1, l2) -> l1.getName().compareTo(l2.getName()));
		Arrays.sort(arr, Comparator.comparing(Player::getName));


		//sorting based on name in descending order
		Arrays.sort(arr, (l1, l2) -> l2.getName().compareTo(l1.getName()));
		Arrays.sort(arr, Comparator.comparing(Player::getName).reversed());
	}

}

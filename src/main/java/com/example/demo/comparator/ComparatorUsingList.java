package com.example.demo.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsingList {

	public static void main(String[] args) {
		Player p1 = new Player("xxx", 40, 19);
		Player p2 = new Player("yyy", 35, 10);
		Player p3 = new Player("zzz", 45, 12);
		
		List<Player> list = Arrays.asList(p1, p2, p3);
		
		//sorting based on ranking in ascending order
		Collections.sort(list, (l1, l2) -> Integer.compare(l1.getRanking(), l2.getRanking()));
		list.sort(Comparator.comparing(Player::getRanking));

		//sorting based on ranking in descending order
		list.sort((l1, l2) -> Integer.compare(l2.getRanking(), l1.getRanking()));
		Collections.sort(list, Comparator.comparing(Player::getRanking).reversed());

		
		
		//sorting based on name in ascending order
		Collections.sort(list, (l1, l2) -> l1.getName().compareTo(l2.getName()));
		list.sort(Comparator.comparing(Player::getName));


		//sorting based on name in descending order
		Collections.sort(list, (l1, l2) -> l2.getName().compareTo(l1.getName()));
		list.sort(Comparator.comparing(Player::getName).reversed());
	}

}

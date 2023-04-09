package _28_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class _6_HashMapUsing_ArrayList {

	public static void main(String[] args) {
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		map.put(1, new ArrayList<>());
		map.put(2, new ArrayList<>());
		map.put(3, new ArrayList<>());
		
		System.out.println(map);
		
		map.get(1).add(10);
		map.get(1).add(11);
		map.get(2).add(20);
		map.get(2).add(21);
		map.get(2).add(22);
		map.get(3).add(30);
		map.get(3).add(31);
		map.get(3).add(32);
		map.get(3).add(33);
		
		System.out.println(map);
		
		
		
		
	}
	
}

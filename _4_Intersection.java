package _28_HashMap;

import java.util.HashMap;

public class _4_Intersection {

	public static void main(String[] args) {
	
		int[] arr1 = {10, 20, 50, 5, 60, 20, 50, 50, 3, 50, 10};
		int[] arr2 = {2, 10, 70, 10, 50, 5, 80, 3, 1, 3, 50};
		
		intercetion1(arr1, arr2);
		System.out.println();
		intercetion2(arr1, arr2);
	}

//	by mam
	public static void intercetion2(int[] arr1, int[] arr2) {
		
		HashMap<Integer,  Integer> map = new HashMap<>();
		
		for(int key : arr1) {
			int newValue = map.getOrDefault(key, 0) + 1;
			map.put(key, newValue);
		}
		for(int key : arr2) {
			if(map.containsKey(key) && map.get(key) > 0) {
				System.out.print(key + " ");
				map.put(key, map.get(key) - 1);
			}
		}
	}
	
//	by me
	private static void intercetion1(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Integer> set = new HashMap<>();
		for(int value : arr1) {
			int newValue = set.getOrDefault(value, 0) + 1;
			set.put(value, newValue);
		}
		for(int value : arr2) {
			if(set.containsKey(value) && set.get(value) > 0) {
				System.out.print(value + " ");
				set.put(value, set.get(value) - 1);
			}
		}
	}
	
}

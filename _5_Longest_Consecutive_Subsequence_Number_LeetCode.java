package _28_HashMap;

import java.util.HashMap;

public class _5_Longest_Consecutive_Subsequence_Number_LeetCode {

	public static void main(String[] args) {
		
		int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 7};
		findLongestSubSequence(arr);
	}
	
	
	public static void findLongestSubSequence(int[] arr) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int key : arr) {
			
			if(map.containsKey(key - 1)) {
				map.put(key, false);
			}
			else {
				map.put(key, true);
			}
			if(map.containsKey(key + 1)) {
				map.put(key + 1, false);
			}
		}
//		System.out.println(map);
		int max = 0;
		int startingPoint = 0;
		for(int key : map.keySet()) {
			
			if(map.get(key)) {
				int length = 0;
				while(map.containsKey(key + length)) {
					length++;
				}
//				System.out.println(key + " = " + length);
				if(length > max) {
					max = length;
					startingPoint = key;
				}
			}
		}
//		System.out.println(max);		//total number of longest Sequence
		for(int i = 0; i < max; i++)
			System.out.print((i + startingPoint) + " ");	//print longest Sequence value
	}
	
}

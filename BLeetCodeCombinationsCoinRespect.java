package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BLeetCodeCombinationsCoinRespect {

	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		int start = 1;
		int end = 4;
		int target = 2;
		
		printAllCombinationOfK(start, end, target, new ArrayList<>(), list);
		System.out.println(list);
		
		printAllCombinationOfKUsingString(start, end, target, "");
	}

	private static void printAllCombinationOfK(int start, int end, int target, List<Integer> temp, List<List<Integer>> list) {
		
		if(target == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(start > end)
			return;
		
		temp.add(start);
		printAllCombinationOfK(start + 1, end, target - 1, temp, list);
		temp.remove(temp.size() - 1);
		
		printAllCombinationOfK(start + 1, end, target, temp, list);
	}
	
	private static void printAllCombinationOfKUsingString(int start, int end, int target, String answer) {
		
		if(target == 0) {
			System.out.println(answer);
			return;
		}
		
		if(start > end)
			return;
		
		printAllCombinationOfKUsingString(start + 1, end, target - 1, answer + start);
		
		printAllCombinationOfKUsingString(start + 1, end, target, answer);
	}
}
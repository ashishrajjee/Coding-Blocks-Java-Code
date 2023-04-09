package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CLeetCodeCombinationSum3UserRespect {

	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		int start = 1;
		int end = 9;
		int digitUse = 3;
		int target = 7;
		
		printAllCombinationOfK(start, end, digitUse, target, new ArrayList<>(), list);
		System.out.println(list);
		
		printAllCombinationOfKUsingString(start, end, digitUse, target, "");
	}

	private static void printAllCombinationOfK(int start, int end, int digitUse, int target, List<Integer> temp, List<List<Integer>> list) {
		
		if(target == 0 && digitUse == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(start > end || target < 0)
			return;
		
		for(int i = start; i <= end; i++) {
				temp.add(i);
				printAllCombinationOfK(i + 1, end, digitUse - 1, target - i, temp, list);
				temp.remove(temp.size() - 1);
		}
	}
	
	private static void printAllCombinationOfKUsingString(int start, int end, int digitUse, int target, String answer) {
		
		if(target == 0 && digitUse == 0) {
			System.out.println(answer);
			return;
		}
		
		if(start > end  || target < 0)
			return;
		
		for(int i = start; i <= end; i++) {
				printAllCombinationOfKUsingString(i + 1, end, digitUse - 1, target - i, answer + i);
		}
	}
	
}
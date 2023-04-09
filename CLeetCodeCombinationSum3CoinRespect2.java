package _13LeetCode;

import java.util.ArrayList;

public class CLeetCodeCombinationSum3CoinRespect2 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int start = 1;
		int end = 9;
		int digitUse = 2;
		int target = 18;
		
		printAllCombinationOfK(start, end, digitUse, target, new ArrayList<>(), list);
		System.out.println(list);
		
		printAllCombinationOfKUsingString(start, end, digitUse, target, "");
	}

	private static void printAllCombinationOfK(int start, int end, int digitUse, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		
		if(target == 0 && digitUse == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(start > end || target < 0)
			return;
		
		temp.add(start);
		printAllCombinationOfK(start + 1, end, digitUse - 1, target - start, temp, list);
		temp.remove(temp.size() - 1);
		
		printAllCombinationOfK(start + 1, end, digitUse, target, temp, list);
	}
	
	private static void printAllCombinationOfKUsingString(int start, int end, int digitUse, int target, String answer) {
		
		if(target == 0 && digitUse == 0) {
			System.out.println(answer);
			return;
		}
		
		if(start > end || target < 0)
			return;
		
		printAllCombinationOfKUsingString(start + 1, end, digitUse - 1, target - start, answer + start);
		
		printAllCombinationOfKUsingString(start + 1, end, digitUse, target, answer);
	}
}
package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BLeetCodeCombinationsUserRespect {

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
		
		for(int i = start; i <= end; i++) {
				temp.add(i);
				printAllCombinationOfK(i + 1, end, target - 1, temp, list);
				temp.remove(temp.size() - 1);
		}
	}
	
	private static void printAllCombinationOfKUsingString(int start, int end, int target, String answer) {
		
		if(target == 0) {
			System.out.println(answer);
			return;
		}
		
		if(start > end)
			return;
		
		for(int i = start; i <= end; i++) {
				printAllCombinationOfKUsingString(i + 1, end, target - 1, answer + i);
		}
	}
	
	private static void printAllCombinationOfK2(int start, int end, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		
		if(target == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = start; i <= end; i++) {
			
			if(target > 0) {
				temp.add(i);
				printAllCombinationOfK2(i + 1, end, target - 1, temp, list);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	private static void printAllCombinationOfKUsingString2(int start, int end, int target, String answer) {
		
		if(target == 0) {
			System.out.println(answer);
			return;
		}
		
		for(int i = start; i <= end; i++) {
			if(target > 0)
				printAllCombinationOfKUsingString2(i + 1, end, target - 1, answer + i);
		}
	}
	
	private static void printAllCombinationOfK3(int start, int end, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		
		if(target == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(target < 0 || start > end || target > end)
			return;
		
		for(int i = start; i <= end; i++) {

				temp.add(i);
				printAllCombinationOfK3(i + 1, end, target - 1, temp, list);
				temp.remove(temp.size() - 1);
		}
	}
	
	private static void printAllCombinationOfKUsingString3(int start, int end, int target, String answer) {
		
		if(target == 0) {
			System.out.println(answer);
			return;
		}
		
		if(target < 0 || start > end || target > end)
			return;
		
		for(int i = start; i <= end; i++) {
			printAllCombinationOfKUsingString3(i + 1, end, target - 1, answer + i);
		}
	}
	
}
package _13LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALeetCodeCombinationSum2PrintWithoutDuplication {
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		int[] arr = {10,1,2,7,6,1,5};
		Arrays.sort(arr);
		coinChangeUserRespect(arr, 8, 0, new ArrayList<Integer>(), list);
		System.out.println(list);
		
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		
		coinChangeCoinRespect(arr, 8, 0, new ArrayList<Integer>(), list1, true);
		System.out.println(list1);
		
	}
	
	public static void coinChangeUserRespect(int[] coins, int amount, int index, List<Integer> temp, List<List<Integer>> list) {
		
		if(amount == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = index; i < coins.length; i++) {
			
			if(i > index && coins[i] == coins[i - 1])	//use this for remove duplicate
				continue;
			
			if(amount >= coins[i]) {
				temp.add(coins[i]);
				coinChangeUserRespect(coins, amount - coins[i], i + 1, temp, list);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public static void coinChangeCoinRespect(int[] coins, int amount, int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list, boolean flag) {
		
		if(amount == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(amount < 0 || index >= coins.length)
			return;
		
		if(flag == false && coins[index] == coins[index - 1]) {	// check duplication value
//			no
			coinChangeCoinRespect(coins, amount, index + 1, temp, list, false);
		}
		else {
//			yes
			temp.add(coins[index]);
			coinChangeCoinRespect(coins, amount - coins[index], index + 1, temp, list, true);
			temp.remove(temp.size() - 1);
			
//			no
			coinChangeCoinRespect(coins, amount, index + 1, temp, list, false);
			
		}
	}
}

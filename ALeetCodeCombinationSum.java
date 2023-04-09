package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ALeetCodeCombinationSum {
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		
		coinChangeUserRespect(new int[] {2,3,5}, 6, 0, new ArrayList<Integer>(), list);
		System.out.println(list);
		
		List<List<Integer>> list1 = new ArrayList<>();
		
		coinChangeCoinRespect(new int[] {2,3,5}, 6, 0, new ArrayList<Integer>(), list1);
		System.out.println(list1);	
	}
	
	public static void coinChangeUserRespect(int[] coins, int amount, int index, List<Integer> temp, List<List<Integer>> list) {
		
		if(amount == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = index; i < coins.length; i++) {
			
			if(amount >= coins[i]) {
				temp.add(coins[i]);
				coinChangeUserRespect(coins, amount - coins[i], i, temp, list);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public static void coinChangeCoinRespect(int[] coins, int amount, int index, List<Integer> temp, List<List<Integer>> list) {
		
		if(amount == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(amount < 0 || index >= coins.length)
			return;
//		yes
		temp.add(coins[index]);
		coinChangeCoinRespect(coins, amount - coins[index], index, temp, list);
		temp.remove(temp.size() - 1);
		
//		no
		coinChangeCoinRespect(coins, amount, index + 1, temp, list);
	}
}

package _13LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HLeetCodePermutations {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,1,2};
//		int[] arr = {1,2,3};
		
		List<List<Integer>> list = new ArrayList<>();
		permutationsByARK(arr, new boolean[arr.length], new ArrayList<>(), list);
		System.out.println(list);
		
		boolean[] isThisNoAvailable = new boolean[arr.length];
		Arrays.fill(isThisNoAvailable, true);
		list = new ArrayList<>();
		permutationsByMam(arr, isThisNoAvailable, new ArrayList<>(), list);
		System.out.println(list);
		
		permutation("abc", "");
		
	}
	
	public static void permutationsByARK(int[] arr, boolean[] isThisNoAvailable, List<Integer> temp, List<List<Integer>> list) {
		
		if(arr.length == temp.size()) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(isThisNoAvailable[i])
				continue;
			
			isThisNoAvailable[i] = true;
			temp.add(arr[i]);
			
			permutationsByARK(arr, isThisNoAvailable, temp, list);
			
			temp.remove(temp.size() - 1);
			isThisNoAvailable[i] = false;
		}
	}
	
	public static void permutationsByMam(int[] arr, boolean[] isThisNoAvailable, List<Integer> temp, List<List<Integer>> list) {
		
		if(arr.length == temp.size()) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
//			if(isUsed[i] == false)  //use this one or below this
			if(!isThisNoAvailable[i])
				continue;
			
			isThisNoAvailable[i] = false;
			temp.add(arr[i]);
			
			permutationsByMam(arr, isThisNoAvailable, temp, list);
			
			temp.remove(temp.size() - 1);
			isThisNoAvailable[i] = true;
		}
	}
	
	public static void permutation(String question, String answer) {
		
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		for(int i = 0; i < question.length(); i++) {
			
			char ch = question.charAt(i);
			String restOfString = question.substring(0,i) + question.substring(i + 1);
			
			permutation(restOfString, answer + ch);
		}
	}
	
}

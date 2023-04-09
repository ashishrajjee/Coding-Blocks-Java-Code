package _13LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HLeetCodePermutations2WithoutDuplicationInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,1,2};
//		int[] arr = {1,2,3};
		Arrays.sort(arr);
		
		List<List<Integer>> list = new ArrayList<>();
		permutationsByARK(arr, new boolean[arr.length], new ArrayList<>(), list);
		System.out.println(list);
		
		boolean[] isThisNoAvailable = new boolean[arr.length];
		Arrays.fill(isThisNoAvailable, true);
		list = new ArrayList<>();
		permutationsByMam(arr, isThisNoAvailable, new ArrayList<>(), list);
		System.out.println(list);
		
	}
	
	public static void permutationsByARK(int[] arr, boolean[] isThisNoAvailable, List<Integer> temp, List<List<Integer>> list) {
		
		if(arr.length == temp.size()) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(isThisNoAvailable[i] || i > 0 && arr[i] == arr[i - 1] && !isThisNoAvailable[i - 1])
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
			if(!isThisNoAvailable[i] || i > 0 && arr[i] == arr[i - 1] && isThisNoAvailable[i - 1])
				continue;
			
//			if(i > 0 && arr[i] == arr[i - 1] && isUsed[i - 1])
//				continue;
			
			isThisNoAvailable[i] = false; // number nhi hai
			temp.add(arr[i]);
			
			permutationsByMam(arr, isThisNoAvailable, temp, list);
			
			temp.remove(temp.size() - 1);
			isThisNoAvailable[i] = true; // number hai
		}
	}
	
}

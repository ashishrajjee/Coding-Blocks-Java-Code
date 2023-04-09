package _13LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DLeetCodeSubsets2PrintWithoutDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2};
		Arrays.sort(arr);
		
		List<List<Integer>> list = new ArrayList<>();
		printArraySubsetElementRespect(arr, 0, new ArrayList<>(), list, true);
		System.out.println(list);
		
		list = new ArrayList<>();
		printArraySubsetUserRespect(arr, 0, new ArrayList<>(), list);
		System.out.println(list);
	}

	private static void printArraySubsetElementRespect(int[] arr, int index, List<Integer> temp, List<List<Integer>> list, boolean flag) {
		
		if(index == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(flag == false && arr[index - 1] == arr[index]) {
			printArraySubsetElementRespect(arr, index + 1, temp, list, false);
			//return;
		}
		
		else {	
			temp.add(arr[index]);
			printArraySubsetElementRespect(arr, index + 1, temp, list, true);
			temp.remove(temp.size() - 1);
			
			printArraySubsetElementRespect(arr, index + 1, temp, list, false);	
		}
	}
	
	private static void printArraySubsetUserRespect(int[] arr, int index, List<Integer> temp, List<List<Integer>> list) {
		
		list.add(new ArrayList<>(temp));
		
		for(int i = index; i < arr.length; i++) {
			
			if(i > index && arr[i - 1] == arr[i])
				continue;
			
			temp.add(arr[i]);
			printArraySubsetUserRespect(arr, i + 1, temp, list);
			temp.remove(temp.size() - 1);
		}
		
	}
}

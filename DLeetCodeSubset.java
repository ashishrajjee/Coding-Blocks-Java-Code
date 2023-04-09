package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DLeetCodeSubset {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		List<List<Integer>> list = new ArrayList<>();
		printArraySubsetElementRespect(arr, 0, new ArrayList<>(), list);
		System.out.println(list);
		
		list = new ArrayList<>();
		printArraySubsetUserRespect(arr, 0, new ArrayList<>(), list);
		System.out.println(list);
	}

	private static void printArraySubsetElementRespect(int[] arr, int index, List<Integer> temp, List<List<Integer>> list) {
		
		if(index == arr.length) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		
//		if(index > arr.length)
//			return;
		
		temp.add(arr[index]);
		printArraySubsetElementRespect(arr, index + 1, temp, list);
		temp.remove(temp.size() - 1);
		
		printArraySubsetElementRespect(arr, index + 1, temp, list);	
	}
	
	private static void printArraySubsetUserRespect(int[] arr, int index, List<Integer> temp, List<List<Integer>> list) {
		
//		if(index == arr.length) {
			list.add(new ArrayList<>(temp));
//			return;
//		}
		
//		if(index > arr.length)
//			return;
		
		for(int i = index; i < arr.length; i++) {
			temp.add(arr[i]);
			printArraySubsetUserRespect(arr, i + 1, temp, list);
			temp.remove(temp.size() - 1);
		}
	}
}

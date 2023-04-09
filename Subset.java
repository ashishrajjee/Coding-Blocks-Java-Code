package _3Array;

import java.util.ArrayList;

public class Subset {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1};
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		printArraySubsetElementRespect(arr, 0, new ArrayList<>(), list);
		System.out.println(list);
		
		list = new ArrayList<>();
		printArraySubsetUserRespect(arr, 0, new ArrayList<>(), list);
		System.out.println(list);
		
		subArray(arr);
	}

	private static void printArraySubsetElementRespect(int[] arr, int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		
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
	
	private static void printArraySubsetUserRespect(int[] arr, int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		
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
	
	public static void subArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
		
		
		
	}
	
	
	
}

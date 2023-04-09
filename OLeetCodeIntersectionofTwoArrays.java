package _13LeetCode;

import java.util.*;

public class OLeetCodeIntersectionofTwoArrays {
	
	public static void main(String[] args) {
	
		int arr1[] = {5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 60, 80};
		int arr2[] = {10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90};
		
		//System.out.println(intersection(arr1, arr2));//worst case
		System.out.println(intersection2(arr1, arr2));//best case
	}
	
	public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					ans.add(arr1[i]);
					arr2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		return ans;
	}
	
	public static ArrayList<Integer> intersection2(int arr1[], int arr2[]){
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int arr1S = 0;
		int arr2S = 0;
		
		while(arr1S < arr1.length && arr2S < arr2.length) {
			if(arr1[arr1S] == arr2[arr2S]) {
				ans.add(arr1[arr1S]);
				arr1S++;
				arr2S++;
			}
			else if(arr1[arr1S] < arr2[arr2S]) {
				arr1S++;
			}
			else {
				arr2S++;
			}
		}
		return ans;
	}
	
	
	
	
}

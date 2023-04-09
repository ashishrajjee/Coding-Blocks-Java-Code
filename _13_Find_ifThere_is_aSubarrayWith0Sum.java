package _30_ArrayQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _13_Find_ifThere_is_aSubarrayWith0Sum {
//	{4,2,-3,1,6}	output true
//	there is a subArray with zero sum from index 1 to 3
//	{6,3,-1,-3,4,-2,2,4,6,-12,-7}	original Array
//	{6,9, 8, 5,9, 7,9,13,19,7,0}	prefix sum
//	   9_______9____9
//	    -1,-3,4	-2,2				----------------- 2 subArray with Zero Sum
//		_______ ____
//sum = 	0	  0  	
//	   9____________9
//	    -1,-3,4,-2,2				----------------- 1 subArray with Zero Sum
//	    ____________
//sum = 	  0
//				  7_________7
//				   2,4,6,-12		----------------- 1 subArray with Zero Sum
//		 		   _________
//sum = 			   0
//	0___________________________0
//	 6,9, 8, 5,9, 7,9,13,19,7,0		----------------- 1 subArray with Zero Sum
//   ___________________________
//sum = 		  0	
//	---------------------------------------- there is 5 subArray with zero sum
	
	
	public static void main(String[] args) {
//		int[] arr = {4,2,-3,1,6};
		int[] arr = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
//		int[] arr = {2,3,-6,1};		//without line 29 its return wrong answer
		System.out.println(subArrayZeroSum(arr));
		subArrayPrintIndexWithHaveZeroSum(arr);
	}
	
	public static boolean subArrayZeroSum(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		set.add(0);		//this 0 check if prefix sum is equal to zero so return zero
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(set.contains(sum))
				return true;
			set.add(sum);
		}
		return false;	
	}
	
	public static void subArrayPrintIndexWithHaveZeroSum(int[] arr) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);		//-1 because of starting index (-1 + 1 = 0) line 55
		int sum = 0;
		System.out.println("Starting index to End index");
		int totalSubArrayWith0Sum = 0;
		for(int i = 0; i < arr.length; i++) {
//		prefix sum
			sum = sum + arr[i];
//		create a new entry	
			if(!map.containsKey(sum))
				map.put(sum, new ArrayList<>());
//		answer
			ArrayList<Integer> temp = map.get(sum);
			for(int val : temp) {
				System.out.println(val + 1 + " -> " + i);
				totalSubArrayWith0Sum++;
			}
//		add your index corresponding to prefix	
			map.get(sum).add(i);
		}
		System.out.println("Total SubArray With 0 Sum = "+ totalSubArrayWith0Sum);
	}
	
}

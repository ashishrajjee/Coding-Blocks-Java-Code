package _22Stack_Questions;

import java.util.Stack;

public class _6_FindMin {  // this code by mee
	
//	Example:-you have a given Array	{10, 50, 5, 60, 7, 40, 3} find min ??
	
//				10 50 5 60 7 40 3	: min is 3
//				10 50 5 60 7 40 	: min is 5
//				10 50 5 60 7 		: min is 5
//				10 50 5 60			: min is 5
//				10 50 5				: min is 5
//				10 50				: min is 10
//				10					: min is 10
	
	public static void main(String[] args) {
		
		int[] arr = {10, 50, 40, 6, 45, 2};
		
		Stack<Integer> s = new Stack<>();
		
		Stack<Integer> min = minimum(arr,s);
		
		while(!s.isEmpty() && !min.isEmpty()) {
			System.out.println(s.pop() + "\tMinimum of till \t" + min.pop());
		}
		System.out.println();
		
//		int[] arr2 = {10, 50, 40, 6, 45, 2};
		minimum2(arr);
		
	}
	
//	Time Complexity - O(n) and Space Complexity O(n)
	public static Stack<Integer> minimum(int[] arr, Stack<Integer> s) {
		
//		Stack<Integer> s = new Stack<>();
		Stack<Integer> min = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(min.isEmpty() && s.isEmpty()) {
				s.push(arr[i]);
				min.push(arr[i]);
			}
			
			else if(arr[i] > min.peek()) {
				min.push(min.peek());
				s.push(arr[i]);
			}
			else {
				min.push(arr[i]);
				s.push(arr[i]);
			}
		}
		return min;
		
	}

	
//	Best Approach
//	Time Complexity - O(1) and Space Complexity O(1)
	public static void minimum2(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		int minValue = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(s.isEmpty()) {
				s.push(arr[i]);
				minValue = arr[i];
			}
			else if(arr[i] < minValue) {
				s.push((arr[i] * 2) - minValue);
				minValue = arr[i];
			}
			else {
				s.push(arr[i]);
			}
		}
		
//		for print
		while(!s.isEmpty()) {
			
			System.out.println(minValue);
			if(s.peek() < minValue) {
				minValue = (minValue * 2) - s.peek();
			}
			s.pop();
		}
		
	}
	
	
}

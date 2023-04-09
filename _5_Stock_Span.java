
package _22Stack_Questions;

import java.util.Stack;

public class _5_Stock_Span {

// Question :-- you are given the price of stock on each day. you want to calculate
//				the span of each day.
//				span means = no of consecutive days just before a given day on which
//				the price of stock was lesser than the current day
//	input -	80 50 70 30 20 40 90 10 5 35
// output - 0  0  1  0  0  2  6  0  0  2
	
	public static void main(String[] args) {
		
		int[] arr = {80, 50, 70, 30, 20, 40, 90, 10, 5, 35};
		
		int[] newArr = stockSpan(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
		
	}
	
	public static int[] stockSpan(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			while(!s.isEmpty() && arr[s.peek()] <= arr[i] ) {
				s.pop();	
			}
			if(s.isEmpty()) {
				newArr[i] = i;
			}
			else {
				newArr[i] = i - s.peek() - 1;
			}
			s.push(i);
		}
		return newArr;

	}
	
	
}

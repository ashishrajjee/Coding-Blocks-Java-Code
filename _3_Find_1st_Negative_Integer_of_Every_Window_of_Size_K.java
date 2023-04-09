package _23_Queue_Questions;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _3_Find_1st_Negative_Integer_of_Every_Window_of_Size_K {

	public static void main(String[] args) {
		
		int[] arr = {10, -1, -8, 6, -30, 40, -50, 60, 60, 60};
		
		find1StNegativeIntOfEveryWindowOOfSizeK(arr, 3);
		System.out.println();
		
		find1StNegativeIntOfEveryWindowOOfSizeK2(arr, 3);
		
		
		
//		findMinimumNegativeIntegerOfEveryWindowOFSizeK(arr, 3); //minimum
//		
//		System.out.println();
//		
//		findMinimumNegativeIntegerOfEveryWindowOFSizeK2(arr, 3); //minimum
		
	}
	
	
	// superb by mam
	public static void find1StNegativeIntOfEveryWindowOOfSizeK2(int[] arr, int k) {
		
		Queue<Integer> q = new LinkedList<>();
		
		// prepare the 1st Window
		for(int i = 0; i <= k - 1; i++) {
			
			if(arr[i] < 0) {
				q.add(i);
			}	
		}
		
		// 1st negative integer for 1st window
		if(q.isEmpty())
			System.out.println("No 1st Negative Value for this Window");	
		else
			System.out.println(arr[q.peek()]);
		
		for(int i = k; i < arr.length; i++) {
			
			// remove the elements which are out present window
			if(!q.isEmpty() && q.peek() == i - k) {
				q.remove();
			}
			// new value add
			if(arr[i] < 0) {
				q.add(i);
			}
			// answer : 1st negative integer
			if(q.isEmpty())
				System.out.println("No 1st Negative Value for this Window");	
			else
				System.out.println(arr[q.peek()]);
		}
		
	}
	
	
//	best by me
	public static void find1StNegativeIntOfEveryWindowOOfSizeK(int[] arr, int k) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			q.add(arr[i]);
			
			if(q.size() == k) {		// arr = {10, -1, -8, 6, -30, 40, -50, 60}
				int j = 1;
				boolean b = true;
				while(j <= q.size()) {  
					int temp = q.remove();
					if(temp < 0 && b) {
						System.out.print(temp + " ");
						b = false;
					}
					q.add(temp);
					j++;
				}
				q.remove();
			}
		}
	}
	
	
	//best		//by me
	public static void findMinimumNegativeIntegerOfEveryWindowOFSizeK(int[] arr, int k) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(!q.isEmpty() && q.size() == k) {
				
				int j = 0;
				int min = Integer.MAX_VALUE;
				
				while(j <= q.size()) {
					
					int temp = q.remove();
					
					if(temp < min) {
						min = temp;
					}
					
					q.add(temp);
					j++;
				}
				System.out.print(min + " ");
				q.remove();
			}
			q.add(arr[i]);	
		}
	}
	
	
	//bad		//by me
	public static void findMinimumNegativeIntegerOfEveryWindowOFSizeK2(int[] arr, int k) {
		
		int j = 0;
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(j == k) {
				System.out.print(min + " ");
				arr[i - j] = Integer.MAX_VALUE;
				j--;
			}
			
			j++;
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}	
	}
	
	
}

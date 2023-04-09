package _31_BinarySearchQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class _1_AggressiveCows {

// Q. https://www.spoj.com/problems/AGGRCOW/
//	numberOfStall = 5
//	numberOfCows = 3
//	stallPosition = {1,2,4,8,9};
//	output = 3
//	Explanation: 1st cow at stall 1 , 2nd cow at stall 4 and 3rd cow at stall 8
//	distance between 1 and 4 is 3 >= output and distance between 4 and 8 is 4 >= output
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfStall = s.nextInt();				//5
		int numberOfCows = s.nextInt();					//3
		int[] stallPosition = new int[numberOfStall];
		
		for(int i = 0; i < numberOfStall; i++) {
			stallPosition[i] = s.nextInt();				//1, 2, 8, 4, 9
		}
		Arrays.sort(stallPosition);						//1, 2, 4, 8, 9
//	logic binary search
		int low = 0;
		int high = stallPosition[stallPosition.length - 1] - stallPosition[0];
		int finalAns = 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(isItPossible(stallPosition, numberOfCows, mid)) {
				finalAns = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		System.out.println(finalAns);					//Answer = 3
		s.close();
	}
	
	public static boolean isItPossible(int[] stall, int numberOfCows, int mid) {
		int placedCow = 1;
		int position = stall[0];
		for(int i = 1; i < stall.length; i++) {
			if(stall[i] - position >= mid) {
				placedCow++;
				position = stall[i];
			}
			if(placedCow == numberOfCows)
				return true;
		}
		return false;
	}
	
}

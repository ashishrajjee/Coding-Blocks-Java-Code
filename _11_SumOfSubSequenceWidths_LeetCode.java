package _30_ArrayQuestions;

import java.util.Arrays;

public class _11_SumOfSubSequenceWidths_LeetCode {
//	Q.
//	arr = {2,1,3};		max		min		width
// subset = [1]			 1		 1		 0
//			[2]			 2		 2		 0
//			[3]			 3		 3		 0
//			[1,2]		 2		 1		 1
//			[1,3]		 3		 1		 2
//			[2,3]		 3		 2		 1
//			[1,2,3]		 3		 1		 2
//									___________
//							answer		 6
//									___________
	
	public static void main(String[] args) {
		int[] arr = {2,1,3};
		System.out.println(sumSubSequenceWidths(arr));
	}
	
	public static int sumSubSequenceWidths(int[] arr) {
		Arrays.sort(arr);
		int mod = 1000_000_007;
//		create an array which is storing power of 2
		long[] power = new long[arr.length];
		power[0] = 1;
		for(int i = 1; i < power.length; i++)
			power[i] = (power[i - 1] * 2) % mod;
		long max = 0;
		long min = 0;
//		go to every element and ask for its contribution in max and min
		for(int i = 0; i < arr.length; i++) {
			max = (max + arr[i] * power[i]) % mod;
			min = (min + arr[i] * power[arr.length - i - 1]) % mod;
		}
		return (int)(max - min + mod) % mod;
	}
	
}

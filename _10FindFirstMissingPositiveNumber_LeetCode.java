package _30_ArrayQuestions;

public class _10FindFirstMissingPositiveNumber_LeetCode {

	public static void main(String[] args) {
//		int[] arr = {7,8,9,11,12};		//6
//		int[] arr = {1,2,0};			//3
		int[] arr = {3,4,-1,1};			//2
//		int[] arr = {3,1,2,4};			//5
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		int missingNumber = findmissingPositiveNumber(arr);
		System.out.println(missingNumber);
		for(int val : arr) {
			System.out.print(val + " ");
		}

	}

	private static int findmissingPositiveNumber(int[] arr) {
		
		int n = arr.length;
//	1. ignore all -ve and greater than n values		
		for(int i = 0; i < n; i++) {
			if(arr[i] <= 0 || arr[i] > n)
				arr[i] = n + 1;					// not use this value
		}
//	2. values which are present -ve mark
		for(int i = 0; i < n; i++) {
			int value = Math.abs(arr[i]) - 1;	//-1 for zero indexing, abs for change -ve value to +ve value
			if(value < n && arr[value] > 0)	{	//arr[value] > 0, check for duplicate value
				arr[value] = -arr[value];
			}
		}
//	3. iterate over array to find out the index which is having +ve number
		for(int i = 0; i < n; i++) {
			if(arr[i] > 0)
				return i + 1;
		}
		return n + 1;
	}
	
}

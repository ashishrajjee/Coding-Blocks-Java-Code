package _30_ArrayQuestions;

public class _6_Maximum_Sum_Increasing_SubSequence {

	public static void main(String[] args) {
		int[] arr = {1,101,3,2,100,4,5};
//		int[] arr = {10,8,5,3};
//		int[] arr = {1,2,3,4,5};
		increasingSubSequence3(arr);
		increasingSubSequence2(arr);
		increasingSubSequence(arr);
	}
	
// by me
	public static void increasingSubSequence3(int[] arr) {
		
		int[] storage = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			storage[i] = arr[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i - 1; j >= 0; j--) {
				int jContribution = storage[j] + arr[i];
				if(arr[j] < arr[i] && jContribution > storage[i]) {
					storage[i] = jContribution;
				}
			}
			if(max < storage[i])
				max = storage[i];
		}
		System.out.println(max);
	}
	
// by mam	
	public static void increasingSubSequence2(int[] arr) {
		
		int[] storage = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			storage[i] = arr[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				int jContribution = storage[j] + arr[i];
				if(arr[j] < arr[i] && jContribution > storage[i]) {
					storage[i] = jContribution;
				}
			}
			if(max < storage[i])
				max = storage[i];
		}
		System.out.println(max);
	}
	
// by me(wrong)
	
	public static void increasingSubSequence(int[] arr) {
		
		int sum = arr[0];
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1]<arr[i]) {
				sum = sum + arr[i];
			}
			else {
				sum = sum - arr[i - 1] + arr[i];
			}
			if(sum > max)
				max = sum;
		}
		System.out.println(max);
	}
	
}

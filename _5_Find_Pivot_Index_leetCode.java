package _30_ArrayQuestions;

public class _5_Find_Pivot_Index_leetCode {

	public static void main(String[] args) {
		
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
		System.out.println(pivotIndex2(nums));
		System.out.println(pivotIndex3(nums));
	}
	
// by me(best) T.C. = O(n), S.C. = O(1)
	public static int pivotIndex3(int[] nums) {
		
		int rightSum = 0;
		for(int val : nums) {
			rightSum = rightSum + val;
		}
		int leftSum = 0;
		for(int i = 0; i < nums.length; i++) {
			rightSum = rightSum - nums[i];
			if(leftSum == rightSum)
				return i;
			leftSum = leftSum + nums[i];
		}
		return -1;
	}
	
// by me(nice)	T.C. = O(n), S.C. = O(n)
	public static int pivotIndex2(int[] nums) {
		
		int leftSum = 0;
		int rightSum = 0;
		
		int leftIndex = 0;
		int rightIndex = nums.length - 1;
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		
		while(leftIndex < nums.length && rightIndex >= 0) {
			leftSum = leftSum + nums[leftIndex];
			rightSum = rightSum + nums[rightIndex];
			left[leftIndex++] = leftSum;
			right[rightIndex--] = rightSum;
		}
		for(int i = 0; i < nums.length; i++) {
			if(left[i] == right[i])
				return i;
		}
		return -1;
	}
	
// by me(good)	T.C. = O(n), S.C. = O(n)
	public static int pivotIndex(int[] nums) {
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int sum = 0;
//	left	
		for(int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			left[i] = sum;
		}
//	right
		sum = 0;
		for(int i = nums.length - 1; i >= 0; i--) {
			sum = sum + nums[i];
			right[i] = sum;
		}
//	check pivot
		for(int i = 0; i < nums.length; i++) {
			if(left[i] == right[i])
				return i;
		}
		return -1;
	}
	
}

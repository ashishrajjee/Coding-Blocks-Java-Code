package _30_ArrayQuestions;

public class _4_K_Concatenation_CodeChef_LeetCode {
 
	//arr = {1,2,3}
	//k times 1,2,3
	//if k = 2
	//so arr = {1,2,3}, {1,2,3}
	//find maximum SubArray sum

	public static void main(String[] args) {
		int[] arr = {4, -10, -2, -3, 4};
		int k = 1;
		System.out.println(kConcatenation(arr, k));
	}
	
	public static int kConcatenation(int[] arr, int k) {
		
		int mod = 1000000007;
		
		long sum = 0;
		for(int val : arr) {
			sum += val;
		}
		if(k == 1) {
			return kadane(arr);
		}
		else if(sum < 0) {
			return kadane2Repeat(arr);
		}
		else {
			return (int)(kadane2Repeat(arr) + (k - 2) * sum) % mod;
		}	
	}
	
	public static int kadane2Repeat(int[] arr) {
		
		int[] newArr = new int[arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
			newArr[arr.length + i] = arr[i];
		}
		return kadane(newArr);
	}
	
	public static int kadane(int[] arr) {
		
		int sum = arr[0];
		int maxSum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			sum = Math.max(sum + arr[i], arr[i]);
			if(sum > maxSum)
				maxSum = sum;
		}
		if(maxSum < 0)
			maxSum = 0;
		return maxSum;
	}

}

package _27_Bit_Manipulation;

public class _8_FindMissingTwoNumber {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr = {1,4,3,6};
		int xor = 0;
		
		for(int val : arr)
			xor = xor ^ val;
		
		for(int i = 1; i <= n; i++)
			xor = xor ^ i;
		
		int rightMostSetBitMask = xor & (-xor);
		
		int firstMissingNumber  = 0;
		int secondMissingNumber = 0;
		
		for(int val : arr) {
			
			if((val & rightMostSetBitMask) == 0) {
				firstMissingNumber = firstMissingNumber ^ val;
			}
			else {
				secondMissingNumber = secondMissingNumber ^ val;
			}
		}
		for(int i = 1; i <= n; i++) {
			if((i & rightMostSetBitMask) == 0) {
				firstMissingNumber = firstMissingNumber ^ i;
			}
			else {
				secondMissingNumber = secondMissingNumber ^ i;
			}
		}
		System.out.println("1st Missing Number " + firstMissingNumber);
		System.out.println("2nd Missing Number " + secondMissingNumber);
	}
}

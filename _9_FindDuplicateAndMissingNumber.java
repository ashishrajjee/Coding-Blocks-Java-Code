package _27_Bit_Manipulation;

public class _9_FindDuplicateAndMissingNumber {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr = {1,2,3,5,5,6};
		int xor = 0;
		
		for(int val : arr)
			xor = xor ^ val;
		
		for(int i = 1; i <= n; i++)
			xor = xor ^ i;
		
		int rightMostSetBitMask = xor & (-xor);
		
		int firstNumber  = 0;
		int secondNumber = 0;
		
		for(int val : arr) {
			
			if((val & rightMostSetBitMask) == 0) {
				firstNumber = firstNumber ^ val;
			}
			else {
				secondNumber = secondNumber ^ val;
			}
		}
		for(int i = 1; i <= n; i++) {
			if((i & rightMostSetBitMask) == 0) {
				firstNumber = firstNumber ^ i;
			}
			else {
				secondNumber = secondNumber ^ i;
			}
		}
		for(int val : arr) {
			if(val == firstNumber) {
				System.out.println("Duplicate Number " + firstNumber);
				System.out.println("Missing Number " + secondNumber);
				break;
			}
			else if(val == secondNumber) {
				System.out.println("Duplicate Number " + secondNumber);
				System.out.println("Missing Number " + firstNumber);
				break;
			}
		}	
	}
}

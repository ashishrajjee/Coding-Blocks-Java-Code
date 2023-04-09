package _27_Bit_Manipulation;

public class _5_FindMissingOneNumber {

	public static void main(String[] args) {
		
//		[1,2,3,4,6], 5 no. missing, find this number
		
//	1st Approach by mam	
		int[] arr = {1,2,3,4,6};
		int length = arr.length;
		int nNumberSum = ((length + 1) * (length + 1 + 1))/2; 
		int totalArrSum = 0;
		for(int val : arr) {						//5 number missing
			totalArrSum += val;
		}
		int missingNumber = nNumberSum - totalArrSum;
		System.out.println(missingNumber);
		
//	2nd	Approach
		int[] arr1 = {1,2,3,4,6};
		boolean[] b = new boolean[arr1.length + 2];
		
		for(int i = 0; i < arr1.length; i++) {
			b[arr1[i]] = true;
		}											//5 number missing
		for(int i = 1; i < b.length; i++) {
			if(b[i] == false) {
				System.out.println(i);
				break;
			}
		}
		
//		3rd	Approach by me best
		int[] arr3 = {0,3,1,4,2,6};
		int ans = 0;
		for(int i = 0; i < arr3.length; i++) {
			ans = ans + i - arr3[i];
		}											//5 number missing
		System.out.println(ans + arr3.length);
		
//		4th	Approach by mam
		int n = 7;
		int[] arr4 = {7,3,1,4,2,6};
		int xor = 0;
		
		for(int val : arr4) {
			xor = xor ^ val;
		}											//5 number missing
		for(int i = 1; i <= n; i++) {
			xor = xor ^ i;
		}
		System.out.println(xor);
		
//		4th	Approach by me best
		int[] arr5 = {7,3,1,4,2,6,5,9};
		int xor1 = 0;
	
		for(int i = 0; i < arr5.length; i++) {		//8 number missing
			xor1 = xor1 ^ (i + 1) ^ arr5[i] ;
		}
		System.out.println(xor1 ^ (arr5.length + 1));	
	}
}

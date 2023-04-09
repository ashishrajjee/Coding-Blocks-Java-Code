package _10Mislinous;

public class SumOfCountoftheNo {
	
	public static void main(String[] args) {
		int[] arr1 = {5, 8, 10, 13};		
		System.out.println(sumOfCountoftheNo(arr1, 3));
		System.out.println(sumOfCountoftheNo2(arr1, 3));
//		5 = 3 + 2, 8 = 3 + 3 + 2, 10 = 3 + 3 + 3 + 1, 13 = 3 + 3 + 3 + 3 + 1
//		5 have 2 number, 8 have 3 number, 10 have 4 number and 13 have 5 number
//		so total number is 2 + 3 + 4 + 5 = 14 answer
	}
	
	public static int sumOfCountoftheNo(int[] arr, int dividedValue) {
		
		int totalSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int value = arr[i];
			while(value > 0) {
				totalSum++;
				value = value - dividedValue;
			}
		}
		return totalSum;
	}
	
//	best Code
	public static int sumOfCountoftheNo2(int[] arr, int dividedValue) {
		
		int totalSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			totalSum = totalSum + (arr[i] / dividedValue);
//			if reminder grater than 0
			if(arr[i] % dividedValue > 0) {
				totalSum++;
			}
		}
		return totalSum;
	}
}

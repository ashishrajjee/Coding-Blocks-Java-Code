package _13LeetCode;

public class LLeetCodeBestTimetoBuyandSellStock {

	public static void main(String[] args) {
	
		int[] arr3 = { 7, 1, 5, 3, 6, 4};
		
		System.out.println(bestTimetoBuyandSell(arr3));	
	}
	
	public static int bestTimetoBuyandSell(int[] arr){
		
		int buyMinValue = Integer.MAX_VALUE;
		int sellMaxValue = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < buyMinValue) {
				buyMinValue = arr[i];
				
			}
			else
				sellMaxValue = Math.max(sellMaxValue, arr[i] - buyMinValue);
		}
		
		return sellMaxValue;
	}
	
}

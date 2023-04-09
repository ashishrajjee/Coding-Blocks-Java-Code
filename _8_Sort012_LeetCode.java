package _30_ArrayQuestions;

public class _8_Sort012_LeetCode {

	public static void main(String[] args) {
	
		int[] arr = {1,0,2,1,0,2,1,0,2,1,0};
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		int low = 0;
		int mid = 0;
		int hight = arr.length - 1;
		
		while(mid <= hight) {
		
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else if(arr[mid] == 2) {
				int temp = arr[hight];
				arr[hight] = arr[mid];
				arr[mid] = temp;
				hight--;
			}
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
	
}

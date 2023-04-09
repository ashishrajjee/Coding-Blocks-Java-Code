package _30_ArrayQuestions;

public class _9_ThreeWayPartitioning {

	public static void main(String[] args) {
	
		int[] arr = {1,14,5,20,4,2,54,20,87,98,3,1,32};
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		partitioning(arr, 14, 20);
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
	
	public static void partitioning(int[] arr, int lowValue, int hightValue) {
		
		int low = 0;
		int mid = 0;
		int hight = arr.length - 1;
		
		while(mid <= hight) {
		
			if(arr[mid] < lowValue) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			else if(lowValue <= arr[mid] && arr[mid] <= hightValue) {
				mid++;
			}
			else if(arr[mid] > hightValue) {
				int temp = arr[hight];
				arr[hight] = arr[mid];
				arr[mid] = temp;
				hight--;
			}
		}
	}
	
}

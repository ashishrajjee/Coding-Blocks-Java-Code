package _14Divide_And_Conquer;

public class _3QuickSort {

	public static void main(String[] args) {
		
		int input[] = {9,6,3,8,2,5,1,4,7,};
		
		quickSort(input, 0, input.length - 1);
		
		for(int a : input) {
			System.out.print(a + ", ");
		}
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high)
			return;
		
		int mid = (low + high) / 2;
		
		//start
		int pivot = arr[mid];
		
		int left = low;
		int right = high;
		
		while(left <= right) {
			
			//left problem point
			while(arr[left] < pivot)
				left++;
			
			//right problem point
			while(arr[right] > pivot)
				right--;
			
			//problem resolve : swap
			if(left <= right) {	
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		//stop
		//small problem work
		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}
	
}

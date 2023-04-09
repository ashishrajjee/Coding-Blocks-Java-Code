package _14Divide_And_Conquer;

public class _2MergeSortAlgorithm {
	
	public static void main(String[] args) {
		
		int input[] = {9,6,3,8,2,5,1,4,7};
		
		int[] ans = mergeSort(input, 0, input.length - 1);
		
		for(int a : ans) {
			System.out.print(a + ", ");
		}
	}
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low == high) {
			int[] baseResult = new int[1];
			baseResult[0] = arr[low];
			return baseResult;
		}
		int mid = (low + high) / 2;
		
		int[] firstHalf = mergeSort(arr, low, mid);
		int[] secondHalf = mergeSort(arr, mid + 1, high);
		
		int[] result = merge2SortedArray(firstHalf, secondHalf);
		
		return result;
	}
	
	public static int[] merge2SortedArray(int[] arr1, int[] arr2) {
		
		int[] merge = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			
			if(arr1[i] < arr2[j]) {
				merge[k++] = arr1[i++];
			}
			else {
				merge[k++] = arr2[j++];
			}	
		}
		
		while(i < arr1.length) {
			merge[k++] = arr1[i++];
		}
		
		while(j < arr2.length) {
			merge[k++] = arr2[j++];
		}
		return merge;
	}
	
}

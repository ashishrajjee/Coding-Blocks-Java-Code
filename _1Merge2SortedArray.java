package _14Divide_And_Conquer;

public class _1Merge2SortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {10,30,50,80,100};
		int[] arr2 = {15,20,25,60,70};
		
		int merge[] = merge2SortedArray(arr1, arr2);
		
		for(int i = 0; i < merge.length; i++)
			System.out.print(merge[i] + ", ");
	}
	
	public static int[] merge2SortedArray(int[] arr1, int arr2[]) {
		
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

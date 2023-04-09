package _14Divide_And_Conquer;

public class _3QuickSort2 {
	public static void main(String[] args) {
		
		int input[] = {9,6,3,8,2,5,1,4,7,};
		
		quickSort2(input, 0, input.length - 1);
		
		for(int a : input) {
			System.out.print(a + ", ");
		}
	}
	
	public static void quickSort2(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	         
	        // pi is partitioning index, arr[p]
	        // is now at right place
	        int pi = partition(arr, low, high);
	 
	        // Separately sort elements before
	        // partition and after partition
	        quickSort2(arr, low, pi - 1);
	        quickSort2(arr, pi + 1, high);
	    }
	}
	
	public static int partition(int[] arr, int low, int high)
	{
	     
	    // pivot
	    int pivot = arr[high];
	     
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1);
	    for(int j = low; j <= high - 1; j++)
	    {
	         
	        // If current element is smaller
	        // than the pivot
	        if (arr[j] < pivot)
	        {
	             
	            // Increment index of
	            // smaller element
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	// A utility function to swap two elements
	public static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
}

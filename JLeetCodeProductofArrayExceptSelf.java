package _13LeetCode;

public class JLeetCodeProductofArrayExceptSelf {

	public static void main(String[] args) {
		
		int arr[] = {5, 6, 3, 4};
		
		int ans[] = findProductofArray(arr);
		
		for(int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
		
		System.out.println();
		
		int ans1[] = findProductofArray2(arr);
		
		for(int i = 0; i < ans1.length; i++)
			System.out.print(ans1[i] + " ");
		
	}
	
	public static int[] findProductofArray(int[] arr) {
		
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		
		left[0] = 1;
		right[arr.length - 1] = 1;
		
		for(int l = 1; l < left.length; l++)
			left[l] = left[l-1] * arr[l-1];
		
		for(int r = arr.length - 2; r >= 0; r--)
			right[r] = right[r+1] * arr[r+1];
		
		for(int i = 0; i < left.length; i++)
			left[i] = left[i] * right[i];
		
		
		return left;
	}
	
	public static int[] findProductofArray2(int[] arr) {
		
		int left[] = new int[arr.length];
		
		left[0] = 1;
		
		for(int i = 1; i < left.length; i++)
			left[i] = left[ i - 1] * arr[ i - 1 ];
		
		int r = 1;
		
		for(int i = left.length - 1; i >= 0; i--) {
			left[i] = left[i] * r;
			r = r * arr[i];
		}
		
		return left;
	}
	
}

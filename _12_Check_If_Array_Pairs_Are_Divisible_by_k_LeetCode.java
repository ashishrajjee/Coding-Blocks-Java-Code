package _30_ArrayQuestions;

public class _12_Check_If_Array_Pairs_Are_Divisible_by_k_LeetCode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,10,6,7,8,9};
		int k = 5;
		System.out.println(canArrange(arr, k));
	}
//	wrong
	public static boolean canArrange(int[] arr, int k) {
        
		int n = arr.length / 2;
		
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if((arr[i] + arr[j]) % 5 == 0) {
				n--;
				i++;
				j--;
				if(n == 0)
					return true;
			}
		}
		
		
		return false;
    }
	
}

package _30_ArrayQuestions;

public class _7_Convert_Array_into_Zig_Zag_Fashion {

	public static void main(String[] args) {
		
		int[] arr = {4,3,7,8,6,2,1,9};		//a < b > c
		boolean flag = true;				// a < b
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(flag && arr[i] > arr[i + 1]) {		//		a  <  b
				int temp = arr[i];					//	arr[i] < arr[i + 1]
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			else if(!flag && arr[i] < arr[i + 1]) {	//		b  >  c
				int temp = arr[i];					//	arr[i] > arr[i + 1]
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			flag = !flag;
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
	
}

package _10Mislinous;

public class PrintSubsetOfANumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		printSubset(arr, 0, "");
	}
	
	public static void printSubset(int[] arr, int index, String answer) {
		
		if(index == arr.length) {
			System.out.println(answer);
			return;
		}
		
		printSubset(arr, index + 1, answer + arr[index]);
		printSubset(arr, index + 1, answer);
	}
}

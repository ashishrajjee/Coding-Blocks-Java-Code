package _10Mislinous;
import java.util.ArrayList;
import java.util.Collections;

public class PrintSubsetSum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		ArrayList<Integer> list = new ArrayList<Integer>();
		printSubsetSum(arr, 0, 0, list);
//		System.out.println();
//		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void printSubsetSum(int[] arr, int index, int answer, ArrayList<Integer> list) {
		
		if(index == arr.length) {
//			System.out.print(answer + ", ");
			list.add(answer);
			return;
		}
		printSubsetSum(arr, index + 1, answer + arr[index], list);
		printSubsetSum(arr, index + 1, answer, list);
	}
}

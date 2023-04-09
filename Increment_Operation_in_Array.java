package _10Mislinous;

import java.util.Scanner;
							
public class Increment_Operation_in_Array {				//Input : n = 4 m = 3
														//a = 1, b = 2, k = 603
	public static void main(String[] args) {			//a = 0, b = 0, k = 286
														//a = 3, b = 3, k = 882
		Scanner s = new Scanner(System.in);				//Output : 882
		int n = s.nextInt(); //size of Array	//5
		int m = s.nextInt(); //operations		//4
		
		int[] arr = new int[n + 1];
		
		for(int i = 1; i <= m; i++) {
			
			int a = s.nextInt();	//starting length	//1 //0	//2	//3
			int b = s.nextInt();	//ending length		//2	//3	//4	//4
			int k = s.nextInt();	//put value in between starting and ending	//20 //5 //50 //10
			
			arr[a] += k;
			arr[b + 1] -= k;
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length - 1; i++) {	
			sum += arr[i];
			if(sum > max)
				max = sum;
		}
		System.out.println(max);//75
		s.close();
	}
	
}

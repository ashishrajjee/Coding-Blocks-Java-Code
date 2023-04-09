package _22Stack_Questions;

import java.util.Stack;

public class _3_Celebrity_Problems {
												 // 0  1  2  3		* means all star are celebrity
	//celebrity - knows no one		 example:-	0// *  -  -  -		- means  not celebrity
	//everyone knows celebrity					1// -  *  -  *		verify 2 is celebrity, check 2 columns here 
	//find - who is celebrity ???				2// *  *  *  *		rows 0,1 and 3 knows 2 is celebrity
	//											3// -  -  -  * 		

	public static void main(String[] args) {
		
		int arr[][] = { {0,1,1,1}, {1,0,1,0}, {0,0,0,0}, {1,1,1,0} };
		celebrityProblem(arr);
		
	}
	
	public static void celebrityProblem(int[][] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			s.push(i);	
		}
		
		while(s.size() >= 2) {
			
			int a = s.pop();
			int b = s.pop();
			
			// if a knows b, a can't be a celebrity. So, a discard
			if(arr[a][b] == 1) {
				s.push(b);
			}
			// if a doesn't know b, b can't be a celebrity. So, b discard
			else {
				s.push(a);
			}
		}
		
		int candidate = s.pop();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i != candidate) {				//don't check arr[candidate][candidate], because this point is candidates
				
				if(arr[candidate][i] == 1 || arr[i][candidate] == 0) {	//check rows and columns that is celebrity or not
					System.out.println("No Celebrity");
					return;
				}
			}
		}
		System.out.println(candidate + " is celebrity");
		
	}

}

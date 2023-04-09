/*
       1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
*/
package _1Number_Patterns;

import java.util.Scanner;

public class Pattern_2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int row = 1;
		
		int noSpace = n - 1;
		
		int noNumbers = 1;
		
		int noPrint = 1;
		
		while(row <= n)
		{
			for(int space = 1; space <= noSpace; space = space + 1)
				System.out.print("  ");
			
			for(int number = 1; number <= noNumbers; number = number + 1)
				System.out.print(noPrint + " ");
			
			System.out.println();
			
			noSpace = noSpace - 1;
			noNumbers = noNumbers + 2;
			row = row + 1;
			noPrint = row;
			//noPrint = noPrint + 1;
		}
		s.close();
	}
}

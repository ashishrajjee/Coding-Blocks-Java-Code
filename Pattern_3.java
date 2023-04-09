/*
 		1	

	2	3	4	

5	6	7	8	9
*/
package _1Number_Patterns;

import java.util.Scanner;

public class Pattern_3 {
	
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
				System.out.print("\t");
			
			for(int number = 1; number <= noNumbers; number = number + 1)
			{
				//System.out.print(noPrint++ + "\t");
				System.out.print(noPrint + "\t");
				noPrint = noPrint + 1;
			}
			
			System.out.println();
			System.out.println();
			
			noSpace = noSpace - 1;
			noNumbers = noNumbers + 2;
			row = row + 1;
		}
		s.close();
	}
}

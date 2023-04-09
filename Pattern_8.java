/*
*       * 
  *   *   
    *     
  *   *   
*       * 
*/
package _2Star_Patterns;

import java.util.Scanner;

public class Pattern_8 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int row = 1;
		
		while(row <= n) {
			
			//for star
			for(int column = 1;  column <= n; column = column + 1) {
				if(row == column || row + column == n + 1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			//changes
			System.out.println();
			row = row + 1;
		}
		s.close();
	}
}
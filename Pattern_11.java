/*
        * 
      *   * 
    *   *   * 
  *   *   *   * 
*   *   *   *   *
*/
package _2Star_Patterns;

import java.util.Scanner;

public class Pattern_11 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int no_Space =  n - 1;
		
		int no_Star =  1;
		
		int row = 1;
		
		while(row <= n) {
			
			//for space
			for(int space = 1;  space <= no_Space; space = space + 1)
				System.out.print("  ");
			
			//for star
			for(int star = 1;  star <= no_Star; star = star + 1) {
				if(star % 2 != 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			//changes
			System.out.println();
			row = row + 1;
			no_Space = no_Space - 1;
			no_Star = no_Star + 2;
		}
		s.close();
	}
}
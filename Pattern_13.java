/*
                  0 
                9 0 9 
              8 9 0 9 8 
            7 8 9 0 9 8 7 
          6 7 8 9 0 9 8 7 6 
        5 6 7 8 9 0 9 8 7 6 5 
      4 5 6 7 8 9 0 9 8 7 6 5 4 
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 
 */
package _1Number_Patterns;

import java.util.Scanner;

public class Pattern_13 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int row = 1; row <= n; row++) {
			
			for(int firstHalfColumn = 1; firstHalfColumn <= n; firstHalfColumn++) {
				
				if(firstHalfColumn == n)
					System.out.print("0 ");
				
				else if(firstHalfColumn > n - row)
					System.out.print(firstHalfColumn + " ");
				
				else
					System.out.print("  ");
			}
			
			for(int secondHalfColumn = n - 1; secondHalfColumn >= 1; secondHalfColumn--) {
				
				if(secondHalfColumn > n - row)
					System.out.print(secondHalfColumn + " ");
			}
			
			System.out.println();
		}
		s.close();
	}
}
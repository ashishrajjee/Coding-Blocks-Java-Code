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

public class Pattern_12 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int row = 1;//start row
		
		int space = n - 1;//space print n - 1 times
		
		int column = 1;//1st row print 1 column
		
		int nums = n;//row wise change number
		
		int printnums = nums;//print change numbers
		
		while(row <= n) {
			
			//for space
			for(int sp = 1; sp <= space; sp =sp + 1)
				System.out.print("  ");
			
			//for number
			for(int col = 1; col <= column ; col = col + 1) {
				if(col <= column / 2) {
					System.out.print(printnums + " ");//print increase number
					printnums = printnums + 1;
				}
				else if(printnums == n) {
					System.out.print("0 ");//print "0" if printnums is n
					printnums = printnums - 1;
				}
				else
				{
					System.out.print(printnums + " ");//print decrease number
					printnums = printnums - 1;
				}	
			}
			System.out.println();//new line for new row
			
			space = space - 1;// decrease space
			column = column + 2;//columns number increase
			nums = nums - 1;//change number for next row
			printnums = nums;//print change number again and again
			row = row + 1;//change next row
		}	
		s.close();
	}
}
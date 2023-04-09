

import java.util.Scanner;

public class findLargerInANumber {
	
	public static void main(String[] args) {
		//wrong
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if(str.length() % 2 == 1)
			str += "0";
		int n = Integer.parseInt(str);
		int max = Integer.MIN_VALUE;
		
		while(n != 0) {
			int smallmax = n % 100;
			if(smallmax > max)
				max = smallmax;
			n = n / 100;
		}
		System.out.println(max);
		s.close();
	}
}

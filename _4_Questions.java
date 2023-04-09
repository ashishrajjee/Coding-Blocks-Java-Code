package _27_Bit_Manipulation;

public class _4_Questions {

	// Q.1	number x will be given, ON Ith bit in this number. Example:-
	//              ?  <-- on this bit to 1
	//		1 0 1 1 0 1 0 1		//Question
	//		0 0 0 0 1 0 0 0		// 1 << 3 shift to ith position
	//		0 0 0 0 1 0 0 0		//add this value by OR(|) operator
	//		1 0 1 1 1 1 0 1		//Answer
	
	// Q.2	number x will be given, OFF Ith bit in this number. Example:-
	//              ?  <-- OFF this bit to 0
	//		1 0 1 1 1 1 0 1		//Question
	//		0 0 0 0 1 0 0 0		// 1 << 3 shift to ith position
	//		0 0 0 0 1 0 0 0		//then flip this value by tilde(~) this sign
	//		1 1 1 1 0 1 1 1		//and add this value by AND(&) operator
	//		1 0 1 1 0 1 0 1		//Answer
	
	//Q.3	Ith bit ko toggle bana do
	//		matlb 0 hai to 1 kar do, 1 hai to 0 kar do
	//  			?  <-- toggle this bit
	//		1 0 1 1 1 1 0 1		//Question
	//		0 0 0 0 1 0 0 0		// 1 << 3 shift to ith position
	//		0 0 0 0 1 0 0 0		//and add this value by XOR(^) operator
	//		1 0 1 1 0 1 0 1		//Answer
	
	//Q.4	check Ith bit 1 hai ya 0 hai ???
	//				?  <-- check this bit
	//		1 0 1 1 1 1 0 1		//Question
	//		0 0 0 0 1 0 0 0		// 1 << 3 shift to ith position
	//		0 0 0 0 1 0 0 0		//and add this value by AND(&) operator
	//		0 0 0 0 1 0 0 0		//Answer
	
	//Q.5	x value will be given, x value me right most first 1 bit
	//		ka mask banana hai  Example:-
	//	x	 = 	0 0 1 0 1 0 0 0
	//	mask =	0 0 0 0 1 0 0 0
	//			1 1 0 1 0 1 1 1 	flip x value by ~ tilde sign
	//          1 1 0 1 0 1 1 1     add 1 to flip value			
	//	y    =	1 1 0 1 1 0 0 0     store this value to y
	// flip x and add 1 means we find 2's complement (~x + 1) = 2's complement
	// 2's complement find nagation of number. example x = 2, answer = -2
	//	x	 = 	0 0 1 0 1 0 0 0
	//	y    =	1 1 0 1 1 0 0 0
	//	mask =	0 0 0 0 1 0 0 0		answer //do this (x & -x) or do this (x & y)	
	
	//Q.6	count total number of set(1) bits in x number(set means 1, unset means 0)
	//Approach 1:- count = 0;
	//Question x  =	0 1 0 1 1 0 0 1
	//create mask = 0 0 0 0 0 0 0 1		// mask << 0(use this for creating mask)
	// x & mask   =	0 0 0 0 0 0 0 1		//increase count by 1(count++; = count = 1)
	// now total set(1) bit find karne ke ab 2 tarike hai
	//1.	left shift mask by 1(mask << 1) then do this (x & mask)
	//2.	right shift x by 1 (x >> 1) then do this (x & mask)
	//use 2nd option
	//	 	   x  =	0 1 0 1 1 0 0 1    // x = (x >> 1)
	//   now   x  =	0 0 1 0 1 1 0 0    //
	//	     mask = 0 0 0 0 0 0 0 1	   //use old mask
	// x & mask   =	0 0 0 0 0 0 0 0	  // here no any set(1) bit, not increase count
	//				do this process jabtak x ka sara number zero(0) nhi ho jata
	//Approach 2:- count = 0;
	//Brian Kerni Ghans Algorithm(Best)
	
	public static void main(String[] args) {
		
//Q. 6 solution - Approach 1//    128 64 32 16 8 4 2 1	//4 + 2 + 1 = 7
//		byte x = 7;			// 7 = 0  0  0  0  0 1 1 1	//1, 3 bar hai to 3 answer
//		int count = 0;
//		while(x != 0) {
//			
//			if((x & 1) == 1)
//				count++;
//			x = (byte) (x >> 1);
//		}
//		System.out.println(count);
//Q. 6 solution - Approach 1
		int x = 7;
		int count = 0;
		int mask = 1;
		while(x != 0) {
			
			if((x & mask) == 1)
				count++;
			x = x >> mask;
		}
		System.out.println(count);
	
//Q. 6 find total set(1) bits
//solution - Approach 2	//best Approach
//Brian Kerni Ghans Algorithm
		
		int n = 120;
		System.out.println(Integer.toBinaryString(n));
		int count1 = 0;
		while(n != 0) {
			
			int rightMostSetBitMask = (n & (-n));
			
			n = n - rightMostSetBitMask;
			count1++;
		}
		System.out.println(count1);
		
//find unique number
//in array every number repeat twice, only one number appears once
		int[] arr = {10, 15, 25, 15, 60, 25, 10};
		
//using XOR oprator
		int ans = 0;
		for(int value : arr) {
			ans = ans ^ value;
		}
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package _27_Bit_Manipulation;

public class _11_MagicNumber {

	public static void main(String[] args) {
		
//	magic number = number which can be represent as sum of power of 5
		
//		5^0 							= 1 ---- 1st magic number
//		5^1 							= 5	---- 2nd magic number
//		5^0 + 5^1 = 1 + 5				= 6	---- 3rd magic number
//		5^2 							= 25 ---- 4th magic number
//		5^2 + 5^0 = 25 + 1				= 26 ---- 5th magic number
//		5^2 + 5^1 = 25 + 5				= 30 ---- 6th magic number
//		5^2 + 5^1 + 5^0 = 25 + 5 + 1	= 31 ---- 7th magic number
	//Find nth Magic number
		
		int n = 7;
		int mult = 1; //5 power 0 = 1
		int ans = 0;

		while(n != 0) {
			if((n & 1) == 1) {			//last bit
				ans = ans + mult;
			}
			mult = mult * 5;
			n = n >> 1;
		}
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
	}
}

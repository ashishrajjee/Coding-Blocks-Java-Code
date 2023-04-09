package _27_Bit_Manipulation;

public class _10_CheckPowOf2 {

	public static void main(String[] args) {
		
//	1st Approach	
		int num = 16;
		int rightMostSetBitMask = num & (-num);
		System.out.println(num == rightMostSetBitMask);
		
//	2nd Approach
		int no = 16;
		System.out.println((no & (no - 1)) == 0);
		
//	3rd Approach
		int n = 1;
		if(n >= 1 && (n & (n - 1)) == 0) {			//0 is not power of 2
			System.out.println("Power of 2");		//2 to the pow of 0 = 1
		}
		else {
			System.out.println("Not Power of 2");
		}
	}
}

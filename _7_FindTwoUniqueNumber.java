package _27_Bit_Manipulation;

public class _7_FindTwoUniqueNumber {

	public static void main(String[] args) {
		
		int[] arr = {36,50,24,56,36,24,42,50};
		int xor = 0;
		
		for(int val : arr) {
			xor = xor ^ val;
		}
		int rightMostSetBitMask = xor & (-xor);
		
		int unique1 = 0;
		int unique2 = 0;
		
		for(int val : arr) {
			// unset(0)
			if((val & rightMostSetBitMask) == 0) {
				unique1 = unique1 ^ val;
			}
			// set(1)
			else {
				unique2 = unique2 ^ val;
			}
		}
		System.out.println("unique1 " + unique1 + ", unique1 " + unique2);	
	}
}

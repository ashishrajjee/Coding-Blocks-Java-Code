package _27_Bit_Manipulation;

public class _6_FindOneUniqueNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 1, 4, 2};
		
		int xor = 0;
		
		for(int val: arr) {
			xor = xor ^ val;
		}
		System.out.println(xor);
	}
}

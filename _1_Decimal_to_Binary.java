package _27_Bit_Manipulation;

public class _1_Decimal_to_Binary {

	public static void main(String[] args) {
		
		int n = 57;
		int mult = 1;
		int binary = 0;
		
		//shortcut
		System.out.println(Integer.toBinaryString(n));
		
		while(n != 0) {
			
			int rem = n % 2;
			int temp = rem * mult;
			
			binary = binary + temp;
			
			mult = mult * 10;
			
			n = n / 2;
		}
		System.out.println(binary);
	}
}

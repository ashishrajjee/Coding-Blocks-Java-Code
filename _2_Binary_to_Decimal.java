package _27_Bit_Manipulation;

public class _2_Binary_to_Decimal {

	public static void main(String[] args) {
		
		int n = 111001;
		int mult = 1;
		int decimal = 0;
		
		while(n != 0) {
			
			int rem = n % 10;
			int temp = rem * mult;
			
			decimal = decimal + temp;
			
			mult = mult * 2;
			
			n = n / 10;
		}
		System.out.println(decimal);
	}
}

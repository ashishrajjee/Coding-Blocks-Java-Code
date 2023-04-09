package _27_Bit_Manipulation;

public class _3_Mix {

	public static void main(String[] args) {
		
		int a = 36;
		int b = 40;
		
		System.out.println(a | b);		//44
		System.out.println(20 | 0);		//20
		System.out.println(a & b);		//32
		System.out.println(20 & 0);		//0
		System.out.println(a ^ b);		//12
		System.out.println(20 ^ 0);		//20
		System.out.println(20 << 1);	//40
		System.out.println(20 << 2);	//80
		System.out.println(20 >> 1);	//10
		System.out.println(20 >> 2);	//5
		System.out.println(20 >> 3);	//2		<-- (2.5 = 2)
		System.out.println(-20 >> 1);	//-10			//-ve ke liye MSB 1 hota hai
		System.out.println(-20 >>> 1);	//2147483638	//here not copy MSB value
		System.out.println(~3);    		//-4	//~ this sign find 1's complement
		System.out.println(~3 + 1);		//-3	//find 2's complement
		
//abhi tak aise karte aaye
		int n = 25;
		while(n != 0) {
			int rem = n % 2;
			System.out.print(rem + " ");	//1 0 0 1 1 
			n = n / 2;
		}
		System.out.println();
//upper wale code ko bit wise me aise karenge
		n = 25;
		while(n != 0) {
			int rem = n & 1;
			System.out.print(rem + " ");	//1 0 0 1 1 
			n = n >> 1;
		}
		System.out.println();
//check-----
		n = 25;
		System.out.println(Integer.toBinaryString(n));		//11001
		System.out.println(Integer.toBinaryString(1));		//00001
		System.out.println(Integer.toBinaryString(n & 1));	//1
		System.out.println(Integer.toBinaryString(n >> 1));	//1100
		
		
		
		
		
	}
}

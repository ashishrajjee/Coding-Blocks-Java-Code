package _30_ArrayQuestions;

public class _3_Hamming_Distance_Leet_Code {

	public static void main(String[] args) {
		
		int x = 6;	//0 1 1 0		//1 and 0 diff in same place so ans = 1
		int y = 4;	//0 1 0 0
		
		int xor = x ^ y;
		int count = 0;
		
		while(xor > 0) {
			if((xor & 1) == 1)
				count++;
			xor = xor >> 1;
		}
		System.out.println(count);
	}
	
}

package _13LeetCode;

public class MLeetCodeHappyNumber {

	public static void main(String[] args) {
		
		//System.out.println(replaceNoBySumOfSquareItsDigitsUntilNoEquals1(19));
		
		for(int i = 0; i <= 100; i++) {
			if(replaceNoBySumOfSquareItsDigitsUntilNoEquals1(i))
				System.out.println(i);
		}
	
	}
	
	public static boolean replaceNoBySumOfSquareItsDigitsUntilNoEquals1(int number) {
		
//		Psitive Base Case
		if(number == 1) {
			return true;
		}
		
//		Neagtive Base Case
		if( number != 7 && number < 10)
			return false;
		
		return replaceNoBySumOfSquareItsDigitsUntilNoEquals1(newNumber(number));
	}
	
	public static int newNumber(int n) {
		
		int newNo = 0;
		
		while(n != 0) {
			int rem = n % 10;
			newNo = newNo + (rem * rem);
			n = n / 10;
		}
		return newNo;
	}	
}
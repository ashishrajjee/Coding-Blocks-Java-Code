import java.util.ArrayList;

public class PrimeOddEven {

	public static void main(String[] args) {
		sumOfOddEven(10);
		printEvenAndOddNumbers(10);
		sumofPrimeAndNonPrimeNumbers(10);
		printPrimeAndNonPrimeNumbers(10);
	}
	
	public static void printPrimeAndNonPrimeNumbers(int n) {
		
		ArrayList<Integer> primeList = new ArrayList<>();
		ArrayList<Integer> nonPrimeList = new ArrayList<>();
		boolean flag;
		
		for(int i = 1; i <= n; i++) {
			
			flag = true;	// true for odd numbers
			
			for(int j = 2; j * j <= i; j++) {
//			for(int j = 2; j <= Math.sqrt(i); j++) {
//			for(int j = 2; j <= i / 2; j++) {
				
				if( i % j == 0) {
					flag = false;
					break;	
				}
			}
			if(flag)
				primeList.add(i);
			else
				nonPrimeList.add(i);
		}
		System.out.println("Prime Numbers = \t" + primeList);
		System.out.println("Non Prime Numbers =\t" + nonPrimeList);
	}
	
	public static void sumofPrimeAndNonPrimeNumbers(int n) {
		
		int sumOfPrime = 0;
		int sumOfNonPrime = 0;
		boolean flag;
		
		for(int i = 1; i <= n; i++) {
			
			flag = true;	// true for odd numbers
			
			for(int j = 2; j * j <= i; j++) {
//			for(int j = 2; j <= Math.sqrt(i); j++) {
//			for(int j = 2; j <= i / 2; j++) {
				
				if( i % j == 0) {
					flag = false;
					break;	
				}
			}
			if(flag)
				sumOfPrime += i;
			else
				sumOfNonPrime += i;
		}
		System.out.println("Sum of Prime Numbers = " + sumOfPrime);
		System.out.println("Sum of Non Prime Numbers = " + sumOfNonPrime);
	}
	
	public static void printEvenAndOddNumbers(int n) {
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0)
				evenList.add(i);
			else
				oddList.add(i);
		}
		System.out.println("Even Numbers = \t" + evenList);
		System.out.println("Odd Numbers =\t" + oddList);
	}
	
	public static void sumOfOddEven(int n) {
		
		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0)
				sumOfEven += i;
			else
				sumOfOdd += i;
		}
		System.out.println("Sum of Even = " + sumOfEven + "\n" + "Sum of Odd = " + sumOfOdd);
	}
	
}

package _10Mislinous;

public class PrintAllStrictlyincreasingNumber {

	public static void main(String[] args) {
		
//		printAllnDigitNumbersWhoseDigitsAreStrictlyIncreasingFromLeftToRight(0, 3);
		findStrictlyIncreasingNum(0, "", 2);
		
	}
	
	public static void printAllnDigitNumbersWhoseDigitsAreStrictlyIncreasingFromLeftToRight(int current, int n) {
		
//		Positive base case
		if(Integer.toString(current).length() == n) {
			System.out.println(current);
			return;
		}
		
		int lastDigit = (current % 10) + 1;
		
		while(lastDigit <= 9) {
			printAllnDigitNumbersWhoseDigitsAreStrictlyIncreasingFromLeftToRight(current * 10 + lastDigit, n);
			lastDigit++;
		}
	}

	public static void findStrictlyIncreasingNum(int start, String answer, int n)
    {
        // If number becomes N-digit, print it
        if (n == 0)
        {
            System.out.println(answer);
            return;
        }
  
        // start from (prev digit + 1) till 9
        for (int i = start; i <= 9; i++)
        {
            // append current digit to number
            String str = answer + Integer.toString(i);
  
            // recurse for next digit
            findStrictlyIncreasingNum(i + 1, str, n - 1);
        }
    }
}

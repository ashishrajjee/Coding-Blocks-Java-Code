package _11Recursion;

public class demo {
	
	public static void main(String[] args) {
		
//		printDecreasing(10);
//		printIncreasing(10);
//		print_Decreasing_Increasing(5);
//		print_Increasing_Decreasing(1, 5);
//		System.out.println(findFactorial(5));
		System.out.println(findPowerOfaNumber(5, 5));
		System.out.println(findPowerOfaNumber2(5, 5));
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(findNthFibonacciNumber(5));
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
//		print_Major_tick_length(3);
//		makeRular(3, 3);
		
//		long startTime = System.currentTimeMillis();
//		makeRular(100, 100);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");

//		int[] arr = {10,20,30,40,50};
//		printArrayIncOrder(arr, 0);
//		printArrayDecOrder(arr, arr.length - 1);
//		printArrayDecOrder1(arr, 0);
//		int[] arr1 = {10,20,50,8,80,90,45};
//		System.out.println(findMaxInArray(arr1, 0));
		//int[] arr = {10,20,30,40,30};
//		System.out.println(searchElementandReturn1stIndex(arr, 0, 30));
//		System.out.println(searchElementandReturnLastIndex(arr, arr.length - 1, 30));
		//System.out.println(searchElementandReturnLastIndex2(arr, 0, 30));
		//printArrayIncOrder(findAllElementIndex(arr, 0, 30,0), 0);
//		printSubSequence("abc","");
//		printSubSequesceWithAscii("ab", "");
		
//		coinToss(2, "");
//		climbingStairs(5, 0, "");
//		climbingStairs2(5, 0, "");
//		int[] arr = {2,1,3,2,4};
//		climbingStairs3(arr, 0, "");
//		mazeHVPath(0, 0, 2, 2, "");
//		mazeHVDigonalPath(0, 0, 2, 2, "");
		
//		coinTossNoConsecutiveHead(3, "", false);
//		coinTossNoConsecutiveHeadAndStartWithOnlyTail(3, "", true);
//		coinTossNoConsecutiveTail(3, "", false);
//		coinTossNoConsecutiveTailAndStartWithOnlyHead(3, "", true);
//		coinTossNoConsecutiveHeadAndTail(3, "", false);
		
//		long startTime = System.currentTimeMillis();
//		lexicoCounting(0, 1000);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
//		long startTime1 = System.currentTimeMillis();
//		lexicoCounting2(0, 1000);
//		long endTime1 = System.currentTimeMillis();
//		System.out.println("Total Time " + (endTime1 - startTime1) + " Mili Second");
		
//		jumpingNumberOrDiffrenceBW2NumberIs1(0, 105);	
		
		
		
		
		
	}
	
	public static void printDecreasing(int n) {
		if(n < 0)
			return;
		System.out.println(n);
		printDecreasing(n-1);
	}
	
	public static void printIncreasing(int n) {
		if(n < 0)
			return;
		printIncreasing(n-1);
		System.out.println(n);
	}

	public static void print_Decreasing_Increasing(int n){
		if(n == 0)
			return;
		System.out.println(n);
		print_Decreasing_Increasing(n-1);
		System.out.println(n);
	}

	public static void print_Increasing_Decreasing(int start, int n) {
		
		if(start > n)
			return;
		
		System.out.println(start);
		
		print_Increasing_Decreasing(start + 1, n);
		
		System.out.println(start);
		
		
	}
	
	public static int findFactorial(int n) {
		
		if(n <= 1)
			return n;
		
		return n * findFactorial(n - 1);
		
	}
	
//	time complexity = n
	public static int findPowerOfaNumber(int n, int p) {
		
		if(p <= 0)
			return 1;
		
		return n * findPowerOfaNumber(n, p - 1);
	}
	
//	Best Approach(time complexity = log(n)) // this algorithm name is Fast Exponentiation Method
	public static int findPowerOfaNumber2(int n, int p) {
		
		if(p == 0)
			return 1;
		
		int smallProblem = findPowerOfaNumber2(n, p / 2);
		
		int bigProblem;
		
		if(p % 2 == 0)
			bigProblem = smallProblem * smallProblem;
		else
			bigProblem = smallProblem * smallProblem * n;
		
		return bigProblem;
		
	}
	
	public static int findNthFibonacciNumber(int n) {
		
		if(n <= 1)
			return n;
		
		return findNthFibonacciNumber(n - 1) + findNthFibonacciNumber(n - 2);
		
	}

	public static void print_Major_tick_length(int majormajor_tick_length) {
		
		if(majormajor_tick_length <= 0)
			return;
		
		print_Major_tick_length(majormajor_tick_length - 1);
		
		for(int i = 1; i <= majormajor_tick_length; i++)
			System.out.print("- ");
		System.out.println();
		
		print_Major_tick_length(majormajor_tick_length - 1);
		
	}
	
	public static void makeRular(int inch, int majormajor_tick_length) {
		
		for(int i = 1; i <= majormajor_tick_length; i++)
			System.out.print("- ");
		System.out.println(0);
		
		for(int j = 1; j <= inch; j++) {
			
			print_Major_tick_length(majormajor_tick_length - 1);
			
			for(int i = 1; i <= majormajor_tick_length; i++)
				System.out.print("- ");
			System.out.println(j);
		}
	}

	public static void printArrayIncOrder(int[] arr, int index) {
		
		if(arr.length <= index)
			return;
		
		System.out.print(arr[index] + " ");
		
		printArrayIncOrder(arr, index + 1);
	}

	public static void printArrayDecOrder(int[] arr, int index) {
		
		if(index < 0 || arr.length == 0)
			return;
		
		System.out.print(arr[index] + " ");
		
		printArrayDecOrder(arr, index - 1);
	}

	public static void printArrayDecOrder1(int[] arr, int index) {
		
		if(arr.length <= index)
			return;
		
		printArrayDecOrder1(arr, index + 1);
		
		System.out.print(arr[index] + " ");
		
	}

	public static int findMaxInArray(int[] arr, int index) {
		
		if(arr.length <= index)
			return Integer.MIN_VALUE;
//		
//		int max = findMaxInArray(arr, index + 1);
//		return Math.max(arr[index], max);
//		if(arr[index] < max)
//			return max;
//		else
//			return arr[index];
		
		return Math.max(arr[index], findMaxInArray(arr, index + 1));	
	}

	public static int searchElementandReturn1stIndex(int[] arr, int index, int element) {
		
		if(arr.length <= index)
			return -1;
		
		if(arr[index] == element)
			return index;
		
		return searchElementandReturn1stIndex(arr, index + 1, element);
	}
	
	public static int searchElementandReturnLastIndex(int[] arr, int index, int element){
		
		if(index < 0)
			return -1;
		
		if(arr[index] == element)
			return index;
		
		return searchElementandReturnLastIndex(arr, index - 1, element);
		
		
	}
	
	public static int searchElementandReturnLastIndex2(int[] arr, int index, int element){
		
		if(arr.length <= index)
			return -1;
		
		int foundIndex = searchElementandReturnLastIndex2(arr, index + 1, element);
		
		if(arr[index] == element && foundIndex == -1)
			return index;
		
		return foundIndex;
	}
	
	public static int[] findAllElementIndex(int[] arr, int index, int element, int count) {
		
		if(arr.length <= index)
			return new int[count];
		
		int[] ans;
		if(arr[index] == element) {
			ans = findAllElementIndex(arr, index + 1, element, count+1);
			ans[count] = index;
		}
		else
			ans = findAllElementIndex(arr, index + 1, element, count);
		
		return ans;
	}
	
	public static void printSubSequence(String str, String answer) {
		
		if(str.length() <= 0) {
			System.out.println(answer);
			return;
		}
		
		char ch = str.charAt(0);					//a
		String restOfCode = str.substring(1);		//bc
		
		printSubSequence(restOfCode, answer);		// (bc, "")
		printSubSequence(restOfCode, answer + ch);	// ((bc, a ) <--("" + a)) 
	}
	
	public static void printSubSequesceWithAscii(String str, String answer) {
		
		if(str.length() <= 0) {
			System.out.println(answer);
			return;
		}
		
		char ch = str.charAt(0);
		
		printSubSequesceWithAscii(str.substring(1), answer);
		printSubSequesceWithAscii(str.substring(1), answer + ch);
		printSubSequesceWithAscii(str.substring(1), answer + (int)ch);
	}
	
	public static void coinToss(int n, String answer) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		coinToss(n - 1, answer + 'H');
		coinToss(n - 1, answer + 'T');
	}

	
	public static void climbingStairs(int n, int current, String str) {
		
		if(current == n) {
			System.out.println(str);
			return;
		}
		if(current > n)
			return;
		
		climbingStairs(n, current + 1, str + "1 ");
		climbingStairs(n, current + 2, str + "2 ");
		climbingStairs(n, current + 3, str + "3 ");
	}
	
	public static void climbingStairs2(int n, int current, String str) {
		
		if(current == n) {
			System.out.println(str);
			return;
		}
		if(current > n)
			return;
		
		for(int step = 1; step <= 3; step++)
			climbingStairs2(n, current + step, str + step + " ");
	}
	
//	wrong code
	public static void climbingStairs3(int[] arr, int current, String str) {
		
		if(current == arr[current]) {
			System.out.println(str);
			return;
		}
		if(current > arr[current])
			return;
		
		for(int i = 0; i < arr.length; i++) {
			for(int step = 1; step <= arr[i]; step++) {
				climbingStairs3(arr, current + step, str + step + " ");
			}
		}
		
	}

	public static void mazeHVPath(int currRow, int currColumn, int endRow, int endColun, String answer) {
		
		if(currRow == endRow && currColumn == endColun) {
			System.out.println(answer);
			return;
		}
		
		if(currRow > endRow || currColumn > endColun) {
			return;
		}
		
//		mazeHVPath(currRow, currColumn + 1, endRow, endColun, answer + currRow + currColumn + " ");
//		mazeHVPath(currRow + 1, currColumn, endRow, endColun, answer + currRow + currColumn + " ");
		mazeHVPath(currRow, currColumn + 1, endRow, endColun, answer + "H");
		mazeHVPath(currRow + 1, currColumn, endRow, endColun, answer + "V");
	}
	
	public static void mazeHVDigonalPath(int currRow, int currColumn, int endRow, int endColun, String answer) {
		
		if(currRow == endRow && currColumn == endColun) {
			System.out.println(answer);
			return;
		}
		
		if(currRow > endRow || currColumn > endColun) {
			return;
		}
		
		mazeHVDigonalPath(currRow, currColumn + 1, endRow, endColun, answer + "H");
		mazeHVDigonalPath(currRow + 1, currColumn, endRow, endColun, answer + "V");
		mazeHVDigonalPath(currRow + 1, currColumn + 1, endRow, endColun, answer + "D");
	}
	
	public static void coinTossNoConsecutiveHead(int n, String answer, boolean falg) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		if(falg) // Last element was Head
		{
			coinTossNoConsecutiveHead(n - 1, answer + "T", false);
		}
		else // Last element was Tail
		{
			coinTossNoConsecutiveHead(n - 1, answer + "H", true);
			coinTossNoConsecutiveHead(n - 1, answer + "T", false);
		}
	}
	
	public static void coinTossNoConsecutiveHeadAndStartWithOnlyTail(int n, String answer, boolean falg) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		if(falg) // Last element was Head
		{
			coinTossNoConsecutiveHeadAndStartWithOnlyTail(n - 1, answer + "T", false);
		}
		else // Last element was Tail
		{
			coinTossNoConsecutiveHeadAndStartWithOnlyTail(n - 1, answer + "H", true);
			coinTossNoConsecutiveHeadAndStartWithOnlyTail(n - 1, answer + "T", false);
		}
	}

	public static void coinTossNoConsecutiveTail(int n, String answer, boolean falg) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		if(falg) // Last element was Head
		{
			coinTossNoConsecutiveTail(n - 1, answer + "H", false);
		}
		else // Last element was Tail
		{
			coinTossNoConsecutiveTail(n - 1, answer + "H", false);
			coinTossNoConsecutiveTail(n - 1, answer + "T", true);
		}
	}
	
	public static void coinTossNoConsecutiveTailAndStartWithOnlyHead(int n, String answer, boolean falg) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		if(falg) // Last element was Head
		{
			coinTossNoConsecutiveTailAndStartWithOnlyHead(n - 1, answer + "H", false);
		}
		else // Last element was Tail
		{
			coinTossNoConsecutiveTailAndStartWithOnlyHead(n - 1, answer + "H", false);
			coinTossNoConsecutiveTailAndStartWithOnlyHead(n - 1, answer + "T", true);
		}
		
	}
	
//	wrong code
	public static void coinTossNoConsecutiveHeadAndTail(int n, String answer, boolean falg) {
		
		if(n <= 0) {
			System.out.println(answer);
			return;
		}
		
		if(falg) // Last element was Head
		{
			coinTossNoConsecutiveHeadAndTail(n - 1, answer + "T", false);
		}
		else // Last element was Tail
		{
			coinTossNoConsecutiveHeadAndTail(n - 1, answer + "H", true);
//			coinTossNoConsecutiveHeadAndTail(n - 1, answer + "T", false);
		}
	}
	
	public static void lexicoCounting(int current, int nthNumber) {
		
		if(current > nthNumber)
			return;
		
		System.out.println(current);
		
		int i = 0;
		
		if(current == 0)
			i = 1;
		
		while(i <= 9) {
			
			lexicoCounting(current * 10 + i, nthNumber);
			i++;
		}
	}
	
	public static void lexicoCounting2(int current, int nthNumber) {
		
		if(current > nthNumber)
			return;
		
		System.out.println(current);
		
		int i = 0;
		
		if(current == 0)
			i = 1;
		
		while(i <= 9) {
			
			if(current * 10 + i <= nthNumber)
				lexicoCounting2(current * 10 + i, nthNumber);
			else
				break;
			
			i++;
		}
	}
	
	public static void jumpingNumberOrDiffrenceBW2NumberIs1(int current, int number) {
		
		if(current > number)
			return;
		
		System.out.println(current);
		
		if(current == 0) {
			
			for(int i = 1; i <= 9; i++)
				jumpingNumberOrDiffrenceBW2NumberIs1(i, number);	
		}
		else {
			
			int reminder = current % 10;
			
			if(reminder != 0)
				jumpingNumberOrDiffrenceBW2NumberIs1(current * 10 + (reminder - 1), number);
			
			if(reminder != 9 )
				jumpingNumberOrDiffrenceBW2NumberIs1(current * 10 + (reminder + 1), number);	
		}	
	}
	

	
	
	
	


}

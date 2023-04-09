package _6String;

//import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		String str2 = s.next();//from user
		printCharacterWise(str2);
		s.close();
		*/
		String str = "ara";
//		printCharacterWise(str);
		printSubstring(str);
//		
//		System.out.println(checkPalindrome("nitin"));
//		
//		reverseWord(str);
		
//		System.out.println(countPalindromeSubString("abaab"));
		
//		System.out.println(reverseSentence("Ashish Raj Kushwaha"));
		
//		System.out.println(oddLengthPalindromeSubString("abcbdbce"));
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(evenLengthPalindromeSubString("aabccb"));
//		long endTime = System.currentTimeMillis();
//		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
//		
	}
	
	public static void printCharacterWise(String str) {
		
		for(int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));
	}
	
	public static void printSubstring(String str) {
		
		for(int s = 0; s <str.length(); s++) {
			for(int e = s + 1; e <= str.length(); e++) {
				System.out.print(str.substring(s, e) + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean checkPalindrome(String str) {
		
		if(str.length() == 1)
			return false;
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			
			if(str.charAt(i++) != str.charAt(j--))
				return false;
		}
		return true;
	}
	
	public static int countPalindromeSubString(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				if(checkPalindrome(str.substring(i, j)))
					count++;
			}
			
		}
		return count;
	}
	
	public static String reverseSentence(String str) {
		
		int index = 0;
		String rev = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ' || i == str.length() - 1) {
				
				if(rev == "")
					rev += str.substring(index, i);
				else
					rev = str.substring(index, i) + " " + rev;
				
				index = i + 1;
			}
		}
		return rev;
		
	}
	
	public static int oddLengthPalindromeSubString(String str) {
		int count = 0;
		
		for(int axis = 0; axis < str.length(); axis++) {
			
			for(int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++ ) {
				
				int s = axis - orbit;
				int e = axis + orbit;
				if(str.charAt(s) == str.charAt(e)) {
					count++;
					if(s==e)
						System.out.println(str.charAt(s));
					else
						System.out.println(str.substring(s, e+1));
				}
				else
					break;
			}
		}
		return count;
	}
	
	public static int evenLengthPalindromeSubString(String str) {
		int count = 0;
		
		for(double axis = 0.5; axis < str.length(); axis++) {
			
			for(double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++ ) {
				
				int s = (int)(axis - orbit);
				int e = (int)(axis + orbit);
				if(str.charAt(s) == str.charAt(e)) {
					count++;
					if(s==e)
						System.out.println(str.charAt(s));
					else
						System.out.println(str.substring(s, e+1));
				}
				else
					break;
			}
		}
		return count;
	}
	
	public static void reverseWord(String str) {
		
		String str1 = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			str1 = str.charAt(i) + str1;
			System.out.println(str1);
		}
	}
	
	
	
	
	
	
	
}

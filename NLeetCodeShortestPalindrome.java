package _13LeetCode;

public class NLeetCodeShortestPalindrome {

	public static void main(String[] args) {
		
		System.out.println(shortestPalindrome("abaa"));		//aabaa
	}
	
	public static String shortestPalindrome(String str) {
		
		String reverseStr = new StringBuilder(str).reverse().toString();
		int length = str.length();
		
		for(int i = 0; i < length; i++) {
			if(reverseStr.substring(i).equals(str.substring(0, length - i))) {
				return reverseStr.substring(0, i) + str;
			}
		}
		return "";
	}
}

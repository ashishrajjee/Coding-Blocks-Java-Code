package _13LeetCode;

public class RLeetCodePalindromePartitioning {
	
	public static void main(String[] args) {
		
		palindromePartitions("nitin", "");
	}
	
	public static void palindromePartitions(String question, String answer) {
		
		if(question.length() ==0 ) {
			System.out.println(answer);
			return;
		}
		
		for(int i = 1; i <= question.length(); i++) {
			
			String part = question.substring(0, i);
			String restOfQuestion = question.substring(i);
			
			if(isPalindrome(part))
				palindromePartitions(restOfQuestion, answer + part + " ");
		}
	}
	
	public static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			
			if(str.charAt(i) != str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
}

package _30_ArrayQuestions;

public class _2_CountAndSay_LeetCode {

	public static void main(String[] args) {
		System.out.println(compress("abbc"));
		System.out.println(countAndSay(4));
	}
	
	public static String countAndSay(int n) {
		
		if(n == 1)
			return "1";
		
		String recursionResult = countAndSay(n - 1);
		return compress(recursionResult);

	}
	
	public static String compress(String str) {
		
		String ans = "";
		int count = 1;
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
			else {
				ans = ans + count + str.charAt(i);
				count = 1;
			}	
		}
		ans = ans + count + str.charAt(str.length() - 1);
		return ans;
	}
	
}

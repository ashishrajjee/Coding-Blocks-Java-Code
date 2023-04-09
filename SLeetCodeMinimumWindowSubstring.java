package _13LeetCode;

public class SLeetCodeMinimumWindowSubstring {

	public static void main(String[] args) {
		
		String str = "ADOBECODEBANC";
		String test = "ABC";
		
		System.out.println(MinimumWindowSubstring(str, test));
		
	}

	private static String MinimumWindowSubstring(String str, String test) {
		
		int[] freqStr = new int[256];
		int[] freqTest = new int[256];
		
		for(char c : test.toCharArray()) {
			freqTest[c]++;
		}
		int count = 0;
		int start = 0;
		int minLength = Integer.MAX_VALUE;
		int startIndex = -1;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freqStr[ch]++;
			if(freqStr[ch] <= freqTest[ch]) {
				count++;
			}
			if(count == test.length()) {
				while(freqStr[str.charAt(start)] > freqTest[str.charAt(start)] || freqTest[str.charAt(start)] == 0) {
					if(freqStr[str.charAt(start)] > freqTest[str.charAt(start)]) {
						freqStr[str.charAt(start)]--;
					}
					start++;
				}
				if(minLength > i - start + 1) {
					minLength = i - start + 1;
					startIndex = start;
				}
			}
		}
		if(startIndex == -1)
			return "";
		
		return str.substring(startIndex, startIndex+ minLength);
	}
	
}

package _13LeetCode;

public class ELeetCodeLetterTilePossibilities {

	public static void main(String[] args) {
		
		totalOccurringCharacterInAString("AAB");
		System.out.println(count - 1);  			//-1 because of one Space
	}
	
	static int count = 0;
	
	private static void totalOccurringCharacterInAString(String str) {
		
		int[] freq = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			freq[ch - 'A']++;
		}
		count = 0;
		printSequences(freq, "");
		totalNumberSequences(freq);
	}

	private static void printSequences(int[] freq, String answer) {
		
		if(!answer.isEmpty()) 		//use this because of one space
		System.out.println(answer);
		
		for(int i = 0; i < freq.length; i++) {
			
			if(freq[i] > 0) {
				freq[i]--;
				printSequences(freq, answer + (char)(i + 'A'));
				freq[i]++;
			}	
		}
	}
	
	private static void totalNumberSequences(int[] freq) {
		count++;
		
		for(int i = 0; i < freq.length; i++) {
			
			if(freq[i] > 0) {
				freq[i]--;
				totalNumberSequences(freq);
				freq[i]++;
			}	
		}
	}
	
}

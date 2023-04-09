package _28_HashMap;

import java.util.HashMap;

public class _3_FindHighestFrequencyCharacter {

	public static void main(String[] args) {
		
		String s = "abcaabcccdeac";
		char maxfreqChar = findMaxFreqChar(s);
		System.out.println(maxfreqChar);
		
	}
	
	public static char findMaxFreqChar(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
//			if(map.containsKey(ch)) {
//				int oldFrequency = map.get(ch);
//				int updatedfrequency = oldFrequency + 1;
//				map.put(ch, updatedfrequency);
//			}
//			else {
//				map.put(ch, 1);
//			}					//*****use this below method for shortcut
			int newValue = map.getOrDefault(ch, 0) + 1;
			map.put(ch, newValue);
		}
		int maxValue = 0;
		char maxFreqChar = ' ';
		for(char key : map.keySet()) {
			
			int value = map.get(key);
			if(value > maxValue) {
				maxValue = value;
				maxFreqChar = key;
			}
		}
		return maxFreqChar;
	}
}

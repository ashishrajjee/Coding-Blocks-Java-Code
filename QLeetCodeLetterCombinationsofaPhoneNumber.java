package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class QLeetCodeLetterCombinationsofaPhoneNumber {
	
	public static void main(String[] args) {
		printKeypad("852", "");
		System.out.println(printKeypad2("852"));
	}
	
	public static String getCode(char ch) {
		
		if(ch == '1')
			return "!?";
		else if(ch == '2')
			return "abc";
		else if(ch == '3')
			return "def";
		else if(ch == '4')
			return "ghi";
		else if(ch == '5')
			return "jkl";
		else if(ch == '6')
			return "mno";
		else if(ch == '7')
			return "pqrs";
		else if(ch == '8')
			return "tuv";
		else if(ch == '9')
			return "wxyz";
		else if(ch == '0')
			return "*#";
		else
			return "";
	}
	
	public static void printKeypad(String str, String answer) {
		
		if(str.length() <= 0) {
			System.out.println(answer);
			return;
		}
		
		char ch = str.charAt(0);
		String restOfCode = str.substring(1);
		String digitCode = getCode(ch);
		
		for(int i = 0; i < digitCode.length(); i++) {
			printKeypad(restOfCode, answer + digitCode.charAt(i));
		}
	}
	
	public static List<String> printKeypad2(String str) {
		
		List<String> list = new ArrayList<String>();
		
		if(str.length() == 0)
			return list;
		
		list.add("");
		
		for(int i = 0; i < str.length(); i++) {
			
			ArrayList<String> newlist = new ArrayList<String>();
			String digitCode = getCode(str.charAt(i));
			
			for(String ans : list) {
				for(int j = 0; j < digitCode.length(); j++)
					newlist.add(ans + digitCode.charAt(j));
			}
			list = newlist;
		}
		return list;
	}
}

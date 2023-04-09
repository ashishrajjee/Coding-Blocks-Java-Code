package _13LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PLeetCodeGenerateParentheses {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		validParenthesis(2, 0, 0, "", list);
		System.out.println(list);
	}
	
	public static void validParenthesis(int n, int open, int close, String answer, List<String> list) {
		
		//+ve base case
		if(open == n && close == n) {
			list.add(answer);
			return;
		}
		
		//-ve base case
		if(open > n || close > open)
			return;
		
		validParenthesis(n, open + 1, close, answer + "(", list);
		validParenthesis(n, open, close + 1, answer + ")", list);
	}

}

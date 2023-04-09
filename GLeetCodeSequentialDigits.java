package _13LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GLeetCodeSequentialDigits {

	public static void main(String[] args) {
		
		int low = 1000;
		int high = 13000;
		
//		for(int i = 1; i <= 9; i++)
//			printSequentialDigitsLowToHigh(i, low, high);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 9; i++ )
			addToListSequentialDigitsLowToHigh(i, low, high, list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}
	
	public static void printSequentialDigitsLowToHigh(int answer, int low, int high) {
		
		if(answer > high)
			return;
		
		if(low <= answer && answer <= high)
			System.out.println(answer);
		
		int lastDigit = answer % 10;
		
		if(lastDigit != 9)
			printSequentialDigitsLowToHigh(answer * 10 + (lastDigit + 1), low, high);	
	}

	public static void addToListSequentialDigitsLowToHigh(int answer, int low, int high, List<Integer> list) {
		
		if(answer > high)
			return;
		
		if(low <= answer && answer <= high)
			list.add(answer);
		
		int lastDigit = answer % 10;
		
		if(lastDigit != 9)
			addToListSequentialDigitsLowToHigh(answer * 10 + (lastDigit + 1), low, high, list);	
	}
}

package _27_Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class _12_GrayCode {

//	LeetCode
//	the gray code is a binary number system where two successive value differ in only
//	one bit, Given an integer n representing the total number of bits in the code,
//	return any sequence of gray code, A gray code sequence must begin with 0.
//	example:- 	input n = 2(bit)
//				output  = [0,1,3,2]
//	explanation:-
//	00  -  0
//	01  -  1
//	11  -  3
//	10  -  2
	
	public static void main(String[] args) {
		List<Integer> result = grayCode(3);
		System.out.println(result);
	}
	
	public static List<Integer> grayCode(int n){
		
		if(n < 1) {
			return new ArrayList<>();
		}
		
		if(n == 1) {
			List<Integer> baseResult = new ArrayList<>();
			baseResult.add(0);
			baseResult.add(1);
			return baseResult;
		}
		List<Integer> smallResult = grayCode(n - 1);
		List<Integer> bigResult = new ArrayList<>();
		
		for(int val : smallResult)
			bigResult.add(val);
		
		int mult = (int) Math.pow(2, (n - 1));
		
		for(int i = smallResult.size() - 1; i >= 0; i--) {
			int val = smallResult.get(i);
			bigResult.add(val + mult);
		}
		return bigResult;
	}
	
}

package _13LeetCode;

import java.util.ArrayList;

public class ILeetCodePermutationSequence {

	public static void main(String[] args) {
		
		int n = 4;
		int k = 9;
		permutationsByARK(k, new boolean[n], "");
		System.out.println(abc);
		
		System.out.println(getPermutation(n, k));
		
	}
	
	static int count = 0;
	static String abc = "";
	
	//wrong way
	public static void permutationsByARK(int k, boolean[] isUsed, String str) {
		
		if(count >= k)
			return;
		
		if(isUsed.length == str.length()) {
			count++;
			System.out.println(count + ". " + str);
		}
		
		if(count == k && isUsed.length == str.length()) {
			abc = str;
			return;
		}
		
		for(int i = 0; i < isUsed.length; i++) {
			
			if(isUsed[i])
				continue;
			
			isUsed[i] = true;
			permutationsByARK(k, isUsed, str + (i + 1));
			isUsed[i] = false;
		}
	}
	
	public static String permutationsByMam(int n, int k, int[] fact, ArrayList<Integer> list, String answer) {
		
		if(n == 0)
			return answer;
		
		int groupMakeTillNow = k / fact[n - 1];
		
		if( k % fact[ n - 1] != 0)
			groupMakeTillNow++;
		
		int newK = k - (groupMakeTillNow - 1) * fact[n - 1];
		
		int val = list.remove(groupMakeTillNow);
		
		return permutationsByMam(n - 1, newK, fact, list, answer + val);
		
	}
	
	public static String getPermutation(int n, int k) {
		
		int[] fact = new int[n];
		fact[0] = 1;
		
		for(int i = 1; i < fact.length; i++) {
			fact[i] = fact[i - 1] * i;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i <= n; i++)
			list.add(i);
		
		return permutationsByMam(n, k, fact, list, "");
	}
	
}

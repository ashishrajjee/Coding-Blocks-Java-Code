package _5PrimeNumbers;

import java.util.ArrayList;

import java.util.Arrays;

public class primeNumber {
	
	public static void main(String[] args) {
		
		System.out.println(findPrimeNumbers(10));
		
		prime_No_BestApproach_Seive_of_Eratosthenes_SOE(10);
		
		
	}
	
	public static ArrayList<Integer> findPrimeNumbers(int x) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 2; i <= x; i++) {
			
			boolean b = true;
			
			for(int j = 2; j * j <= i; j++) {
			//for(int j = 2; j <= Math.sqrt(i); j++) {
			//for(int j = 2; j <= i / 2; j++) {
				
				if(i % j == 0)
					b = false;
			}
			
			if(b)
				ans.add(i);
		}

		return ans;
	}
	
	public static void prime_No_BestApproach_Seive_of_Eratosthenes_SOE(int n) {
		
		boolean[] prime = new boolean[n + 1];
		
		Arrays.fill(prime, true);
		
		prime[0] = false;
		prime[1] = false;
		
		for(int table = 2; table * table <= n; table++) {
			
			if(prime[table] == false)
				continue;
			
			for(int multiply = 2; table * multiply <= n; multiply++)
				prime[table * multiply] = false;
		}
		
		for(int i = 0; i < prime.length; i++)
			if(prime[i])
				System.out.print(i + " ");
	}
	
	
	
}

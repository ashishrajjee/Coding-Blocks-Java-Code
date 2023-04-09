package _13LeetCode;

public class DLeetCodeCombinationSum4 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		System.out.println(coinChangeUserRespect(new int[] {1,2,3}, 32));	
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
	}
	
	public static int coinChangeUserRespect(int[] coins, int amount) {
		
		if(amount == 0) {	
			return 1;
		}
		
		int res = 0;
		for(int i = 0; i < coins.length; i++) {
			
			if(amount >= coins[i]) {
				res += coinChangeUserRespect(coins, amount - coins[i]);	
			}
			else
				continue;
		}
		return res;
	}
	
}

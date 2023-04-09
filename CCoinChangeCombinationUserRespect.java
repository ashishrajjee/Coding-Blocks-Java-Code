package _12BackTracking;

public class CCoinChangeCombinationUserRespect {

	public static void main(String[] args) {
		
		coinChange(new int[] {2,3,5,6}, 10, "", 0);
	}
	
	public static void coinChange(int[] coins, int amount, String answer, int lastCoinIndexUsed) {
		
		if(amount == 0) {
			System.out.println(answer);
			return;
		}
		
		for(int i = lastCoinIndexUsed; i < coins.length; i++) {
			
			if(amount >= coins[i])
				coinChange(coins, amount - coins[i], answer + coins[i], i);	
		}
	}
}

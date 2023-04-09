package _12BackTracking;

public class MCoinChangOneCoinUseOneTimeUserRespect {
	
	public static void main(String[] args) {
		
		coinChange(new int[] {2,3,6,7}, 7, "", 0);
	}
	
	public static void coinChange(int[] coins, int amount, String answer, int lastCoinIndexUsed) {
		
		if(amount == 0) {
			System.out.println(answer);
			return;
		}
		
		for(int i = lastCoinIndexUsed; i < coins.length; i++) {
			
			if(amount >= coins[i])
				coinChange(coins, amount - coins[i], answer + coins[i], i + 1);	//change i to i + 1 for one coin use one time
		}
	}
}

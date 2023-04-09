package _12BackTracking;
import java.util.Arrays;

public class OCoinChangOneCoinUseOneTimeUserRespectPrintWithoutDuplication {
	
	public static void main(String[] args) {
		int[] arr = {2,2,2,3,4};
		Arrays.sort(arr);
		coinChange(arr, 6, "", 0);
	}
	
	public static void coinChange(int[] coins, int amount, String answer, int lastCoinIndexUsed) {
		
		if(amount == 0) {
			System.out.println(answer);
			return;
		}
		
//		if(amount < 0)	//comment line 20,21 and use line number 28
//			return;
		
		for(int i = lastCoinIndexUsed; i < coins.length; i++) {
			
			if(i > lastCoinIndexUsed && coins[i] == coins[i - 1])	//use this for remove duplicate
				continue;
			
			if(amount >= coins[i])    // comment this and use line number 20,21
				coinChange(coins, amount - coins[i], answer + coins[i], i + 1);	//change i to i + 1 for one coin use one time
		}
	}
}

package _12BackTracking;
import java.util.Arrays;

public class PCoinChangeOneCoinUseOneTimeCoinRespectPrintWithoutDuplication {
	
	public static void main(String[] args) {
		
		int[] arr = {2,2,2,3,4};
		Arrays.sort(arr);
		coinChangeCoinRespect(arr, 0, 6, "", true);
		
	}
																				//use flag for check duplication
	private static void coinChangeCoinRespect(int[] coins, int coinIndex, int totalAmount, String answer, boolean flag) {
		
		if(totalAmount == 0) {
			System.out.println(answer);
			return;
		}
		
		if(totalAmount < 0 || coinIndex >= coins.length)
			return;
		
		if(flag == false && coins[coinIndex] == coins[coinIndex - 1]) {	// check duplication value
//			no
			coinChangeCoinRespect(coins, coinIndex + 1, totalAmount, answer, false);	
		}
		else {
//			yes			change CoinIndex to coinIndex + 1 for one coin use one time
			coinChangeCoinRespect(coins, coinIndex + 1, totalAmount - coins[coinIndex], answer + coins[coinIndex], true);
//			no
			coinChangeCoinRespect(coins, coinIndex + 1, totalAmount, answer, false);	
		}
	}
}

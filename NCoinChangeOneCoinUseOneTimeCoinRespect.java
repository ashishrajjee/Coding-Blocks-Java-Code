package _12BackTracking;

public class NCoinChangeOneCoinUseOneTimeCoinRespect {
	
	public static void main(String[] args) {
		
		coinChangeCoinRespect(new int[] {1,2,3}, 0, 3, "");
		
	}

	private static void coinChangeCoinRespect(int[] coins, int coinIndex, int totalAmount, String answer) {
		
		if(totalAmount == 0) {
			System.out.println(answer);
			return;
		}
		
		if(totalAmount < 0 || coinIndex >= coins.length)
			return;
//		yes			change CoinIndex to coinIndex + 1 for one coin use one time
		coinChangeCoinRespect(coins, coinIndex + 1, totalAmount - coins[coinIndex], answer + coins[coinIndex]);
//		no
		coinChangeCoinRespect(coins, coinIndex + 1, totalAmount, answer);	
	}
}

package _12BackTracking;

public class FCoinChangeCoinRespect {

	public static void main(String[] args) {
		
		coinChangeCoinRespect(new int[] {2,3,5,6}, 0, 10, "");
		
	}

	private static void coinChangeCoinRespect(int[] coins, int coinIndex, int totalAmount, String answer) {
		
		if(totalAmount == 0) {
			System.out.println(answer);
			return;
		}
		
		if(totalAmount < 0 || coinIndex >= coins.length)
			return;
//		yes
		coinChangeCoinRespect(coins, coinIndex, totalAmount - coins[coinIndex], answer + coins[coinIndex]);
//		no
		coinChangeCoinRespect(coins, coinIndex + 1, totalAmount, answer);	
	}
}

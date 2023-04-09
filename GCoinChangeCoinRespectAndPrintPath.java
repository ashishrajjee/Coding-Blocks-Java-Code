package _12BackTracking;

public class GCoinChangeCoinRespectAndPrintPath {

	public static void main(String[] args) {
		
		coinChangeCoinRespect(new int[] {2,3,5,6}, 0, 10, "", "");
		
	}

	private static void coinChangeCoinRespect(int[] coins, int coinIndex, int totalAmount, String answer, String path ) {
		
		if(totalAmount == 0) {
			System.out.println(answer + " Path " + path);
			return;
		}
		
		if(totalAmount < 0 || coinIndex >= coins.length)
			return;
//		yes
		coinChangeCoinRespect(coins, coinIndex, totalAmount - coins[coinIndex], answer + coins[coinIndex], path + coinIndex);
//		no
		coinChangeCoinRespect(coins, coinIndex + 1, totalAmount, answer, path);
		
		
	}
	
}
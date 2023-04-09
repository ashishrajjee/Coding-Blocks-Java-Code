package _12BackTracking;

public class DCoinChangePermuntation {

	static int count = 0;
	public static void main(String[] args) {
		
		coinChangepermuntation(new int[] {2,3,5,6}, 10, "");
	}
	
	public static void coinChangepermuntation(int[] coins, int amount, String answer) {
		
		if(amount == 0) {
			count++;
			System.out.println(count + ". " + answer);
			return;
		}
		
//		if(amount < 0)
//			return;
		
		for(int i = 0; i < coins.length; i++) {
			if(amount >= coins[i])
				coinChangepermuntation(coins, amount - coins[i], answer + coins[i]);	
		}
	}
	
}

package _10Mislinous;

public class PrintSub {

	public static void main(String[] args) {
		sub(3, 0, "");
	}
	
	public static void sub(int n, int k, String answer) {
		
		if(k == n) {
			System.out.println(answer);
			return;
		}
		if(k > n)
			return;
		
		for(int i = 1; i <= n; i++) {
			sub(n, k + i, answer + i + " ");
		}
	}
}

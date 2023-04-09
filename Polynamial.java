package _8TimeComplexity;

public class Polynamial {
	public static void main(String[] args) {
		
		int x = 3, n = 7;
		System.out.println(polynomialRecursion(x, n));
		System.out.println(polynomialWhileLoop(x, n));
		System.out.println(polynomialBestApproach(x, n));
		System.out.println(polynomialBestApproach2(x, n));
	}
	
	static int i = 1;
	public static int polynomialRecursion(int x, int n) {
		
		if( n <= 1)
			return i*x*n;
		
		return  i++ * (int)Math.pow(x, n) + polynomialRecursion(x, n-1);
	}
	
	public static int polynomialWhileLoop(int x, int n) {
		
		int j = 1;
		int ans = 0;
		while(n  >= 1) {
			ans += j++ * (int)Math.pow(x, n--);
		}
		return ans;
	}
	
	public static int polynomialBestApproach(int x, int n) {
		
		int pow =  1 * (int)Math.pow(x, n);
		int ans = 0;
		int i = 1;
		
		while(n != 0) {
			
			ans = ans + i++ * pow;
			pow = pow / x;
			n--;
		}
		return ans;
	}
	
	public static int polynomialBestApproach2(int x, int n) {
		
		int ans = 0;
		
		int multiply = x;
		
		while(n != 0) {
			
			ans += n * multiply;
			n--;
			multiply = multiply * x;
		}
		return ans;
	}
	
	
	
	
}

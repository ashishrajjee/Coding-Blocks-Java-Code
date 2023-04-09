package _10Mislinous;

public class FindAllPairsofGCDandLCM {
	
	public static void main(String[] args) {
		
		System.out.println("Total Pair Of GCD and LCM = " + countPairsofGCDandLCM(2, 12));
		
	}
	
	public static int countPairsofGCDandLCM(int g, int l) {
		 int count = 0;
		 int multiplyofGCDandLCM = g * l;
		 
		 for(int i = 1; i <= l; i++ ) {
			 
			 int secondNo = multiplyofGCDandLCM / i;
			 
			 if(multiplyofGCDandLCM % i == 0 && findGCD(secondNo, i) == g) {
				 count++;
				 System.out.println(i + " " + secondNo);
			 }
		 }
		
		return count;
	}
	
	public static int findGCD(int a, int b) {
		
		while(a % b != 0) {
			
			int rem = a % b;
			a = b;
			b = rem;
		}
		return b;
	}
}

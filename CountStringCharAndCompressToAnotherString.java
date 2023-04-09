package _10Mislinous;

public class CountStringCharAndCompressToAnotherString {

	public static void main(String[] args) {
		System.out.println(compress("abbc"));
	}
	
	public static String compress(String str) {
		
		String ans = "";
		int count = 1;
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
			else {
				ans = ans + str.charAt(i) + count;
				count = 1;
			}	
		}
		ans = ans + str.charAt(str.length() - 1) + count;
		return ans;
	}
		
}

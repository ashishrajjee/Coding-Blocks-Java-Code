package _10Mislinous;

public class Max_Frequency_Character {
	public static void main(String[] args) {
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.currentTimeMillis();
		System.out.println(max_Char_Captial_Letter("TANU"));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
		startTime = System.currentTimeMillis();
		System.out.println(max_Char_Small_Letter("ashish"));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
		startTime = System.currentTimeMillis();
		System.out.println(max_Char_All_in_One("aBcDeFgHiJkLmNoPqRsTuVwXyZaBcDeFgHiJkLmNoPqRsTuVwXyZy"));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
		
		
	}
	public static char max_Char_Captial_Letter(String str) {
		
		int[] arr = new int [26];
		
		int max = 1;
		
		char c = ' ';
		
		for(int i = 0; i < str.length(); i++) {

			arr[str.charAt(i) - 65]++;
			if(max < arr[str.charAt(i) - 65] ) {
				max = arr[str.charAt(i) - 65];
				c = str.charAt(i);
			}
		}
		return c;
	}
	public static char max_Char_Small_Letter(String str) {
	
		int[] arr = new int [26];
	
		int max = 0;
	
		char c = ' ';
	
		for(int i = 0; i < str.length(); i++) {
			
			arr[str.charAt(i) - 97]++;
			if(max < arr[str.charAt(i) - 97] ){
				max = arr[str.charAt(i) - 97];
				c = str.charAt(i);
			}
		}
		return c;
	}
	
	public static char max_Char_All_in_One(String str) {
		int[] arr = new int[256];
		
		int max = 0;
		
		char c = ' ';
		
		for(int i = 0; i < str.length(); i++) {

			arr[str.charAt(i)]++;
			if(max < arr[str.charAt(i)] ) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		return c;
	}
	
	
}




public class PrintAllWordsWhichHaveCharacter_i {

	public static void main(String[] args) {
		
		String str = "This is Place beautiful";
	
		printAllWordsWhichHaveCharacter_i(str, 'i');
	
	}
	
	public static void printAllWordsWhichHaveCharacter_i(String str, char c) {
		
		int startIndex = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ' && findCharacter(str, c, startIndex, i)){
				System.out.println(str.substring(startIndex, i));
				startIndex = i + 1;
			}
		}
	}

	private static boolean findCharacter(String str, char c, int startIndex, int lastIndex) {
		
		while(startIndex < lastIndex) {
			if(str.charAt(startIndex) == c)
				return true;
			startIndex++;
		}
		return false;
	}
	
	public static void printAllWordsWhichHaveCharacter_i2(String str, char c) {
		
		int startIndex = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ' && findCharacter(str, c, startIndex, i)){
				System.out.println(str.substring(startIndex, i));
				startIndex = i + 1;
			}
		}
	}
}

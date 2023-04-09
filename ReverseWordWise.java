
package _6String;

public class ReverseWordWise {

	public static void main(String[] args) {
		
		String str = "The Sky Is Blue";
		System.out.println(str);
		reverseWord(str);
		System.out.println();
		reverseWord2(str);
	}
	
	public static void reverseWord(String str) {
		
		String[] str1 = str.split(" ");
		
		for(int i = str1.length - 1; i >= 0; i--) {
			
//			if(i != 0)
				System.out.print(str1[i] + " ");
//			else
//				System.out.print(str1[i]);
		}
	}
	
	public static void reverseWord2(String str) {
		
		String answer = "";
		String word = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				word += str.charAt(i);
			}
			
			else if(answer.equals("")) {
				answer = word + answer;
				word = "";
			}
			
			else {
				answer = word + " " + answer;
				word = "";
			}
		}
		System.out.println(word + " " + answer);
	}
	
	public static void printWordThatHaveACharacter(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
		}
		
	}
}

import java.util.Scanner;
public class CodeVita_StringAndSubSet {

	public static void main(String[] args) {
		
//		Scanner s= new Scanner(System.in);
//      	int n = s.nextInt();
//      	int rank = s.nextInt();
//      	String str= s.nextLine();
//      	int len = str.length();
//      	
//      	System.out.println(output(rank, str, len));
//      	s.close();
      	
      	printSubSequence("abc","");
	}

	private static String output(int rank, String str, int len) {
		
		if(len <= 0) {
			return null;
		}
		
		for(int i = 0; i <= len; i++) {
			
			if(i == 0 || str.charAt(i) == ',' || len == i) {
				
				
				
			}
		}
		return null;
	}
	
	public static void printSubSequence(String str, String answer) {
		
		if(str.length() <= 0) {
			System.out.println(answer);
			return;
		}
		char ch = str.charAt(0);					// a
		String restOfCode = str.substring(1);		// bc
		printSubSequence(restOfCode, answer);		// (bc, "")
		printSubSequence(restOfCode, answer + ch);	// ((bc, a ) <--("" + a)) 
	}

}

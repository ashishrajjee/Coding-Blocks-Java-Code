package _10Mislinous;

public class PrintSubStringWithSpace {

	public static void main(String[] args) {
		String str = "ABC";
		printSubStringWithSpace(str.substring(1), "" + str.charAt(0));
//		printSubStringWithSpace("BC", "A");
	}
	
	public static void printSubStringWithSpace(String question, String answer) {
		
//		if(question.isEmpty()) {
//			System.out.println(answer);
//			return;
//		}
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		printSubStringWithSpace(question.substring(1), answer + question.charAt(0));	   //Without Space
		printSubStringWithSpace(question.substring(1), answer + " " + question.charAt(0)); //With Space	
	}
}


public class RemoveDuplicateInString {
	
	public static void main(String[] args) {
		
		String str = "asdccwddwcwaa";
		
		removeDubpicate(str.substring(1), str.substring(0, 1));
	}

	private static void removeDubpicate(String question, String answer) {
		
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		char lastCharFromAnswer = answer.charAt(answer.length()-1);
		char firstCharFromQuestion = question.charAt(0);
		
		if(lastCharFromAnswer == firstCharFromQuestion)
			removeDubpicate(question.substring(1), answer);
		else
			removeDubpicate(question.substring(1), answer + firstCharFromQuestion);
	}
	
}

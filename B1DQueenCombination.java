package _12BackTracking;

public class B1DQueenCombination {

	static int count = 0;
	
	public static void main(String[] args) {
		
		oneDQueenCombination(new boolean[4], 0, 2, "", -1);
		
	}
	
	public static void oneDQueenCombination(boolean[] box, int queenPlaced, int totalQueen, String answer, int lastBoxUsed) {
		
		if(queenPlaced == totalQueen) {
			count++;
			System.out.println(count + ". " + answer);
			return;
		}
		
		for(int i = lastBoxUsed + 1; i < box.length; i++) {
			
//			if(box[i] == false) {	//not need
				
				box[i] = true;
				oneDQueenCombination(box, queenPlaced + 1, totalQueen, answer + "q" + queenPlaced + "b" + i, i);
				box[i] = false; // undo (this is called backtracking)
				
//			}
		}	
	}

}

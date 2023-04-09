package _12BackTracking;

public class A1DQueenPermutation {
	
	static int count = 0;

	public static void main(String[] args) {
		
		oneDQueenPermutation(new boolean[4], 0, 2, "");
		
	}
	
	public static void oneDQueenPermutation(boolean[] box, int queenPlaced, int totalQueen, String answer) {
		
		if(queenPlaced == totalQueen) {
			count++;
			System.out.println(count + ". " + answer);
			return;
		}
		
		for(int i = 0; i < box.length; i++) {
			
			if(box[i] == false) {
				
				box[i] = true;
				oneDQueenPermutation(box, queenPlaced + 1, totalQueen, answer + "q" + queenPlaced + "b" + i);
				box[i] = false; // undo (this is called backtracking)
				
			}
		}	
	}
}

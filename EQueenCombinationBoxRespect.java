package _12BackTracking;

public class EQueenCombinationBoxRespect {

	static int count = 0;
	public static void main(String[] args) {
		
		queenCombinationPlacedRespectToBox(new boolean[4], 0, 0, 2, "");
		
	}
	
	public static void queenCombinationPlacedRespectToBox(boolean[] box, int boxIndex, int placedQueen, int totalQueen, String answer) {
		
		if(placedQueen == totalQueen) {
			count++;
			System.out.println(count + ". " + answer);
			return;
		}
		
		if(boxIndex >= box.length)
			return;
		
//		Placed Queen	
		box[boxIndex] = true;
		queenCombinationPlacedRespectToBox(box, boxIndex + 1, placedQueen + 1, totalQueen, answer + "b" + boxIndex);
		box[boxIndex] = false;
		
//		not Placed Queen	
		queenCombinationPlacedRespectToBox(box, boxIndex + 1, placedQueen, totalQueen, answer);
		
	}
}

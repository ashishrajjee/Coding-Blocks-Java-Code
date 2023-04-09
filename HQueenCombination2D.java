package _12BackTracking;

public class HQueenCombination2D {

	public static void main(String[] args) {
		
		queenCombination2D(new boolean[2][2], 0, 0, 0, 2, "");
		
		queenCombination2DExtraRecursiveCall2ndMethod(new boolean[2][2], 0, 0, 0, 2, "");
	
	}
	
	public static void queenCombination2D(boolean box[][], int row, int column, int queenPlaced, int totalQueen, String answer) {
		
//		positive base case
		if(queenPlaced == totalQueen) {
			System.out.println(answer);
			return;
		}
		
//		manually change row and columns
		if(column >= box[0].length) {
			row++;
			column = 0;
		}
		
//		negative base case
		if(row >= box.length) {
			return;
		}
		
		box[row][column] = true;
		queenCombination2D(box, row, column + 1, queenPlaced + 1, totalQueen, answer + "{" + row +"-"+ column + "}");
		box[row][column] = false;
		
		queenCombination2D(box, row, column + 1, queenPlaced, totalQueen, answer);	
	}
	
	public static void queenCombination2DExtraRecursiveCall2ndMethod(boolean box[][], int row, int column, int queenPlaced, int totalQueen, String answer) {
		
//		positive base case
		if(queenPlaced == totalQueen) {
			System.out.println(answer);
			return;
		}
		
//		Extra Recursive Call
		if(column >= box[0].length) {
			queenCombination2DExtraRecursiveCall2ndMethod(box, row + 1, 0, queenPlaced, totalQueen, answer);
			return;
		}
		
//		negative base case
		if(row >= box.length) {
			return;
		}
		
		box[row][column] = true;
		queenCombination2DExtraRecursiveCall2ndMethod(box, row, column + 1, queenPlaced + 1, totalQueen, answer + "{" + row +"-"+ column + "}");
		box[row][column] = false;
		
		queenCombination2DExtraRecursiveCall2ndMethod(box, row, column + 1, queenPlaced, totalQueen, answer);	
	}
}

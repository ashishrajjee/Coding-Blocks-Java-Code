package _12BackTracking;

public class IQueenCombination2DKillLikeChess {
	
	public static void main(String[] args) {
		
		queenCombination2DPrintAllQueenWithoutKillingEachOtherLikeChess(new boolean[4][4], 0, 0, 0, 4, "");
		
	}

	public static void queenCombination2DPrintAllQueenWithoutKillingEachOtherLikeChess(boolean box[][], int row, int column, int placedQueen, int totalQueen, String answer){
		
//		Positive Base Case
		if(placedQueen == totalQueen) {
			System.out.println(answer);
			return;
		}
		
//		Manually Change Row
		if(column >= box[0].length) {
			queenCombination2DPrintAllQueenWithoutKillingEachOtherLikeChess(box, row + 1, 0, placedQueen, totalQueen, answer);
			return;
		}
		
//		Negative Base Case
		if(row >= box.length) {
			return;
		}
		
		if(isSafeForPalceQueen(box, row, column)) {
			
			box[row][column] = true;
			queenCombination2DPrintAllQueenWithoutKillingEachOtherLikeChess(box, row, column + 1, placedQueen + 1, totalQueen, answer + "{" + row + "-" + column + "}");
			box[row][column] = false;
			
		}
		queenCombination2DPrintAllQueenWithoutKillingEachOtherLikeChess(box, row, column + 1, placedQueen, totalQueen, answer);
	}

	private static boolean isSafeForPalceQueen(boolean[][] box, int row, int column) {
		
//		Check Vertically Upward Direction
		int r = row - 1;
		int c = column;
		
		while(r >= 0) {
			if(box[r][c])
				return false;
			r--;
		}
		
//		Check Horizontally Left Direction
		r = row;
		c = column - 1;
		while(c >= 0) {
			if(box[r][c])
				return false;
			c--;
		}
		
//		Check Diagonally Left Direction
		r = row - 1;
		c = column - 1;
		while(r >= 0 && c >= 0) {
			if(box[r][c])
				return false;
			r--;
			c--;
		}
		
//		Check Diagonally Right Direction
		r = row - 1;
		c = column + 1;
		while(r >= 0 && c < box[0].length) {
			if(box[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}
}
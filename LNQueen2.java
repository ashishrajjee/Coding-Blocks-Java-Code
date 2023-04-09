package _12BackTracking;

public class LNQueen2 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		nQueen2RespectToRow(new boolean[4][4], 0, 0, 4, "");
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time " + (endTime - startTime) + " Mili Second");
		
		diffrentQueenPlaced2RespectToRow(new boolean[4][4], 0, 0, 3, "");
		
	}
	
	static int count = 0;
	public static void nQueen2RespectToRow(boolean box[][], int row, int placedQueen, int totalQueen, String answer){
		
		if(placedQueen == totalQueen) {
			System.out.println(++count + ". " + answer);
			return;
		}
		
		if(row >= box.length)
			return;
		
		for(int column = 0; column < box[0].length; column++) {
			if(isSafeForPalceQueen(box, row, column)) {
				box[row][column] = true;
				nQueen2RespectToRow(box, row + 1, placedQueen + 1, totalQueen, answer + "{" + row + "-" + column + "}");
				box[row][column] = false;
			}
		}
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

	static int count1 = 0;
	public static void diffrentQueenPlaced2RespectToRow(boolean box[][], int row, int placedQueen, int totalQueen, String answer){
		
		if(placedQueen == totalQueen) {
			System.out.println(++count1 + ". " + answer);
			return;
		}
		
		if(row >= box.length)
			return;
		
//		Option : Placed
		
		for(int column = 0; column < box[0].length; column++) {
			if(isSafeForPalceQueen(box, row, column)) {
				box[row][column] = true;
				diffrentQueenPlaced2RespectToRow(box, row + 1, placedQueen + 1, totalQueen, answer + "{" + row + "-" + column + "}");
				box[row][column] = false;
			}
		}
		
//		Not Placed
		diffrentQueenPlaced2RespectToRow(box, row + 1, placedQueen, totalQueen, answer);
	}
}

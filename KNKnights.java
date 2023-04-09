package _12BackTracking;

public class KNKnights {

	public static void main(String[] args) {
		
		nKnights(new boolean [3][3], 0, 0, 0, 3, "");
		
	}
	static int count = 0;
	public static void nKnights(boolean box[][], int row, int column, int placedKnight, int totalKnights, String answer) {
		
		if(placedKnight == totalKnights) {
			System.out.println(++count + ". " +answer);
			return;
		}
		
		if(column >= box[0].length) {
			nKnights(box, row + 1, 0, placedKnight, totalKnights, answer);
			return;
		}
		
		if(row >= box.length)
			return;
		
		if(isPlacedKnights5(box, row, column)) {
			box[row][column] = true;
			nKnights(box, row, column + 1, placedKnight + 1, totalKnights, answer + "{" + row + "-" + column + "}");
			box[row][column] = false;
		}
		
		nKnights(box, row, column + 1, placedKnight, totalKnights, answer);	
	}

	private static boolean isPlacedKnights(boolean[][] box, int row, int column) {

//		up right
		int r = row - 2;
		int c = column + 1;
		if(r >= 0 && c < box[0].length && box[r][c] == true)
			return false;
		
//		up left
		r = row - 2;
		c = column - 1;
		if(r >= 0 && c >= 0 && box[r][c] == true)
			return false;
		
//		left up
		r = row - 1;
		c = column - 2;
		if(r >= 0 && c >= 0 && box[r][c] == true)
			return false;
		
//		left down
		r = row + 1;
		c = column - 2;
		if(r < box.length && c >= 0 && box[r][c] == true)
			return false;
		
//		down left
		r = row + 2;
		c = column - 1;
		if(r < box.length && c >= 0 && box[r][c] == true)
			return false;
		
//		down right
		r = row + 2;
		c = column + 1;
		if(r < box.length && c < box[0].length && box[r][c] == true)
			return false;
		
//		right up
		r = row - 1;
		c = column + 2;
		if(r >= 0 && c < box[0].length && box[r][c] == true)
			return false;
		
//		right down
		r = row + 1;
		c = column + 2;
		if(r < box.length && c < box[0].length && box[r][c] == true)
			return false;
		
		return true;
	}
	
	private static boolean isPlacedKnights2(boolean[][] box, int row, int column) {


		int r = row;
		int c = column;
//		up right
		if(r - 2 >= 0 && c + 1 < box[0].length && box[r - 2][c + 1] == true)
			return false;
		
//		up left
		if(r - 2 >= 0 && c  - 1>= 0 && box[r - 2][c - 1] == true)
			return false;
		
//		left up
		if(r - 1 >= 0 && c - 2 >= 0 && box[r - 1][c - 2] == true)
			return false;
		
//		left down
		if(r  + 1 < box.length && c - 2 >= 0 && box[r + 1][c - 2] == true)
			return false;
		
//		down left
		if(r + 2 < box.length && c - 1 >= 0 && box[r + 2][c - 1] == true)
			return false;
		
//		down right
		if(r + 2 < box.length && c + 1 < box[0].length && box[r + 2][c + 1] == true)
			return false;
		
//		right up
		if(r - 1 >= 0 && c + 2 < box[0].length && box[r - 1][c + 2] == true)
			return false;
		
//		right down
		if(r + 1 < box.length && c + 2 < box[0].length && box[r + 1][c + 2] == true)
			return false;
		
		return true;
	}
	
	private static boolean isPlacedKnights3(boolean[][] box, int row, int column) {


		int r = row;
		int c = column;
		
		if(
				(r - 2 >= 0 && c + 1 < box[0].length && box[r - 2][c + 1] == true)
				|| (r - 2 >= 0 && c  - 1>= 0 && box[r - 2][c - 1] == true)
				|| (r - 1 >= 0 && c - 2 >= 0 && box[r - 1][c - 2] == true)
				|| (r  + 1 < box.length && c - 2 >= 0 && box[r + 1][c - 2] == true)
				|| (r + 2 < box.length && c - 1 >= 0 && box[r + 2][c - 1] == true)
				|| (r + 2 < box.length && c + 1 < box[0].length && box[r + 2][c + 1] == true)
				|| (r - 1 >= 0 && c + 2 < box[0].length && box[r - 1][c + 2] == true)
				|| (r + 1 < box.length && c + 2 < box[0].length && box[r + 1][c + 2] == true)
			)
			return false;
		
		return true;
	}

//	good
	private static boolean isPlacedKnights4(boolean[][] box, int row, int column) {

//		up right
		int r = row - 2;
		int c = column + 1;
		if(r >= 0 && c < box[0].length && box[r][c] == true)
			return false;
		
//		up left
		r = row - 2;
		c = column - 1;
		if(r >= 0 && c >= 0 && box[r][c] == true)
			return false;
		
//		left up
		r = row - 1;
		c = column - 2;
		if(r >= 0 && c >= 0 && box[r][c] == true)
			return false;

		
//		right up
		r = row - 1;
		c = column + 2;
		if(r >= 0 && c < box[0].length && box[r][c] == true)
			return false;
		
		return true;
	}

//	Best
	private static boolean isPlacedKnights5(boolean[][] box, int row, int column) {
		
		int[] rowArray = { -1, -2, -2, -1 };
		int[] columnArray = { 2, 1, -1, -2 };
		
		for(int i = 0; i < 4; i++) {
			
			int r = row + rowArray[i];
			int c = column + columnArray[i];
			
			if( r >= 0 && r < box.length && c >= 0 && c < box[0].length)
				if(box[r][c])
					return false;
		}
		
		return true;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

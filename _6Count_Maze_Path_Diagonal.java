package _15Recursion_Count_Board_Maze_H_V_Path;

public class _6Count_Maze_Path_Diagonal {
	
	public static void main(String[] args) {
		System.out.println(printMazePathHorizontalAndVirtical(0, 0, 2, 2));
	}
	
	
	public static int printMazePathHorizontalAndVirtical(int sRow, int sCol, int eRow, int eCol) {
		
		if(sRow == eRow && sCol == eCol) {
			return 1;
		}
		
		if(sRow > eRow || sCol > eCol) {
			return 0;
		}
		
		int cH = printMazePathHorizontalAndVirtical(sRow, sCol + 1, eRow, eCol);
		int cV = printMazePathHorizontalAndVirtical(sRow + 1, sCol, eRow, eCol);
		int cD = printMazePathHorizontalAndVirtical(sRow + 1, sCol + 1, eRow, eCol);
		
		return cH + cV + cD;
	}

}

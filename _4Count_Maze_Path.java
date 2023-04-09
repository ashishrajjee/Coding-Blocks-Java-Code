package _15Recursion_Count_Board_Maze_H_V_Path;

public class _4Count_Maze_Path {
	
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
		
		int ch = printMazePathHorizontalAndVirtical(sRow, sCol + 1, eRow, eCol);
		int cv = printMazePathHorizontalAndVirtical(sRow + 1, sCol, eRow, eCol);
		
		return ch + cv;
	}

}

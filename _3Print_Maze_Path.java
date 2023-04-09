package _15Recursion_Count_Board_Maze_H_V_Path;

public class _3Print_Maze_Path {
	
	public static void main(String[] args) {
		printMazePathHorizontalAndVirtical(0, 0, 2, 2, "");
	}
	
	
	public static void printMazePathHorizontalAndVirtical(int sRow, int sCol, int eRow, int eCol, String answer) {
		
		if(sRow == eRow && sCol == eCol) {
			System.out.println(answer);
			return;
		}
		
		if(sRow > eRow || sCol > eCol) {
			return;
		}
		
		printMazePathHorizontalAndVirtical(sRow, sCol + 1, eRow, eCol, answer + "H");
		printMazePathHorizontalAndVirtical(sRow + 1, sCol, eRow, eCol, answer + "V");
	}
	
}

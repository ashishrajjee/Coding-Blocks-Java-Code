package _12BackTracking;

public class BlockedMaze {

	public static void main(String[] args) {
		int[][] maze = { {0,1,0,0}, {0,0,0,0}, {0,1,0,0}, {0,0,1,0} };
		blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
	}
	
	public static void blockedMaze(int[][] maze, int row, int column, String answer, boolean[][] visited) {
		
//		Positive Base Case
		if(row == maze.length - 1 && column == maze[0].length - 1) {
			System.out.println(answer);
			return;
		}
		
//		Negative Base Case
		if(row < 0 || row >= maze.length || column < 0 || column >= maze[0].length || maze[row][column] == 1 || visited[row][column] == true)
			return;
		
//		if you visited then mark true
		visited[row][column] = true;
		
//		Top turn
		blockedMaze(maze, row - 1, column, answer + "T", visited);
//		Down turn
		blockedMaze(maze, row + 1, column, answer + "D", visited);
//		Left turn
		blockedMaze(maze, row, column - 1, answer + "L", visited);
//		Right turn
		blockedMaze(maze, row, column + 1, answer + "R", visited);
		
//		undo visited mark
		visited[row][column] = false;
	}
}

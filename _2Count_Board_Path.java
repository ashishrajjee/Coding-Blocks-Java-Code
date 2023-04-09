package _15Recursion_Count_Board_Maze_H_V_Path;

public class _2Count_Board_Path {

	public static void main(String[] args) {
		
		System.out.println(countBoardPath(0, 10));
	}
	
	public static int countBoardPath(int start, int end) {
		
		if(start == end)
			return 1;
		
		int count = 0;
		
		for(int dice = 1; dice <= 6; dice++) {
			
			if(start + dice > end)
				break;
			
			 count += countBoardPath(start + dice, end);
		}
		return count;
	}
	
}

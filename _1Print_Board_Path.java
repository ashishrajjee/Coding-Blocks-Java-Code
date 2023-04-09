package _15Recursion_Count_Board_Maze_H_V_Path;

public class _1Print_Board_Path {
	
	public static void main(String[] args) {
		printBoardPath(0, 20, "");
	}
	
	static int count = 0;
	public static void printBoardPath(int start, int end, String ans) {
		
		if(start == end) {
			System.out.println(++count + ". " + ans);
			return;
		}
		
//		if( start > end)
//			return;
		
		for(int dice = 1; dice <= 6; dice++) {
			
			if(start + dice > end)
				return;//break;
			printBoardPath(start + dice, end, ans + dice);
		}
	}
	
}

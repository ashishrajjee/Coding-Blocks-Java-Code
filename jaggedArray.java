package _4Array2D;

import java.util.Scanner;

public class jaggedArray {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int[][] arr = takeinput();
		//print(arr);
		int[][] arr = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {9, 8, 7, 6, 4}, {5, 4, 3, 2, 6}, {2, 7, 5, 1, 9}};
		System.out.println("\tMatrix");
		print2(arr);
		System.out.println("\tWAVE PRINT");
		wavePrint(arr);
		System.out.println("\tMatrix");
		print2(arr);
		System.out.println("\tSPIRAL PRINT");
		spiralPrint(arr);
		System.out.println();
		int[][] one = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] two = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
		System.out.println("\tArray 1");
		print(one);
		System.out.println("\tArray 2");
		print(two);
		System.out.println(" matricMultiplication of 2 array");
		print(matricMultiplication(one, two));
		
	}
	
	public static int[][] takeinput(){
		
		System.out.println("Enter Number of Rows ?");
		int sizeOfRows = s.nextInt();
		
		int arr[][] = new int[sizeOfRows][];
		
		for(int r = 0; r < arr.length; r++) {
			System.out.println("Enter Number of Columns for " + r + " Rows ?");
			int columns = s.nextInt();
			arr[r] = new int[columns];
			System.out.println("Enter " + columns + " Value for Column");
			for(int c = 0; c < arr[r].length; c++) {
				arr[r][c] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void print(int[][] arr) {
		for(int[] rowAddress : arr) {
			for(int columnValue : rowAddress) {
				System.out.print(columnValue + " ");
			}
			System.out.println();
		}
	}
	
	public static void print2(int[][] arr) {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public static void wavePrint(int arr[][]) {
		for(int c = 0; c < arr[0].length; c++) {
			
			if(c % 2 == 0) {
				for(int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			}
			else {
				for(int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void spiralPrint(int arr[][]) {
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		
		int totalNoOfElement = arr.length * arr[0].length;
		int count = 0;
		while(count < totalNoOfElement)//if on this then on all where this word present
		//while(minCol <= maxCol || minRow <= maxRow)
		//while(minCol <= maxCol && minRow <= maxRow)
		{
			//for(int changeStartRow = minRow; changeStartRow <= maxRow; changeStartRow++ ) {
				//System.out.print(arr[changeStartRow][minCol] + " ");
			for(int changeStartRow = minRow; changeStartRow <= maxRow && count < totalNoOfElement; changeStartRow++ ) {
				System.out.print(arr[changeStartRow][minCol] + " ");
				count++;
			}
			minCol++;
			if(count < totalNoOfElement)
				System.out.println();
			//for(int changeLastCol = minCol; changeLastCol <= maxCol; changeLastCol++ ) {
				//System.out.print(arr[maxRow][changeLastCol] + " ");
			for(int changeLastCol = minCol; changeLastCol <= maxCol && count < totalNoOfElement; changeLastCol++ ) {
				System.out.print(arr[maxRow][changeLastCol] + " ");
				count++;
			}
			maxRow--;
			if(count < totalNoOfElement)
				System.out.println();
			//for(int changeLastRow = maxRow; changeLastRow >= minRow; changeLastRow--) {
				//System.out.print(arr[changeLastRow][maxCol] + " ");
			for(int changeLastRow = maxRow; changeLastRow >= minRow && count < totalNoOfElement; changeLastRow--) {
				System.out.print(arr[changeLastRow][maxCol] + " ");
				count++;
			}
			maxCol--;
			if(count < totalNoOfElement)
				System.out.println();
			//for(int changeStartCol = maxCol; changeStartCol >= minCol; changeStartCol--) {
				//System.out.print(arr[minRow][changeStartCol] + " ");
			for(int changeStartCol = maxCol; changeStartCol >= minCol && count < totalNoOfElement; changeStartCol--) {
				System.out.print(arr[minRow][changeStartCol] + " ");
				count++;
			}
			minRow++;
			if(count < totalNoOfElement)
				System.out.println();
		}
	}
	
	public static int[][] matricMultiplication(int[][] one, int[][] two){
		int r1 = one.length;
		int c1 = one[0].length;
		
		//int r2 = two.length;
		int c2 = two[0].length;
		
		int[][] ans = new int[r1][c2];
		
		for(int r = 0; r < ans.length; r++) {
			for(int c = 0; c < ans[r].length; c++) {
				int sum = 0;
				for(int k = 0; k < c1; k++) {
					sum += one[r][k] * two[k][c];//in one column change and in two row change
				}
				ans[r][c] = sum;
			}
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
}

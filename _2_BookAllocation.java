package _31_BinarySearchQuestion;

import java.util.Scanner;

public class _2_BookAllocation {

//	https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//	numberOfBooks = 4
//	numberOfStudents = 2
//	allBooksPage[] = {12, 34, 67, 90}
//	Output : 113
//		Explanation:
//			There are 2 number of students. Books can be distributed 
//			in following fashion : 
//			  1) [12] and [34, 67, 90]
//			      Max number of pages is allocated to student 
//			      '2' with 34 + 67 + 90 = 191 pages
//			  2) [12, 34] and [67, 90]
//			      Max number of pages is allocated to student
//			      '2' with 67 + 90 = 157 pages 
//			  3) [12, 34, 67] and [90]
//			      Max number of pages is allocated to student 
//			      '1' with 12 + 34 + 67 = 113 pages
//			Of the 3 cases, Option 3 has the minimum pages = 113. 
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int numberOfBooks = s.nextInt();				//4
		int numberOfStudents = s.nextInt();				//2
		int[] allBooksPage = new int[numberOfBooks];
		
		for(int i = 0; i < numberOfBooks; i++) {
			allBooksPage[i] = s.nextInt();				//12, 34, 67, 90
		}
//	binary search logic
		int low = 0;
		int high = 0;
		for(int value : allBooksPage)
			high = high + value;
		int finalAnswer = 0;
		while(low <= high) {
			
			int mid = (low + high) / 2;
			if(isItPossible(allBooksPage, numberOfStudents, mid)) {
				finalAnswer = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		System.out.println(finalAnswer);			//113
		s.close();
		
	}

	private static boolean isItPossible(int[] allBooksPage, int numberOfStudents, int mid) {
	
		int student = 1;
		int pageRead = 0;
		int bookIndex = 0;
		while(bookIndex < allBooksPage.length) {
			if(pageRead + allBooksPage[bookIndex] <= mid) {
				pageRead = pageRead + allBooksPage[bookIndex];
				bookIndex++;
			}
			else {
				student++;
				pageRead = 0;
				if(student > numberOfStudents)
					return false;
			}
		}
		return true;
	}
	
}

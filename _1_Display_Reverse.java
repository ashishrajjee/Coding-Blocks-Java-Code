package _23_Queue_Questions;

import java.util.ArrayDeque;
import java.util.Queue;

public class _1_Display_Reverse {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.print("Reverse ");
		displayReverse(q, 0);
		System.out.println();
		
		System.out.print("Original ");
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
	}
	
	public static void displayReverse(Queue<Integer> q, int count) {
		
		if(q.size() == count)
			return;
		
		int temp = q.remove();
		q.add(temp);
	
		displayReverse(q, count + 1);
		
		System.out.print(temp + " ");
		
	}
}

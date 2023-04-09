package _23_Queue_Questions;

import java.util.ArrayDeque;
import java.util.Queue;

public class _2_Actual_Reverse {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		actualReverseBest(q);
		
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}
		
	}
	
	public static void actualReverseBest(Queue<Integer> q) {
		
		if(q.isEmpty())
			return;
		
		int val = q.remove();
		
		actualReverseBest(q);
		
		q.add(val);
	}
	
}

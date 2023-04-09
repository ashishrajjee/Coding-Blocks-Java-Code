package _22Stack_Questions;

import java.util.Stack;

public class _9_MinStack_Class_Works_On_Inbuild_Stack {

	Stack<Integer> s = new Stack<>();
	int minimum;
	
	
	public void push(int item) {
		
		if(s.isEmpty()) {
			s.push(item);
			minimum = item;
		}
		// no encryption
		else if(item >= minimum) {
			s.push(item);
		}
		// encryption
		else {
			s.push((item * 2) - minimum);
			minimum = item;
		}
		
	}
	
	
	public int peek() {
		
		if(s.isEmpty()) {
			return s.peek();
		}
		// no encryption
		else if(s.peek() >= minimum) {
			return s.peek();
		}
		// encryption
		else {
			return minimum;
		}
		
	}
	

	public int pop() {
		
		if(s.isEmpty()) {
			return s.pop();
		}
		// no encryption
		else if(s.peek() >= minimum) {
			return s.pop();
		}
		// encryption
		else {
			int temp = minimum;
			int topValue = s.pop();
			minimum = (minimum * 2) - topValue;
			return temp;
		}
		
	}
	
	
	public int min() {
		
		if(s.isEmpty()) {
			System.out.println("no min value bcoz stack is Empty");
			return Integer.MIN_VALUE;
		}
		return minimum;
	}
	
}

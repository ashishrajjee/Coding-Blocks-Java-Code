package _22Stack_Questions;

import _21Dyanmic_Stack_and_Queue._1_Dynamic_Stack;

public class _7_MinStack_Class_Extend_DynamicStack extends _1_Dynamic_Stack {

	private int min;
	
	
	@Override
	public void push(int item) {
		
		if(isEmpty()) {
			super.push(item);
			min = item;
		}
		// no encryption
		else if(item >= min) {
			super.push(item);
		}
		// encryption
		else {
			super.push((item * 2) - min);
			min = item;
		}
		
	}
	
	
	@Override				// this is by me
	public int peek() {
		
		if(isEmpty()) {
			return super.peek();
		}
		// no encryption
		else if(super.peek() >= min) {
			return super.peek();
		}
		// encryption
		else {
			return min;
		}
		
	}
	
	
	@Override
	public int pop() {
		
		if(isEmpty()) {
			return super.pop();
		}
		// no encryption
		else if(super.peek() >= min) {
			return super.pop();
		}
		// encryption
		else {
			int temp = min;
			int topValue = super.pop();
			min = (min * 2) - topValue;
			return temp;
		}
		
	}
	
	
	public int min() {
		
		if(isEmpty()) {
			System.out.println("no min value bcoz stack is Empty");
			return Integer.MIN_VALUE;
		}
		return min;
	}
	
	
}

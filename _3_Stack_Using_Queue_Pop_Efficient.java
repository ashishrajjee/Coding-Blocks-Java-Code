package _25_Stack_Implementation;

import _21Dyanmic_Stack_and_Queue._3_Dynamic_Queue;

public class _3_Stack_Using_Queue_Pop_Efficient {

	_3_Dynamic_Queue primaryQueue = new _3_Dynamic_Queue();
	
//	T.C. = O(n)
	public void push(int item) throws Exception {
		try {
			_3_Dynamic_Queue helperQueue = new _3_Dynamic_Queue();
			helperQueue.enQueue(item);
			while(primaryQueue.size() != 0) {
				helperQueue.enQueue(primaryQueue.deQueue());
			}
			primaryQueue = helperQueue;
		}
		catch(Exception e) {
			throw new Exception("Stack is Full");
		}
	}
	
//	T.C. = O(1)
	public int pop() throws Exception {
		try {
			return primaryQueue.deQueue();
		}
		catch(Exception e) {
			throw new Exception("Stack is empty");
		}
	}
	
//	T.C. = O(1)
	public int peek() throws Exception {
		try {
			return primaryQueue.getFront();
		}
		catch(Exception e) {
			throw new Exception("Stack is empty");
		}
	}
	
//	T.C. = O(1)
	public int size() {
		return primaryQueue.size();
	}
	
//	T.C. = O(1)
	public boolean isEmpty() {
		return primaryQueue.isEmpty();
	}

//	T.C. = O(1)
	public boolean isFull() {
		return primaryQueue.isFull();
	}
	
//	T.C. = O(n)
	public void display() {
		primaryQueue.display();
	}
	
	
	
	
	
}

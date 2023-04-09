package _25_Stack_Implementation;

import _21Dyanmic_Stack_and_Queue._3_Dynamic_Queue;

public class _1_Stack_Using_Queue_Push_Efficient {

	_3_Dynamic_Queue primaryQueue = new _3_Dynamic_Queue();
	
//	T.C. = O(1)
	public void push(int item) throws Exception {
		try {
			primaryQueue.enQueue(item);
		}
		catch(Exception e) {
			throw new Exception("Stack is full");
		}
	}
	
//	T.C. = O(n)
	public int pop() throws Exception{
		try {
			_3_Dynamic_Queue helperQueue = new _3_Dynamic_Queue();
			while(primaryQueue.size() != 1) {
				helperQueue.enQueue(primaryQueue.deQueue());
			}
			int temp = primaryQueue.deQueue();
			primaryQueue = helperQueue;
			return temp;
		}
		catch(Exception e) {
			throw new Exception("Stack is empty");
		}
	}
	
//	T.C. = O(n)
	public int peek() throws Exception{
		try {
			_3_Dynamic_Queue helperQueue = new _3_Dynamic_Queue();
			while(primaryQueue.size() != 1) {
				helperQueue.enQueue(primaryQueue.deQueue());
			}
			int temp = primaryQueue.deQueue();
			helperQueue.enQueue(temp);
			primaryQueue = helperQueue;
			return temp;
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
	public void display() throws Exception {
		System.out.println("-----------------------");
		display(0);
		System.out.println();
		System.out.println("-----------------------");
	}

	private void display(int count) throws Exception {
		try {
			if(count == primaryQueue.size())
				return;
		
			int temp = primaryQueue.deQueue();
			primaryQueue.enQueue(temp);			//to maintain the order
			display(count + 1);
			System.out.print(temp + " ");		//print
		}
		catch(Exception e) {
			throw new Exception("Stack is Empty");
		}
	}

	
}

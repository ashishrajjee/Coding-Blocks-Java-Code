package _26_Queue_Implementation;

import _21Dyanmic_Stack_and_Queue._1_Dynamic_Stack;

public class _1_QueueUsingStack_enQueueEfficient {

	_1_Dynamic_Stack primaryStack = new _1_Dynamic_Stack();
	
//	T.C = O(1)
	public void enQueue(int item) {
		primaryStack.push(item);
	}

//	T.C = O(n)
	public int deQueue() {
		
		_1_Dynamic_Stack helperStack = new _1_Dynamic_Stack();
		
		while(primaryStack.size() != 1) {
			helperStack.push(primaryStack.pop());
		}
		int temp = primaryStack.pop();
		while(helperStack.size() != 0) {
			primaryStack.push(helperStack.pop());
		}
		return temp;
	}
	
//	T.C = O(n)
	public int getFront() {
		
		_1_Dynamic_Stack helperStack = new _1_Dynamic_Stack();
		
		while(primaryStack.size() != 1) {
			helperStack.push(primaryStack.pop());
		}
		int temp = primaryStack.pop();
		helperStack.push(temp);
		while(helperStack.size() != 0) {
			primaryStack.push(helperStack.pop());
		}
		return temp;
	}
	
//	T.C = O(1)
	public int size() {
		return primaryStack.size();
	}

//	T.C = O(1)
	public boolean isfull() {
		return primaryStack.isFull();
	}

//	T.C = O(1)
	public boolean isEmpty() {
		return primaryStack.isEmpty();
	}
	
//	T.C = O(n)
	public void display() {
		
		if(primaryStack.isEmpty()) {
			return;
		}
		
		int temp = primaryStack.pop();
		display();
		System.out.print(temp + " ");
		primaryStack.push(temp);
	}
	
	
	
	
	
	
	
}

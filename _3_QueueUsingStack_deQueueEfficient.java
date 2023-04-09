package _26_Queue_Implementation;

import _21Dyanmic_Stack_and_Queue._1_Dynamic_Stack;

public class _3_QueueUsingStack_deQueueEfficient {

	_1_Dynamic_Stack primaryStack = new _1_Dynamic_Stack();
	
//	T.C = O(n)
	public void enQueue(int item) {
		
		_1_Dynamic_Stack helperStack = new _1_Dynamic_Stack();
		
		while(primaryStack.size() != 0) {
			helperStack.push(primaryStack.pop());
		}
		helperStack.push(item);
		while(helperStack.size() != 0) {
			primaryStack.push(helperStack.pop());
		}	
	}
	
//	T.C = O(1)
	public int deQueue() {
		return primaryStack.pop();
	}
	
//	T.C = O(1)
	public int getFront() {
		return primaryStack.peek();
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
		primaryStack.display();
	}
	
	
	
	
}

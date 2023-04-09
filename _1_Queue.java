package _19Queue;

public class _1_Queue {
		
	
	// Exception handled by mam
	// Exception handled by mam
	// Exception handled by mam
	
	
	protected int[] data;
	protected int front;
	protected int size;
	
	public _1_Queue() {
		
		data = new int[5];
		front = 0;
		size = 0;
	}
	
	public _1_Queue(int cap) {
		
		data = new int[cap];
		front = 0;
		size = 0;
	}
	
	public void enQueue(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		
		int index = (front + size) % data.length;	//(use this for circular data) index out of bound so start from 0th index
		data[index] = item;
		size++;
	}
	
	public int deQueue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;	//(use this for circular data) index out of bound so start from 0th index
		size--;
		return temp;
	}
	
	public boolean isFull(){
		return data.length == size();
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public int size() {
		return size;
	}
	
	public int getFront() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		return data[front];
	}
	
	public void display() {
		
		for(int i = 0; i < size; i++) {
			
			int index = (i + front) % data.length;
			System.out.print(data[index] + " ");
		}
		System.out.println();
		
		// use upper one or below
		
//		for(int i = front; i < size; i++) {
//			System.out.print(data[i] + " ");
//		}
//		
//		int i = 0;
//		while(data[i] != data[front]) {
//			System.out.print(data[i] + " ");
//			i++;
//		}
//		System.out.println();
	}
	
}

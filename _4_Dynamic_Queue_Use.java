package _21Dyanmic_Stack_and_Queue;

public class _4_Dynamic_Queue_Use {

	public static void main(String[] args) throws Exception {
		
		System.out.println("this below works by Mam\n");
		
		_3_Dynamic_Queue dq = new _3_Dynamic_Queue();
		dq.enQueue(10);
		dq.enQueue(20);
		dq.enQueue(30);
		dq.enQueue(40);
		dq.enQueue(50);
		
		dq.deQueue();
		dq.deQueue();
		
		dq.enQueue(60);
		dq.enQueue(70);
		dq.enQueue(80);
		dq.enQueue(90);
		
		dq.display();
		
		
		
		
//		System.out.println("\nthis below works by me\n");
//		
//		_3_Dynamic_Queue dq = new _3_Dynamic_Queue();
//		
//		dq.enQueue(1);
//		dq.enQueue(2);
//		dq.enQueue(3);
//		dq.enQueue(4);
//		dq.enQueue(5);
//		
//		dq.display();		//1 2 3 4 5 
//
//		System.out.println("delete " + dq.deQueue());//delete 1
//		System.out.println("delete " + dq.deQueue());//delete 2
//		
//		dq.display();		//3 4 5 
//		
//		dq.enQueue(6);
//		dq.enQueue(7);
//		
//		dq.display();		//3 4 5 6 7 
//		
//		System.out.println("size " + dq.size());			//size 5
//		System.out.println("queue is Full " + dq.isFull());	//queue is Full true
//		System.out.println("queue is Empty " + dq.isEmpty());//queue is Empty false
//		System.out.println("front " + dq.getFront());		//front 3
//		
//		dq.enQueue(8); 	// this line throw Exception in Queue class, now it is resolved in Dynamic Queue
//		
//		System.out.println("delete " + dq.deQueue());//delete 3
//		System.out.println("delete " + dq.deQueue());//delete 4
//		System.out.println("delete " + dq.deQueue());//delete 5
//		System.out.println("delete " + dq.deQueue());//delete 6
//		System.out.println("delete " + dq.deQueue());//delete 7
//		
//		System.out.println("front " + dq.getFront());//front 8
//		System.out.println("delete " + dq.deQueue());//delete 8	// Exception Queue is Empty
//		
//		dq.display();//no any item in queue, so nothing print
//		
//		System.out.println("size " + dq.size());	//size 0
//		System.out.println("queue is Full " + dq.isFull());//queue is Full false
//		System.out.println("queue is Empty " + dq.isEmpty());//queue is Empty true

	}
	
}

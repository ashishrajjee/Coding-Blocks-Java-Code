package _19Queue;

public class _1_Queue_Use {

	public static void main(String[] args) throws Exception{
		
		_1_Queue q = new _1_Queue(5);
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		q.display();

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		q.display();
		
		q.enQueue(6);
		q.enQueue(7);
		
		q.display();
		
		System.out.println("size " + q.size());
		System.out.println("queue is Full " + q.isFull());
		System.out.println("queue is Empty " + q.isEmpty());
		System.out.println("front " + q.getFront());
//		q.enQueue(8); 							// Exception Queue is Full
		
		System.out.println("delete " + q.deQueue());
		System.out.println("delete " + q.deQueue());
		System.out.println("delete " + q.deQueue());
		System.out.println("delete " + q.deQueue());
		System.out.println("delete " + q.deQueue());
		
//		System.out.println(q.deQueue());		// Exception Queue is Empty
		
		q.display();
		
		System.out.println("size " + q.size());
		System.out.println("queue is Full " + q.isFull());
		System.out.println("queue is Empty " + q.isEmpty());
		
		
		
		
		
		
	}
}

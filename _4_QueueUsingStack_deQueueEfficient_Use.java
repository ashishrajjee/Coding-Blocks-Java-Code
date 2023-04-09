package _26_Queue_Implementation;

public class _4_QueueUsingStack_deQueueEfficient_Use {

	public static void main(String[] args) {
		
		_3_QueueUsingStack_deQueueEfficient q = new _3_QueueUsingStack_deQueueEfficient();
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		
		q.display();

		System.out.println(q.deQueue());
		q.display();
		
		
	}
}

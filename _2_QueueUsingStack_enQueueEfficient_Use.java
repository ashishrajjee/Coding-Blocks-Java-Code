package _26_Queue_Implementation;

public class _2_QueueUsingStack_enQueueEfficient_Use {

	public static void main(String[] args) {
		
		_1_QueueUsingStack_enQueueEfficient q = new _1_QueueUsingStack_enQueueEfficient();
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		
		q.display();
		System.out.println();
		System.out.println(q.deQueue());
		q.display();
		
	}
}

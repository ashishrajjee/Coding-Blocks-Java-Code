package _24_LinkedList;

public class LinkedListUse {

	public static void main(String[] args) throws Exception {
		
		LinkedList head = new LinkedList();
		
		head.addfirst(10);
		head.addfirst(20);
		head.addLast(30);
		head.display();
		
		head.addLast(40);
		head.display();
		head.addLast(50);
		head.display();
		head.addAtindex(2, 60);
		head.display();
		System.out.println(head.getFirst());
		System.out.println(head.getLast());
		System.out.println(head.getValueAtIndex(3));
		
		System.out.println(head.removeFirst());
		head.display();
		head.addLast(70);
		head.display();
		System.out.println(head.removeLast());
		head.addfirst(80);
		head.display();
		System.out.println(head.removeAtIndex(2));
		head.display();
		
		head.reverse1();
		head.display();
		head.reverse2();
		head.display();
		head.reverse3();
		head.display();
		head.reverse4();
		head.display();
		head.reverse5();
		head.display();
		
		head.addLast(90);
		head.display();
		System.out.println(head.findMidPoint());
		
		System.out.println(head.findKthFromLast(8));
		
		head.createDubleLL();
		head.display();
		head.kReverse(3);
		head.display();
		
		head.createDummyDubleLLAndDetectLoop();
		head.circularLLPrint();
		
	}
}

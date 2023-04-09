package _18Stack;

public class _2_Stack_Use {

	public static void main(String[] args) {
		
//		_1_Stack s1 = new _1_Stack();
		
		_1_Stack s2 = new _1_Stack(5);
		
		s2.push(10);
		s2.push(20);
		s2.push(30);
		s2.push(40);
		s2.push(50);
		
		s2.display();
		System.out.println(s2.isEmpty());
		System.out.println(s2.isFull());
		
		System.out.println(s2.peek());
		System.out.println(s2.size());
		
		System.out.println(s2.pop());
		System.out.println(s2.size());
		
		
		
		_1_Stack s3 = new _1_Stack(0);
		
		s3.display();
		System.out.println(s3.peek());
		System.out.println(s3.pop());
		s3.push(1);
		s3.push(2);
		s3.push(3);
		s3.push(4);
		s3.push(5);
		s3.display();
//		s3.push(6);
		System.out.println(s3.pop());
		System.out.println(s3.pop());
		s3.display();
		System.out.println(s3.pop());
		System.out.println(s3.pop());
		s3.display();
		System.out.println(s3.pop());
		s3.display();
		System.out.println(s3.pop());
		s3.display();
		
	}
}

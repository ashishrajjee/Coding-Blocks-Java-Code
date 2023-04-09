package _25_Stack_Implementation;

public class _4_Stack_Using_Queue_Pop_Efficient_Use {

	public static void main(String[] args) throws Exception {
		
		_3_Stack_Using_Queue_Pop_Efficient s = new _3_Stack_Using_Queue_Pop_Efficient();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.display();
		
		System.out.println(s.pop());
		s.display();
	}
}

package _21Dyanmic_Stack_and_Queue;

public class _2_Dynamic_Stack_Use {

	public static void main(String[] args) {
		
//		_1_Stack ds = new _1_Dyanmic_Stack();
		
	//	use upper or below, both are works fine
		
		_1_Dynamic_Stack ds = new _1_Dynamic_Stack();
		
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		
		ds.display(); 						//50 40 30 20 10
		
		System.out.println(ds.size());		// 5
		System.out.println(ds.isFull());	//true - means stack ka size full ho gya hai
		System.out.println(ds.isEmpty());	//false - means khali nhi hai means item hai stack me
		System.out.println(ds.peek());		//50 - means sabse upper value koun sa hai
		System.out.println(ds.pop());		//50 - means sabse upper wali value delete kar do
		
		ds.push(60);
		ds.push(70);
		ds.push(80);
		
		ds.display();						//80 70 60 40 30 20 10
		
		System.out.println(ds.size());		// 7
		System.out.println(ds.isFull());	//false - means stack ka size full nhi hai
		System.out.println(ds.isEmpty());	//false - means khali nhi hai means item hai stack me
		System.out.println(ds.peek());		//80 - means sabse upper value koun sa hai
		System.out.println(ds.pop());		//80 - means sabse upper wali value delete kar do
		
		
		
	}
}

package _22Stack_Questions;

import _21Dyanmic_Stack_and_Queue._1_Dynamic_Stack;

public class _1_Display_in_Reverse_Order {

	public static void main(String[] args) {
		
		_1_Dynamic_Stack ds = new _1_Dynamic_Stack();
		
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.print("Original Stack = ");	//Original Stack = 
		ds.display();							//50 40 30 20 10
		System.out.print("Reverse Stack  = ");	//Reverse Stack  = 
		displayReverse(ds);						//10 20 30 40 50
		System.out.println();					//
		System.out.print("Original Stack = ");	//Original Stack = 
		ds.display();							//50 40 30 20 10 
		
	}
	
	public static void displayReverse(_1_Dynamic_Stack ds) {
		
		if(ds.isEmpty())
			return;
		
		int data = ds.pop();
		displayReverse(ds);
		System.out.print(data + " ");
		ds.push(data);
	}
	
	
}

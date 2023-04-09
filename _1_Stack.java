package _18Stack;

public class _1_Stack {
	
	
	// Exception handled by me
	// Exception handled by me
	// Exception handled by me
	
	
	protected int[] data;
	protected int tos; 		//tos = top of stack
	
	public _1_Stack() {
		
		data = new int[5];
		tos = -1;
	}
	
	public _1_Stack(int size) {
		
		try {
			if(size < 1) {
				data = new int[5];
				tos = -1;
				throw new Exception("Size of Stack can't be Zero or Negative\nSo, we can create by defult size of 5 Stack");
			}
			data = new int[size];
			tos = -1;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void push(int item) {
		
		try {
//			if(isFull()) {				//use this one or below if
			if(tos == data.length) {
//				throw new Exception("Stack Size Full so, We can't add element");
				throw new Exception();
			}
			tos++;
			data[tos] = item;
		}
		catch(Exception e) {
//			System.out.println(e.getMessage());//Index 5 out of bounds for length 5
			System.out.println("Stack Size Full. so, We can't add element");
		}
	}
	
	public int pop() {
		
		try {
			if(tos < 0) {
				throw new Exception("Stack is Empty. So, We can't Delete");
			}
			int temp = data[tos];
			data[tos] = 0;
			tos--;
			return temp;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public int peek() {
		
		try {
			if(tos < 0) {
				throw new Exception("Stack is Empty. So, no any Value on peek");
			}
			return data[tos];
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public int size() {
		
		return tos + 1;
	}
	
	public boolean isEmpty() {
		
		return size() == 0;
		
//		if(tos == -1)
//			return true;
//		else
//			return false;
	}
	
	public boolean isFull() {
		return data.length == size();
	}
	
	public void display() {
		
		try {
			if(tos < 0) {
				throw new Exception("No any Value in Stack");
			}
			for(int i = tos; i >= 0; i--) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

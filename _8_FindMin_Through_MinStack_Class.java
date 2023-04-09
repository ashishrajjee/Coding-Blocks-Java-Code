package _22Stack_Questions;

public class _8_FindMin_Through_MinStack_Class {

	public static void main(String[] args) {
		
		_7_MinStack_Class_Extend_DynamicStack min = new _7_MinStack_Class_Extend_DynamicStack();
		
		min.push(10);
		min.push(50);
		min.push(40);
		min.push(6);
		min.push(45);
		min.push(2);		
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
		System.out.println("minimum is " + min.min());
		System.out.println(min.peek());
		min.pop();
		
//		System.out.println(min.pop());
//		System.out.println(min.peek());
		
		System.out.println("minimum is " + min.min());
		
		
	}
	
	
}

package _22Stack_Questions;

public class _10_FindMin_throw_9_MinStack {

	public static void main(String[] args) {
		
		_9_MinStack_Class_Works_On_Inbuild_Stack min = new _9_MinStack_Class_Works_On_Inbuild_Stack();
		
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
		
		System.out.println("minimum is " + min.min());
		
		
	}
}

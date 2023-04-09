package _22Stack_Questions;

import java.util.Stack;

public class _4_Next_Greater_Element {

	//	50 30 20 40 10 45 5  60  8  15
	//	|  |  |  |  |  |  |   |  |   |      50 se next larger 60 se, 30 se next larger 40 hai and so on...
	//  60 40 40 45 45 60 60 -1  15 -1
	
	public static void main(String[] args) {
		
		int[] arr = {50, 30, 20, 40, 10, 45, 5, 60, 8, 15};
		
		nextLargerElemenet(arr);
		System.out.println();
		nextLargerElemenet2(arr);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		int[] newArr = nextLargerElemenetPrintInOrder(arr);
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
		
		System.out.println();
		
		int[] newArr2 = nextLargerElementPrintInOrder2(arr);
		
		for(int i = 0; i < newArr2.length; i++) {
			System.out.print(newArr2[i] + ", ");
		}
		
	}
	
	public static void nextLargerElemenet(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		// go to every element
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] want to be next greater
			while( !s.isEmpty() && arr[i] > s.peek()  ) {	//s.isEmpty() == false
				System.out.println(s.pop() + " -> " + arr[i]);
			}
			
			// push arr[i]
			s.push(arr[i]);
		}
		
		// if some values are left in stack, then next greater element is -1
		while( !s.isEmpty() ) {	//s.isEmpty() == false
			System.out.println(s.pop() + " -> -1");
		}
		
	}
	
	public static int[] nextLargerElemenetPrintInOrder(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		int[] newArr = new int[arr.length];
		
		// go to every element
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] is next greater ??
			while( !s.isEmpty() && arr[i] > arr[s.peek()]  ) {	//s.isEmpty() == false
				newArr[s.pop()] = arr[i];
			}
			
			// push index i
			s.push(i);
		}
		
		// if some values are left in stack, then next greater element is -1
		while( !s.isEmpty() ) {	//s.isEmpty() == false
			newArr[s.pop()] = -1;
		}
		
		return newArr;
		
	}
	
	public static void nextLargerElemenet2(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			while(!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				System.out.println(arr[i] + " -> -1");
			}
			else {
				System.out.println(arr[i] +" -> " + s.peek());
			}
			s.push(arr[i]);
		}
				
	}
	
	public static int[] nextLargerElementPrintInOrder2(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		int[] newArr = new int[arr.length];
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
//			while(!s.isEmpty() && s.peek() <= arr[i]) {
			while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {	
				s.pop();
			}
			
			if(s.isEmpty()) {
				newArr[i] = -1;
			}
			else {
//				newArr[i] = s.peek();
				newArr[i] = arr[s.peek()];
			}
//			s.push(arr[i]);
			s.push(i);
		}

		return newArr;
				
	}
	
	
}

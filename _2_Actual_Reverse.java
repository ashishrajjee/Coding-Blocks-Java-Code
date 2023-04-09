package _22Stack_Questions;

import _21Dyanmic_Stack_and_Queue._1_Dynamic_Stack;

public class _2_Actual_Reverse {

	public static void main(String[] args) {
		
		_1_Dynamic_Stack ds = new _1_Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		
		ds.display(); //50 40 30 20 10
		
		actualReverse(ds, new _1_Dynamic_Stack());
		
		ds.display(); //10 20 30 40 50
		
	}

	public static void actualReverse(_1_Dynamic_Stack ds, _1_Dynamic_Stack helper) {
		
		if(ds.isEmpty()) {
			actualReverseHelper(ds, helper);
			return;
		}

		int temp = ds.pop();
		helper.push(temp);
		
		actualReverse(ds, helper);
		
	}
	
	public static void actualReverseHelper(_1_Dynamic_Stack ds, _1_Dynamic_Stack helper) {
		
		if(helper.isEmpty())
			return;
		
		int temp = helper.pop();
		actualReverseHelper(ds, helper);
		ds.push(temp);
	}	
	
}

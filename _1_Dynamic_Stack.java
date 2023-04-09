package _21Dyanmic_Stack_and_Queue;

import _18Stack._1_Stack;

public class _1_Dynamic_Stack extends _1_Stack {

	
	@Override
	public void push(int item) {
		
		if(isFull()) {
			
		//	Create a new Array of Double Size
			int[] newData = new int[data.length * 2];
			
		//	Copy the old Values to new Array
			for(int i = tos; i >= 0; i--) {
				newData[i] = data[i];
			}
			
		//	refrence change
			data = newData;
		}
		super.push(item);
	}
	
}

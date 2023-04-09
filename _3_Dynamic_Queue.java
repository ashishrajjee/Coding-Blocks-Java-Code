package _21Dyanmic_Stack_and_Queue;

import _19Queue._1_Queue;

public class _3_Dynamic_Queue extends _1_Queue{

	@Override
	public void enQueue(int item) throws Exception {
		
		if(isFull()) {
			
			//Create a new Array of Double Size			
			int[] newData = new int[data.length * 2];
		
			//Copy the old Values to new Array
			for(int i = 0; i < size; i++) {
				
				int index = (i + front) % data.length;
				newData[i] = data[index];
			}
			//refrence change
			data = newData;
			//now front is 0th index
			front = 0;
		}
		super.enQueue(item);
	}
	
}

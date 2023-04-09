package _9ArrayList;

import java.util.ArrayList;

public class UseOfArrayListUnderArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(10);
		temp1.add(20);
		temp1.add(30);
		
		list.add(temp1);
		
		ArrayList<Integer> temp2 = new ArrayList<>();
		temp2.add(40);
		temp2.add(50);
		
		list.add(temp2);
		
		System.out.println(list);
		
//		list.add(100); // wrong way. if u want to add to list then use below method
		
		list.get(0).add(100);
		list.get(1).add(200);
		
		System.out.println(list);
		
	}

}

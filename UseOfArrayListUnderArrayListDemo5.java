package _9ArrayList;

import java.util.ArrayList;

public class UseOfArrayListUnderArrayListDemo5 {
	
	public static void main(String[] args) {
		
//		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//		
//		ArrayList<Integer> temp = new ArrayList<>();
//		
//		temp.add(10);
//		temp.add(20);
//		temp.add(30);
//		list.add(temp);
//		
//		temp = new ArrayList<>(temp); //this temp generated at new address
//		temp.add(40);
//		list.add(temp);
//		
//		System.out.println(list);
		
//		use upper technique or use short cut tricks in below
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		temp.add(10);
		temp.add(20);
		list.add(new ArrayList<>(temp));	//use this short cut method for generating new address
		
		temp.add(30);
		temp.add(40);
		list.add(new ArrayList<>(temp));	//use this short cut method for generating new address
		
		temp.add(50);
		list.add(new ArrayList<>(temp));	//use this short cut method for generating new address
		
		System.out.println(list);
			
	}	
}

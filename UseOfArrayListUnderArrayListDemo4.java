package _9ArrayList;

import java.util.ArrayList;

public class UseOfArrayListUnderArrayListDemo4 {
	
	public static void main(String[] args) {
		
//		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//				use upper this or below this both are same
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		
		ArrayList<Integer> t1 = new ArrayList<>();
		
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(40);
		
//		if u want to copy t1 value to another Arraylist then don't do below this
//		ArrayList<Integer> t2 = t1;
//		list.add(t1);					//t1 and t2 store same address
//		list.add(t2);					//so if u want to add in list t1 and t2
//		System.out.println(list);		//u add same address, so don't use this
		
//		if u want to copy t1 value to another Arraylist then use like this
		
//		ArrayList<Integer> t2 = new ArrayList<Integer>();
//		
//		for(int i = 0; i < t1.size(); i++) {
//			t2.add(t1.get(i));
//		}
//		
//		list.add(t1);	//both t1 and t2 store different address because of new keyword
//		list.add(t2);	//
//		
//		System.out.println(list);
		
//		Shot cut trick to store different address
		
//		ArrayList<Integer> t2 = new ArrayList<>(t1);
//					upper and below both are same
		ArrayList<Integer> t2 = new ArrayList<Integer>(t1);
		
		list.add(t1);
		list.add(t2);
		
		t2.add(100);
		
		System.out.println(list);
		
	}
}

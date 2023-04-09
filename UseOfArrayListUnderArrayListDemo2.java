package _9ArrayList;

import java.util.ArrayList;

public class UseOfArrayListUnderArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(10);
		temp.add(20);
		temp.add(30);
		list.add(temp);
		
		temp.add(40);
		temp.add(50);
		list.add(temp);
		
		temp.add(60);
		temp.add(70);
		list.add(temp);
		
		System.out.println(list);
		
		temp.add(80);
		list.add(temp);
		
		System.out.println(list);
		
		temp.remove(temp.size()-1);
		temp.remove(temp.size()-1);
		
		System.out.println(list);
		
		
	}

}

package _9ArrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//print
		System.out.println(arrayList);
		
		//find size/length of arraylist
		System.out.println(arrayList.size());
		
		//add element in arraylist
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		//again print
		System.out.println(arrayList);
		//again find size of arraylist
		System.out.println(arrayList.size());
		
		//element add at index arrayList.add(index, element);
		arrayList.add(1, 85);
		
		//now print arraylist
		System.out.println(arrayList);
		//now find size of arraylist
		System.out.println(arrayList.size());
		
		//element add on Existing element
		arrayList.add(3, 94);
		arrayList.add(arrayList.size(), 500);
		//now again print
		System.out.println(arrayList);
		//now again find size of arraylist
		System.out.println(arrayList.size());
		
		
		//get the value
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(arrayList.size() - 1));
		
		//for update ur arraylist throw set function --arrayList.set(index, element)
		arrayList.set(0, 85);
		arrayList.set(2, 94);
		System.out.println(arrayList);
//add use for add new value in arraylist & set use for override value to old value
		
		//remove use for delete element in arraylist
		arrayList.remove(1);
		System.out.println(arrayList.remove(1));
		System.out.println(arrayList);
		
		//print arraylist one by one
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		for(int value : arrayList) {
			System.out.print(value + " ");
		}
		
		
		
		
		
		
	}
}

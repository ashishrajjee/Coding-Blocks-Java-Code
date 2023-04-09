package _28_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class _1_HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
//	put	
		map.put("India", 10);
		map.put("US", 20);
		map.put("UK", 5);
		map.put("Aus", 3);
//	print map	
		System.out.println(map);					//{UK=5, US=20, Aus=3, India=10}	
//	get	
		System.out.println(map.get("Aus"));				//3
		System.out.println(map.get("China"));			//null
//	containsKey
		System.out.println(map.containsKey("China"));	//false
//	remove
		System.out.println(map.remove("US"));			//20
		System.out.println(map.remove("China"));		//null
//	print map
		System.out.println(map);					//{UK=5, Aus=3, India=10}
		
//*****************************************************************************
//	Set // set is a type of ArrayList, but Set can't contain duplicate value
//*****************************************************************************
//	Way 1	
//	map key store in Set
		Set<String> keys = map.keySet();
		System.out.println(keys);				//[UK, Aus, India]
		
		for(String key : keys)
			System.out.print(key + " ");		//UK Aus India
		System.out.println();
		for(String key : keys)
			System.out.print(key + " = " + map.get(key) + ", ");	//UK = 5, Aus = 3, India = 10,
		System.out.println();
//	Way 2	
		for(String key : map.keySet())
			System.out.print(key + " = " + map.get(key) + ", ");	//UK = 5, Aus = 3, India = 10,
		System.out.println();
//	Way 3
//	map key store in ArrayList
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);			//[UK, Aus, India]
		for(String key : list)
			System.out.print(key + " = " + map.get(key) + ", ");	//UK = 5, Aus = 3, India = 10,
		System.out.println();
		

		
		
		
		
	}
}

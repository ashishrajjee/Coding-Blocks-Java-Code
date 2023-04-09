package _28_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
 
  
public class _2_Set_Use {

	public static void main(String[] args) {
		
// creating LinkedHashSet using the Set  
        Set<String> data = new LinkedHashSet<String>();   
        data.add("JavaTpoint");   
        data.add("Set");   
        data.add("Example");   
        data.add("Set");   
        System.out.println(data);   
//*****************************************************************        
        Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
        System.out.println("Set1 " + set1);	//[33, 66, 34, 22, 55, 45, 77]
        System.out.println("Set2 " + set2);	//[33, 2, 83, 3, 55, 12, 45] 
// Finding Union of set1 and set2   
        Set<Integer> union_data = new HashSet<Integer>(set1);
//	addAll()
        union_data.addAll(set2);	//[33, 66, 34, 2, 83, 3, 22, 55, 12, 45, 77]
        System.out.println("Union:" + union_data);      
// Finding Intersection of set1 and set2    
        Set<Integer> intersection_data = new HashSet<Integer>(set1);
//	retainAll()
        intersection_data.retainAll(set2);	//[33, 55, 45]
        System.out.println("Intersection:" + intersection_data);   
// Finding Difference of set1 and set2    
        Set<Integer> difference_data = new HashSet<Integer>(set1); 
//	removeAll()
        difference_data.removeAll(set2);    //[66, 34, 22, 77]
        System.out.println("Difference:" + difference_data);  
//	addAll()
        Set<Integer> data1 = new LinkedHashSet<Integer>();   
        data1.add(31);   
        data1.add(21);
        System.out.println("Set: " + data1);  
        ArrayList<Integer> newData = new ArrayList<Integer>();   
        newData.add(91);   
        newData.add(71); 
        data1.addAll(newData);   
        System.out.println("Set: " + data1); 
//	contains()
        System.out.println("contains 91 - " + data1.contains(91));   //true
//	containsAll()
        Set<Integer> newData1 = new LinkedHashSet<Integer>();   
        newData1.add(31);   
        newData1.add(21);
        System.out.println("containsAll - "+ data1.containsAll(newData1));//true
//	hashCode()
        System.out.println("add total data = "+ data1.hashCode());//214
//	iterator()
        Iterator<Integer> newData2 = data1.iterator();
        while (newData2.hasNext()) {   
            System.out.print(newData2.next() + " ");   //31 21 91 71 
        }  
        System.out.println();
//	removeAll()
        data1.removeAll(newData1);  
        System.out.println("data after removing : " + data1);  //[91, 71]
//	add data to array  
        Object[] array_data = data1.toArray();   
        System.out.print("The array is: ");   
        for (int i = 0; i < array_data.length; i++)   
            System.out.print(array_data[i] + " ");    //91 71
		
	}
}

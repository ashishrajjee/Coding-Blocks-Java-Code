import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class _4_Frequency_Sort {

	public static void main(String[] args) {
		List<Integer> ans = new ArrayList<>();
		ans.add(10);
		ans.add(8);
		ans.add(5);
		ans.add(5);
		ans.add(5);
		ans.add(5);
		ans.add(1);
		ans.add(1);
		ans.add(1);
		ans.add(4);
		ans.add(4);
		itemsSort(ans);
		System.out.println(ans);
		
		
		
		
	}
	
	public static List<Integer> itemsSort(List<Integer> items) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int key : items) {
			int newValue = map.getOrDefault(key, 0) + 1;
			map.put(key, newValue);
		}
		
		Collections.sort(items, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2)
            {
                int freq1 = map.get(n1);
                int freq2 = map.get(n2);
                if (freq1 != freq2) {
                    return freq1 - freq2;
                }
                else {
                    return map.get(n1) - map.get(n2);
                }
            }
        });
		return items;
    }
}

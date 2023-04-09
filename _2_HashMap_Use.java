package _29_HashMap_Implementation;

public class _2_HashMap_Use {

	public static void main(String[] args) {
		
		_1_HashMap map = new _1_HashMap();
		
		map.put("A", 10);
		map.put("B", 30);
		map.put("C", 20);
		map.put("D", 80);
		map.put("E", 60);
		map.put("F", 1);
		map.put("G", 2);
		map.put("H", 3);
		map.put("I", 4);
		System.out.println(map);
		
		map.put("A", 177);
		System.out.println(map);
		
		System.out.println(map.get("B"));
		System.out.println(map.get("F"));
		
		System.out.println(map.containsKey("B"));
		System.out.println(map.containsKey("F"));
		
		System.out.println(map.remove("B"));
		System.out.println(map.remove("F"));
		
		System.out.println(map);
	}
}

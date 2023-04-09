package _29_HashMap_Implementation;

public class _1_HashMap {

	private class Node{
		String key;
		Integer value;
		Node next;
		public Node(String key, Integer value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	private Node[] bucketArray;
	private int size;
	
	public _1_HashMap() {
		this(4);		//call hashMap(4);
	}
	
	public _1_HashMap(int capacity) {
		bucketArray = new Node[capacity];
		size = 0;
	}
	
	private int hashfunction(String key) {		//this is for internal work
		int hashCode = key.hashCode();
		int bucketNumber = hashCode % bucketArray.length;
		return bucketNumber;
	}
	
	public void put(String key, Integer value) {
		int bucketNumber = hashfunction(key);
		Node temp = bucketArray[bucketNumber];
		while(temp != null) {
			if(temp.key.equals(key)) {		//check existing elements
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		//if existing elements not present
		Node newNode = new Node(key , value);
		Node head = bucketArray[bucketNumber];
		newNode.next = head;
		bucketArray[bucketNumber] = newNode;
		size++;
		//load factor
		double loadf = size / bucketArray.length;
		int threshold = 2;
		if(loadf > threshold)
			reHashing();
	}
	
	private void reHashing() {
		Node[] oldBucketArray = bucketArray;
		Node[] newBucketArray = new Node[bucketArray.length * 2];
		bucketArray = newBucketArray;
		size = 0;
		for(Node temp : oldBucketArray) {
			while(temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
	}

	public Integer get(String key) {
		int bucketNumber = hashfunction(key);
		Node temp = bucketArray[bucketNumber];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;	
	}
	
	public boolean containsKey(String key) {
		int bucketNumber = hashfunction(key);
		Node temp = bucketArray[bucketNumber];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;	
	}
	
	public Integer remove(String key) {
		int bucketNumber = hashfunction(key);
		Node temp = bucketArray[bucketNumber];
		Node prev = null;
		while(temp != null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		//key wasn't present
		if(temp == null) {
			return null;
		}
		//key was present(we reach here because of break keyword)
		if(prev == null) {	//if temp 1st key match 
			bucketArray[bucketNumber] = temp.next;
		}
		else {
			prev.next = temp.next; //remove mid element and link 1st and 3rd
		}
		size--;
		return temp.value;
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Node temp : bucketArray) {
			while(temp != null) {
				str += temp.key + " = " + temp.value + ", ";
				temp = temp.next;
			}
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package _24_LinkedList;

import java.util.Stack;

public class LinkedList {

	private class Node{
		
		int data;
		Node next;
		
		Node(){
			
		}
		
		Node(int data){
			this.data = data;
		}
	}
	
	private Node head;
	
	public void display() {
		
		System.out.println("*************************");
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("\n*************************");
	}
	
	public int size() {
		
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public boolean isEmpty() {
		
//		return size() == 0;			//this increase time complexity
		return head == null;
	}
	
	public int getFirst() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
//		return (head != null) ? head.data : -1;
		return head.data;

	}
	
	public int getLast() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			
			temp = temp.next;
		}
		return temp.data;
	}
	
	public int getValueAtIndex(int index) throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		else if(index < 0 || index >= size()) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = head;
		
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	private Node getNodeAtIndex(int index) throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		else if(index < 0 || index >= size()) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = head;
		
		for(int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void addLast(int data) throws Exception {
		
		Node newNode = new Node();		//create new now and add data
		newNode.data = data;
//		newNode.next = null;			//not need by default next is null 
		
		if(isEmpty()) {					//if no any node in ll, means ll was empty,
			head = newNode;				//adding element at 1st time
		}
		else {
			Node mainNode = getNodeAtIndex(size() - 1);
			mainNode.next = newNode;					//last node link to newNode
		}
	}
	
	public void addfirst(int data) throws Exception {
		
		Node newNode = new Node();		
		newNode.data = data;

		newNode.next = head;
		head = newNode;
	}
	
	public void addAtindex(int index, int data) throws Exception {
		
		if(index < 0 || index > size()) {
			throw new Exception("Invalid Index");
		}
		if(index == 0) {
			addfirst(data);
		}
		else if(index == size()) {
			addLast(data);
		}
		else {
			Node newNode = new Node();
			newNode.data = data;
			
			Node _1st = getNodeAtIndex(index - 1);
			Node _2nd = getNodeAtIndex(index);
			
			_1st.next = newNode;
			newNode.next = _2nd;
		}
	}
	
	public int removeLast() throws Exception {
		
		if(isEmpty())
			throw new Exception("Linked List is Empty");
		
		int removeLast = getLast();
		
		if(size() == 1) {
			head = null;
		}
		else {
			Node size_2 = getNodeAtIndex(size() - 2);
			size_2.next = null;
		}
		return removeLast;	
	}
	
	public int removeFirst() throws Exception {
		
		if(isEmpty())
			throw new Exception("Linked List is Empty");
		
		int removeFirst = getFirst();
		
		if(size() == 1) {
			head = null;
		}
		else {
			head = head.next;
		}
		return removeFirst;	
	}
	
	public int removeAtIndex(int index) throws Exception {
		
		if(isEmpty())
			throw new Exception("Linked List is Empty");
		
		if(index < 0 || index >= size())
			throw new Exception("Invalid Index");
		
		if(index == 0) {
			return removeFirst();
		}
		
		else if(index == size() - 1) {
			return removeLast();
		}
		else {
			Node _1stIndex = getNodeAtIndex(index - 1);
			Node removeValue = _1stIndex.next;
			Node _3rdIndex = removeValue.next;
			
			_1stIndex.next = _3rdIndex;
			
			return removeValue.data;
		}
	}
	
	public void reverse1() {
		
		Node prev = head;
		Node current = prev.next;
		
		while(current != null) {
			
			Node aHead = current.next;
			
			current.next = prev;
			prev = current;
			
			current = aHead;
		}
		head.next = null;
		head = prev;
	}
	
	public void reverse2() {
		
		Node prev = null;
		Node current = head;
		
		while(current != null) {
			
			Node aHead = current.next;
			
			current.next = prev;
			prev = current;
			
			current = aHead;
		}
		head = prev;
	}
	
	public void reverse3() {
		reverse3Helper(null, head);
	}
	
	public void reverse4() {
		reverse4Helper(null, head);
	}
	
	private void reverse3Helper(Node prev, Node current) {
		
		if(current == null) {
			head = prev;
			return;
		}
		
		reverse3Helper(current, current.next);
		current.next = prev;
	}
	
	private void reverse4Helper(Node prev, Node current) {
		
		if(current == null) {
			head = prev;
			return;
		}
		Node aHead = current.next;
		current.next = prev;
		reverse4Helper(current, aHead);
	}
	
	public void reverse5() {
		
		Node temp = head;
		reverse5Helper(head);
		temp.next = null;
	}
	
	private void reverse5Helper(Node current) {
		
		if(current.next == null) {
			head = current;
			return;
		}
		reverse5Helper(current.next);
		current.next.next = current;
	}
	
	public int findMidPoint() {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public int findKthFromLast(int k) {
		
		Node slow = head;
		Node fast = head;
		
		for(int i = 1; i <= k && fast != null; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.data;
	}
	
	public void createDubleLL() {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = null;
		
		n13.next = n12;
		n12.next = n11;
		n11.next = n7;
		
		intersectionIn2LL(n1, n13);
		intersectionIn2LL2(n1, n13);
	}
	
	public void intersectionIn2LL(Node h1, Node h2) {
		
		Node fp = h1;
		Node sp = h2;
		
		while(fp != sp) {
			
			if(fp == null)
				fp = h2;
			else
				fp = fp.next;
			
			if(sp == null)
				sp = h1;
			else
				sp = sp.next;
		}
		System.out.println(fp.data);
	}
	
	public void intersectionIn2LL2(Node first, Node second) {
		
		Node fp = first;
		Node sp = second;
		
		Stack<Node> f = new Stack<>();
		Stack<Node> s = new Stack<>();
		
		while(fp != null) {
			f.push(fp);
			fp = fp.next;
		}
		while(sp != null) {
			s.push(sp);
			sp = sp.next;
		}
		Node ans = new Node();
		while(f.peek() == s.peek()) {
			ans = f.pop();
			s.pop();
		}
		System.out.println(ans.data);
	}
	
	public void kReverse(int k) {
		head = kReverseHelper(head, k);
	}
	
	private Node kReverseHelper(Node node, int k) {
		
		if(node == null || k < 2) {
			return null;
		}
		// to identify the argument of smaller problem
		Node temp = node;
		for(int i = 1; i <= k && temp != null; i++) {
			temp = temp.next;
		}
		// smaller problem for next set reverse
		Node prev = kReverseHelper(temp, k);
		
		//self work : reverse set
		//reverse pointer iteratively
		Node curr = node;
		while(curr != temp) {
			Node aHead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = aHead;
		}
		return prev;
	}
	
	public void createDummyDubleLLAndDetectLoop() {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;
		
		System.out.println(detectLoopInLL(n1));
	}

	private boolean detectLoopInLL(Node n1) {
		
		Node slow = n1;
		Node fast = n1;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
//				removeLoop(fast, n1);
				removeLoop2(fast, n1);
				return true;
			}
		}
		return false;
	}
	
	public void removeLoop(Node meet, Node h) {
		
//		find the numbers of node in loop LL
		Node temp = meet;
		int count = 1;
		while(temp.next != meet) {
			count++;
			temp = temp.next;
		}		
//		move a pointer count numbers of steps ahead
		Node fast = h;
		for(int i = 1; i <= count; i++) {
			fast = fast.next;
		}
//		make slow and fast move at same
		Node slow = h;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
//		print LL
		Node t = h;
		while(t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}
	
	public void removeLoop2(Node meet, Node h) {
		
		Node start = h;
		Node loop = meet;
		
		while(start.next != loop.next) {
			start = start.next;
			loop = loop.next;
		}
		loop.next = null;
//		print LL
		Node t = h;
		while(t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}
	
	public void circularLLPrint() {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n1;
		
		circularLLPrint(n1);
	}
	
	private void circularLLPrint(Node n1) {
		
		Node temp = n1;
		
		while(n1 != temp.next) {
//			System.out.println(temp.data);
			temp = temp.next;
		}
//		if(temp != n1) {
//			System.out.println(temp.data);	//last element
//		}
		temp.next = null; //fix loop to null
		temp = n1;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

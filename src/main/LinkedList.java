package main;

public class LinkedList {
	public Node head = null;
	public int count = 0;
	
	public String append(String data) {
		head = new Node(data, null);
		count++;
		return head.data;
	}
	
	public String to_string() {
		return head.data;
	}
}

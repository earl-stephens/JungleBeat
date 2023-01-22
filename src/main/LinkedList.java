package main;

public class LinkedList {
	public Node head = null;
	
	public String append(String data) {
		head = new Node(data, null);
		return head.data;
	}
}

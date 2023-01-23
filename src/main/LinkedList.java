package main;

public class LinkedList {
	public Node head = null;
	public int count = 0;
	
	public String append(String data) {
		if(head == null) {
			head = new Node(data);
			count++;
			return head.data;
		} else {
			head.next_node = new Node(data);
			count++;
			return head.next_node.data;
		}
	}
	
	public String to_string() {
		return head.data;
	}
}

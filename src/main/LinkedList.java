package main;

import java.util.ArrayList;

public class LinkedList {
	public Node head = null;
	public int count = 0;
	
	public String append(String data) {
		if(head == null) {
			//Create head/first node
			head = new Node(data);
			count++;
			return head.data;
		} else {
			if(head.next_node == null) {
				//Create second node
				head.next_node = new Node(data);
				count++;
				return head.next_node.data;
			} else {
				//Create remaining nodes
				Node last;
				last = head.next_node;
				
				while(last.next_node != null) {
					last = last.next_node;
				}
				last.next_node = new Node(data);
				count++;
				last = last.next_node;
				return last.data;

			}
		}
	}
	
	public String to_string() {
		ArrayList<String> tempList = new ArrayList<>();
		tempList.add(head.data);
		
		if(head.next_node != null) {
			Node last;
			last = head.next_node;
			tempList.add(last.data);
			while(last.next_node != null) {				
				last = last.next_node;
				tempList.add(last.data);
			}
		}
		
		String listString = String.join(" ", tempList);
		return listString;
	}
}

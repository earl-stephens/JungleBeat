package main;

import java.util.ArrayList;

public class LinkedList {
	public Node head = null;
	
	public String append(String data) {
		if(head == null) {
			//Create head/first node
			head = new Node(data);
			return head.data;
		} else {
			if(head.next_node == null) {
				//Create second node
				head.next_node = new Node(data);
				return head.next_node.data;
			} else {
				//Create remaining nodes
				Node last;
				last = head.next_node;
				
				while(last.next_node != null) {
					last = last.next_node;
				}
				last.next_node = new Node(data);
				last = last.next_node;
				return last.data;

			}
		}
	}
	
	public int count() {
		int count = 0;
		
		if(head == null) {
			return count;
		} else {
			//Updates counter for head node
			count++;
			
			if(head.next_node != null) {
				Node last;
				last = head.next_node;
				count++;
				while(last.next_node != null) {				
					last = last.next_node;
					count++;
				}
			}
		}
		return count;
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
	
	public String prepend(String data) {
		Node tempNode = head;
		head = new Node(data);
		head.next_node = tempNode;
		return head.data;
	}
	
	public String insert(int position, String data) {
		if(position == 0) {
			prepend(data);
			return head.data;
		} else {
			int counter = 1;
			
			if(position == 1) {
				Node tempNode = head.next_node;
				head.next_node = new Node(data);
				head.next_node.next_node = tempNode;
				return head.next_node.data;
			}
			
			Node last = head.next_node;
			while(counter < (position - 1)) {
				//Need position -1 because want the node before the position
				last = last.next_node;
				counter++;
				System.out.println("line 101 " + last.data);
				System.out.println(counter);
			}
			
			Node tempNode = last.next_node;
			last.next_node = new Node(data);
			last.next_node.next_node = tempNode;
			return last.next_node.data;
		}
	}
}

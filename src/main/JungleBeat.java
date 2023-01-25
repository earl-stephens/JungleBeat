package main;

import java.util.ArrayList;

public class JungleBeat {
	public LinkedList list;
	
	public JungleBeat() {
		list = new LinkedList();
	}
	
	public String append(String data) {
		String[] temporary = data.split(" ");
		
		for(String soloData : temporary) {
			list.append(soloData);
		}
		return data;
	}
}

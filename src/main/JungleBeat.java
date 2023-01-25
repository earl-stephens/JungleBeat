package main;

import java.io.IOException;

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
	
	public void play() {
		String command = "say " + list.to_string();
		try {
		Process process = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

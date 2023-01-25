package main;

import java.io.IOException;
import java.util.Scanner;

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
		String rateToPlay = getRate();
		String command = "say -r " + rateToPlay + list.to_string();
		try {
		Process process = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getRate() {
		String rate = "";
		System.out.println("Please enter a number between 100 and 500 for the voice rate.");
		System.out.println("Or enter the word rate for the default voice rate.");
		Scanner scanner = new Scanner(System.in);
		rate = scanner.next();
		scanner.close();
		
		if(rate.equals("rate")) {
			rate = "500";
		} 
		
		return rate;
	}
}

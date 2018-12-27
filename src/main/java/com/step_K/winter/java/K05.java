package com.step_K.winter.java;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K05 {
	
	Scanner s = new Scanner(System.in);
	ArrayList<K05_UserInfo> list = new ArrayList<K05_UserInfo>();
	
	public static void main(String args[]) {
		K05 k = new K05();
		k.run();
		
	}
	
	void input() {
		K05_UserInfo info = new K05_UserInfo();
		System.out.print("enter ID and password : ");
		String line = s.nextLine();
		Pattern p = Pattern.compile("(.+)\\s([0-9]+)");
		Matcher m = p.matcher(line); // input to see if it matches.
		boolean b = m.matches();
		
		info.id = m.group(1);
		info.password = Integer.parseInt(m.group(2)); // if overflow could occur, use array in K05_UserInfo class.
		list.add(info);
	}
	
	void print(int index) { // no parameters needed, but the question said so...
		System.out.println("1 "+list.get(0).id + " " + list.get(0).password);
	} // printing single information.
	
	void run() {
		this.input();
		this.print(0);
	}

}

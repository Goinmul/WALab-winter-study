package com.step_K.winter.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K06 {

	Scanner s = new Scanner(System.in);
	ArrayList<K05_UserInfo> list = new ArrayList<K05_UserInfo>();

	public static void main(String args[]) {
		K06 k = new K06();
		k.run();

	}

	void input() {
		System.out.print("# of information : ");
		int iterate = s.nextInt();
		String consume = s.nextLine(); // consume enter key.
		for (int i=0; i<iterate; i++) {
			K05_UserInfo info = new K05_UserInfo();
			System.out.print("enter ID and password : "); // input example : Kim 1234
			String line = s.nextLine();
			Pattern p = Pattern.compile("(.+)\\s([0-9]+)");
			Matcher m = p.matcher(line); // input to see if it matches.
			boolean b = m.matches();

			info.id = m.group(1);
			info.password = Integer.parseInt(m.group(2)); // if overflow could occur, use array in K05_UserInfo class.
			list.add(info);
		}
	}

	void print(int index) { // no parameters needed, but the question said so...
		for (int i=0; i< index; i++) {
			System.out.println((i+1)+"th information : "+list.get(0).id + " " + list.get(0).password);
		}
	}

	void run() {
		this.input();
		this.print(list.size());
	}

}

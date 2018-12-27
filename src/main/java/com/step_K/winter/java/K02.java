package com.step_K.winter.java;
import java.util.ArrayList;
import java.util.Scanner;

public class K02 {
	Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		K02 k = new K02();
		k.run();

	}

	int num, charge;
	String menu, origin;
	ArrayList<K01> list = new ArrayList<K01>();

	void input() {
		K01 k = new K01();
		System.out.print("menu # : ");
		k.num = s.nextInt();
		String consume = s.nextLine(); // get rid of '\n'
		System.out.print("menu name : ");
		k.menu = s.nextLine();
		System.out.print("origin : ");
		k.origin = s.nextLine();
		System.out.print("charge : ");
		k.charge = s.nextInt();
		list.add(k);

	}

	void print() {
		for (int i=0; i<list.size(); i++) {
			System.out.println("menu number / menu / origin / charge");
			System.out.println(list.get(i).num + "  " +list.get(i).menu  + "  " + list.get(i).origin  + "  " + list.get(i).charge);
		}
	}

	void run() {
		System.out.print("# of menus : ");
		int iterate = s.nextInt();
		for (int i=0; i<iterate; i++) {
			this.input();
		}
		this.print();
	}

}

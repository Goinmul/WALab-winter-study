package com.step_K.winter.java;
import java.util.Scanner;

public class K01 {

	public static void main(String args[]) {
		K01 k = new K01();
		k.run();
	}
	Scanner s = new Scanner(System.in);
	
	int num, charge;
	String menu, origin;
	
	void input() {
		System.out.print("menu # : ");
		num = s.nextInt();
		String consume = s.nextLine(); // get rid of '\n'
		System.out.print("menu name : ");
		menu = s.nextLine();
		System.out.print("origin : ");
		origin = s.nextLine();
		System.out.print("charge : ");
		charge = s.nextInt();
	}
	
	void print() {
		System.out.println("menu number / menu / origin / charge");
		System.out.println(num + "  " + menu  + "  " + origin  + "  " + charge);
	}
	
	void run() {
		this.input();
		this.print();
	}
	
}

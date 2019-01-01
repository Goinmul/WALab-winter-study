package com.L01.step_L.java;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L01 {

	Scanner s = new Scanner(System.in);
	String name, origin;
	int price;

	public L01() {} // constructor

	public L01(String name, String origin, int price){ // constructor
		this.name = name;
		this.origin = origin;
		this.price = price;
	}

	L01 createMenu() {

		System.out.print("enter menu name, origin, price : ");
		String input = s.nextLine();

		Pattern p = Pattern.compile("(.+)\\s+(.+)\\s+([0-9]+)"); // ex) beef steak USA 13000
		Matcher m = p.matcher(input);
		boolean b = m.matches();

		if (b) {
			L01 element = new L01(m.group(1), m.group(2), Integer.parseInt(m.group(3)));
			return element;
		}

		else {
			System.out.println("wrong input format. (menu origin price)");
			return null;
		}
	}

	ArrayList<L01> modifyList(ArrayList<L01> list){

		System.out.print("enter the number of a menu to modify : ");
		int number = s.nextInt();
		String consume = s.nextLine();
		if (number>0 && number<=list.size()) {
			L01 newElement = createMenu();
			list.set(number-1, newElement);
		}
		else
			System.out.println("there is no such menu number.");

		return list;
	}

	ArrayList<L01> deleteList(ArrayList<L01> list){

		System.out.print("enter the number of a menu to delete : ");
		int number = s.nextInt();
		if (number>0 && number<=list.size()) {
			list.remove(number-1);
		}
		else
			System.out.println("there is no such menu number.");
		return list;
	}

	void printList(ArrayList<L01> list) {

		if (list.size() == 0)
			System.out.println("list is empty.");
		else {
			System.out.println("number / name / origin / price");
			for (int i=0; i< list.size(); i++ ) {
				System.out.println((i+1)+" "+list.get(i).name+" "+list.get(i).origin+" "+list.get(i).price);
			}
		}
	}

	void printQuantity(ArrayList<L01> list) {
		System.out.println("there are total "+list.size()+" menu.");
	}

	// main
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		L01 l = new L01();
		ArrayList<L01> list = new ArrayList<L01>();
		int choice = -1;

		while (true) {
			System.out.print("1)add 2)modify 3)delete 4)list 5)quantity 6)exit : ");
			choice = s.nextInt();

			if (choice == 1) {
				list.add(l.createMenu());
			}
			else if (choice == 2) {
				list = l.modifyList(list);
			}
			else if (choice == 3) {
				list = l.deleteList(list);
			}
			else if (choice == 4) {
				l.printList(list);
			}
			else if (choice == 5) {
				l.printQuantity(list);
			}
			else if (choice == 6) {
				System.out.println("exit.");
				break;
			}
			else {
			}
		}


	}

}

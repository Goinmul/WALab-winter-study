package com.M01.step_M.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {

	String name, origin, price;

	Scanner s = new Scanner(System.in);

	Menu(){}

	Menu(String name, String origin, String price){
		this.name = name;
		this.origin = origin;
		this.price = price;
	}

	Menu menuCreator() {

		// get user input, and parse it
		System.out.print("enter menu name, origin, price : ");
		String input = s.nextLine();
		
		Pattern p = Pattern.compile("(.+)\\s+(.+)\\s+(.+)");
		Matcher m = p.matcher(input);
		boolean b = m.matches();

		// if input matches the menu format, create a new menu
		if (b) {
			String menuName = m.group(1);
			String origin = m.group(2);
			String price = m.group(3); // **price format string
			return new Menu(menuName, origin, price);
		}
		else {
			System.out.println("wrong menu format.");
			return null;
		}
	}

	void menuPrinter(ArrayList<Menu> list) {
		if (list.size()==0) {
			System.out.println("menu empty.");
		}
		else {
			System.out.println("number  name  origin  price");
			for (int i=0; i<list.size(); i++) {
				System.out.println((i+1)+" "+list.get(i).name+" "+list.get(i).origin+" "+list.get(i).price);
			}
		}
	}

	// will be used in FileDataWriter class
	ArrayList<String> menuAsString(ArrayList<Menu> list) {
		ArrayList<String> lines = new ArrayList<String>();
		String eachLine = "";
		for (int i=0; i<list.size(); i++) {
			eachLine = String.valueOf((i+1))+" "+list.get(i).name+" "+list.get(i).origin+" "+list.get(i).price;
			lines.add(eachLine);
		}
		return lines;
	}

	void menuQuantityViewer(ArrayList<Menu> list) {
		System.out.println("total # of menu : "+list.size());
	}

	ArrayList<Menu> listAdder(ArrayList<Menu> list){
		list.add(menuCreator());
		return list;
	}

	ArrayList<Menu> listModifier(ArrayList<Menu> list){

		if (list.size() == 0) {
			System.out.println("menu empty.");
			return null;
		}
		else {
			// show existing list
			menuPrinter(list);

			// get user input
			System.out.print("the number of menu to modify : ");
			int input = s.nextInt();

			// if input being valid, replace according menu
			if(input >= 0 && input <= list.size()) {
				String bufferClear = s.nextLine(); // (!)
				list.set(input-1, menuCreator());
			}
			else
				System.out.println("wrong number of menu.");
			return list;
		}
	}

	ArrayList<Menu> listRemover(ArrayList<Menu> list){

		if (list.size() == 0) {
			System.out.println("menu empty.");
			return null;
		}

		else {
			// show existing list
			menuPrinter(list);

			// get user input
			System.out.print("the number of menu to delete : ");
			int input = s.nextInt();
			String bufferClear = s.nextLine(); // (!)

			if(input >= 0 && input <= list.size()) {
				list.remove(input-1);
			}
			else
				System.out.println("wrong number of menu.");
			return list;
		}
	}
}

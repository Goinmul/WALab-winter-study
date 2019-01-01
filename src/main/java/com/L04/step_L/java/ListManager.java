package com.L04.step_L.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ListManager {

	Scanner s = new Scanner(System.in);
	StudentInfo listClass = new StudentInfo();

	ArrayList<StudentInfo> listModifier(ArrayList<StudentInfo> list){
		if (list.size()==0) {
			System.out.println("list is empty.");
			return null;
		}
		else {
			this.listPrinter(list);
			System.out.print("number of element to modify : ");
			int index = s.nextInt();
			list.set(index-1, listClass.enlister());

			return list;
		}
	}

	ArrayList<StudentInfo> listRemover(ArrayList<StudentInfo> list){
		if (list.size()==0) {
			System.out.println("list is empty.");
			return null;
		}
		else {
			System.out.print("number of element to delete : ");
			int index = s.nextInt();
			list.remove(index-1);

			return list;
		}
	}

	void listPrinter(ArrayList<StudentInfo> list) {
		if (list.size() == 0) {
			System.out.println("list is empty.");
		}
		else {
			for (int i=0; i<list.size(); i++) {
				System.out.println("["+(i+1)+"] "+list.get(i).name+" "+list.get(i).studentNumber+" "+list.get(i).sex+" "+list.get(i).address+" "+list.get(i).phoneNumber+" "+list.get(i).returned);
			}
		}
	}

	void searchByName(ArrayList<StudentInfo> list) {
		if (list.size()==0) {
			System.out.println("list is empty.");
		}
		else {
			System.out.print("enter a name to search : ");
			String name = s.nextLine();
			int count=1;
			boolean flag = false;
			for (int i=0; i<list.size(); i++) {
				if(list.get(i).name.toUpperCase().contains(name.toUpperCase())) {
					flag = true;
					if(count ==1 && flag == true)
						System.out.println("found the matching name.");
					System.out.println("["+count+"] "+list.get(i).name+" "+list.get(i).studentNumber+" "+list.get(i).sex+" "+list.get(i).address+" "+list.get(i).phoneNumber+" "+list.get(i).returned);
					count++;
				}
			}
			if (flag == false)
				System.out.println("no matching name.");
		}
	}

	void searchReturningStudent(ArrayList<StudentInfo> list) {
		if (list.size()==0) {
			System.out.println("list is empty.");
		}
		else {
			int count = 0;
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).returned.equalsIgnoreCase("Y"))
					count++;
			}
			System.out.println("the number of returning students is "+count+".");
		}
	}

	void searchByAddress(ArrayList<StudentInfo> list) {
		if (list.size()==0) {
			System.out.println("list is empty.");
		}
		else {
			System.out.print("enter address to search : ");
			String address = s.nextLine();
			
			int count = 1;
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).address.toUpperCase().contains(address.toUpperCase())) {
					System.out.println("["+count+"] "+list.get(i).name+" "+list.get(i).studentNumber+" "+list.get(i).sex+" "+list.get(i).address+" "+list.get(i).phoneNumber+" "+list.get(i).returned);
				}
			}
		}
	}

	void showHowMany(ArrayList<StudentInfo> list) {
		System.out.println("total "+list.size()+" people enlisted.");
	}

}

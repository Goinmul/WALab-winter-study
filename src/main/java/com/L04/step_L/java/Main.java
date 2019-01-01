package com.L04.step_L.java;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		// instantiate two object in the same package
		StudentInfo enlister = new StudentInfo();
		ListManager manager = new ListManager();
		
		// main data structure to hold the information
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		
		// start getting inputs from user
		int input =0;
		while (true) {
			System.out.print("1)enlist 2)modify 3)delete 4)show list 5)name search 6)returning student list 7)search address 8)exit : ");
			input = s.nextInt();
			
			if (input == 1) 
				list.add(enlister.enlister());
			else if (input == 2) 
				manager.listModifier(list);
			else if (input == 3) 
				manager.listRemover(list);
			else if (input == 4) 
				manager.listPrinter(list);
			else if (input == 5)
				manager.searchByName(list);
			else if (input == 6)
				manager.searchReturningStudent(list);
			else if (input == 7)
				manager.searchByAddress(list);
			else if (input == 8) {
				System.out.println("exit program.");
				break;
			}
			else
				System.out.println("wrong input.");
		}

	}

}

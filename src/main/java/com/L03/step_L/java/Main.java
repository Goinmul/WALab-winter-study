package com.L03.step_L.java;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<MenuHandler> list = new ArrayList<MenuHandler>();
		MenuHandler waiter = new MenuHandler();

		int choice = 0;
		while (true) {
			System.out.print("1)order 2)pay 3)show list 4)exit : ");
			choice = s.nextInt();
			
			if (choice ==1)
				list.add(waiter.run());
			else if (choice == 2) {
				waiter.menuPrinter(list);
				System.out.print("enter number of order to pay : ");
				int num = s.nextInt();
				list.remove(num);
			}
			else if (choice ==3)
				waiter.menuPrinter(list);
			else if (choice == 4) {
				System.out.println("exit program.");
				break;
			}
			else
				System.out.println("wrong input.");
		}

	}

}

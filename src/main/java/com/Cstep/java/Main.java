package com.Cstep.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Step_C c = new Step_C();
		Scanner s = new Scanner(System.in);
		String key = "a";
		while(key != "q")
		{
			System.out.print("Enter question number to execute(q for quit) : ");
			key = s.next().toLowerCase();

			switch(key)
			{

			case "1":
				c.C01();
				break;

			case "2":
				c.C02();
				break;

			case "3":
				c.C03();
				break;

			case "4":
				c.C04();
				break;

			case "5":
				c.C05();
				break;

			case "6":
				c.C06();
				break;

			case "7":
				c.C07();
				break;

			case "8":
				c.C08();
				break;
				
			case "9":
				c.C09();
				break;
				
			case "10":
				c.C10();
				break;
				
			case "11":
				c.C11();
				break;
				
			case "q":
				System.out.println("quit program.\n");
				key = "q";
				break;

			default :
				System.out.println("input should be 1~11 or 'q'.\n");
			}

		}
	}

}

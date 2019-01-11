package com.Bstep.java;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Step_B b = new Step_B();
		//System.out.print("Enter an integer : ");
		//int user_input = s.nextInt();

		String key = "a";
		while(key != "q")
		{
			System.out.print("Enter question number to execute(q for quit) : ");
			key = s.next().toLowerCase();

			switch(key)
			{

			case "1":
				b.B01();
				break;

			case "2":
				b.B02();
				break;

			case "3":
				b.B03();
				break;

			case "4":
				b.B04();
				break;

			case "5":
				b.B05();
				break;

			case "6":
				b.B06();
				break;

			case "7":
				b.B07();
				break;

			case "8":
				b.B08();
				break;
				
			case "9":
				b.B09();
				break;
				
			case "q":
				System.out.println("quit program.\n");
				key = "q";
				break;

			default :
				System.out.println("input should be 1~7 or 'q'.\n");
			}

		}

	}
}

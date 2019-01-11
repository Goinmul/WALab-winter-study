package com.Dstep.java;

import java.util.Scanner;

import com.Cstep.java.Step_C;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Step_D d = new Step_D();
		Scanner s = new Scanner(System.in);
		String key = "a";
		while(key != "q")
		{
			System.out.print("Enter question number to execute(q for quit) : ");
			key = s.next().toLowerCase();

			switch(key)
			{

			case "1":
				d.D01();
				break;

			case "2":
				d.D02();
				break;

			case "3":
				d.D03();
				break;

			case "4":
				d.D04();
				break;

			case "5":
				d.D05();
				break;

			case "6":
				d.D06();
				break;

			case "7":
				d.D07();
				break;

			case "8":
				d.D08();
				break;
				
			case "9":
				d.D09();
				break;
				
			case "10":
				d.D10();
				break;
				
			case "q":
				System.out.println("quit program.\n");
				key = "q";
				break;

			default :
				System.out.println("input should be 1~10 or 'q'.\n");
			}

		}
	}

}

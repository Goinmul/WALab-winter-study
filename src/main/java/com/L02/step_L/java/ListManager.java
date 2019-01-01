package com.L02.step_L.java;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListManager {

	ArrayList<ParkingInformation> list = new ArrayList<ParkingInformation>();

	public void inputHandler(int totalCarNumber) {

		int input = 0;
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("1)put in 2)pull out 3)show list 4)total car number 5)empty parking lots 6)exit : ");
			input = s.nextInt();
			String consume = s.nextLine();

			if (input == 1) {
				if(totalCarNumber <= list.size())
					System.out.println("parking lot full.");
				else {
					System.out.print("plate number and model name : ");
					String info = s.nextLine();
					ParkingInformation element = putIn(info);
					list.add(element);
					System.out.println("["+list.size()+"] "+element.date+" put in.");
				}
			}

			else if (input == 2) {
				System.out.print("# of car to pull out : ");
				int number = s.nextInt();
				
				// calculate charge
				SimpleDateFormat f = new SimpleDateFormat("S",Locale.KOREA);
				int start = Integer.parseInt(list.get(number-1).seconds);
				int end = Integer.parseInt(f.format(new Date()));
				list.remove(number-1);
				
				int time = end - start;
				int tenMinutes = time/600;
				int charge =0;
				
				if (tenMinutes <= 1) {
					SimpleDateFormat n = new SimpleDateFormat("[YYYY MM dd hh:mm]",Locale.KOREA);
					System.out.print("it is "+n.format(new Date())+" now, ");
					System.out.println("there is no charge.");
				}
				else {
					if (time%600 != 0) {
						charge = tenMinutes*500;
					}
					else {
						charge = (tenMinutes -1)*500;
					}
					SimpleDateFormat n = new SimpleDateFormat("[YYYY MM dd hh:mm]",Locale.KOREA);
					System.out.println("it is "+n.format(new Date())+" now, and the charge is : "+charge);
				}
				
			}

			else if (input == 3) {
				if (list.isEmpty())
					System.out.println("parking lot is empty.");
				else {
					for (int i=0; i<list.size(); i++) {
						System.out.println("["+(i+1)+"]"+list.get(i).plate+" "+list.get(i).model+" "+list.get(i).date);
					}
				}
			}

			else if (input == 4) {
				System.out.println("total car numbers : "+list.size());
			}

			else if (input == 5) {
				if (totalCarNumber !=0)
					System.out.println("empty parking lot : "+(totalCarNumber - list.size()));
			}

			else if (input == 6) {
				System.out.println("exit program.");
				break;
			}

			else
				System.out.println("wrong input.(not 1~6)");
		}
	}

	public ParkingInformation putIn(String input) {

		Pattern p = Pattern.compile("([0-9]+)(.+)");
		Matcher m = p.matcher(input);
		boolean b = m.matches();

		String plate = m.group(1);
		String model = m.group(2);

		if (b) {
			SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss", Locale.KOREA);
			SimpleDateFormat seconds = new SimpleDateFormat("S",Locale.KOREA);
			ParkingInformation info = new ParkingInformation(f.format(new Date()), plate, model, seconds.format(new Date()));
			return info;
		}
		else {
			System.out.println("wrong input.");
			return null;
		}
	}

}

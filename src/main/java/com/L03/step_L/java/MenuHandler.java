package com.L03.step_L.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuHandler {

	int number, steak, spaghetti, pasta;
	String membership;
	String entryTime;
	int pay;

	MenuHandler(){}

	MenuHandler(int number, int steak, int spaghetti, int pasta, String membership, String entryTime, int pay)
	{
		this.number = number;
		this.steak = steak;
		this.spaghetti = spaghetti;
		this.pasta = pasta;
		this.membership = membership;
		this.entryTime = entryTime;
		this.pay = pay;
	}
	Scanner s = new Scanner(System.in);
	PayCalculator cashier = new PayCalculator();

	MenuHandler run() {

		int number = this.askHowMany();
		String consume = s.nextLine();
		int originalPrice = this.totalCharge();
		double membershipDiscountRate = cashier.membershipCardDiscountRate();
		String entry = this.entryTime();
		System.out.println("entry time is "+entry);
		double discountedPrice = originalPrice*membershipDiscountRate;
		double finalPrice = cashier.serviceFee(discountedPrice);
		int pay = (int)finalPrice;
		System.out.println("total charge is "+pay);
		MenuHandler menu = new MenuHandler(number, this.steak, this.spaghetti, this.pasta,cashier.membership,entry,pay);
		return menu;
	}

	String entryTime() {
		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss", Locale.KOREA);
		SimpleDateFormat seconds = new SimpleDateFormat("S",Locale.KOREA);
		String info = f.format(new Date());
		return info;
	}

	int askHowMany() {
		System.out.print("the number of people : ");
		int population = s.nextInt();
		return population;
	}

	int totalCharge() {
		System.out.print("steak, spaghetti, pasta : ");
		String input = s.nextLine();

		Pattern p = Pattern.compile("([0-9])\\s+([0-9])\\s+([0-9])"); // input example : 1 2 4
		Matcher m = p.matcher(input);
		boolean b = m.matches();

		if (!b) {
			System.out.println("wrong menu number input.");
			return 0;
		}
		else {
			this.steak = Integer.parseInt(m.group(1));
			this.spaghetti = Integer.parseInt(m.group(2));
			this.pasta = Integer.parseInt(m.group(3));
			return Integer.parseInt(m.group(1))*25000 + Integer.parseInt(m.group(2))*15000 + Integer.parseInt(m.group(3))*17000;
		}
	}

	void menuPrinter(ArrayList<MenuHandler> list) {
		if (list.size() == 0){
			System.out.println("there are no orders to be paid.");
		}
		else {
			System.out.println("# of people / steak / spaghetti / pasta / membership / entry time");
			for (int i=0; i<list.size(); i++) {
				System.out.println("["+(i+1)+"] "+list.get(i).number+" "+list.get(i).steak+" "+list.get(i).spaghetti+" "+list.get(i).pasta+" "+list.get(i).membership+" "+list.get(i).entryTime);
			}
		}

	}

}

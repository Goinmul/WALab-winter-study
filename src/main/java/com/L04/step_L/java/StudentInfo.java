package com.L04.step_L.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentInfo {
	String name, sex, address, returned, phoneNumber;
	int studentNumber;
	
	StudentInfo(){}
	StudentInfo(String name, String sex, String address, String returned, String phoneNumber, int studentNumber){
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.returned = returned;
		this.phoneNumber = phoneNumber;
		this.studentNumber = studentNumber;
	}
	
	Scanner s = new Scanner(System.in);
	
	StudentInfo enlister(){
		// get user input, parse it, and create a student information
		System.out.print("enter name, student number, sex : ");
		String input = s.nextLine();
		
		Pattern p = Pattern.compile("(.+)\\s+([0-9]+)\\s+(.+)");
		Matcher m = p.matcher(input);
		boolean b = m.matches();
		String name = m.group(1);
		String studentNumber = m.group(2);
		String sex = m.group(3);
		
		System.out.print("enter address : ");
		String address = s.nextLine();
		
		System.out.print("enter phone number : ");
		String phoneNumber = s.nextLine();
		
		System.out.print("are you a returning student?(Y/N) : ");
		String returned = s.nextLine();
		
		StudentInfo card = new StudentInfo(name, sex, address,returned,phoneNumber, Integer.parseInt(studentNumber));
		return card;
	}
	

	
	
}

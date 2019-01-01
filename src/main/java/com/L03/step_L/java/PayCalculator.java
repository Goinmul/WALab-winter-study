package com.L03.step_L.java;
import java.util.Scanner;

public class PayCalculator {

	String membership;
	Scanner s = new Scanner(System.in);
	
	double membershipCardDiscountRate() {
		System.out.print("do you have membership card? (Y/N) : ");
		String answer = s.next();
		if (answer.equalsIgnoreCase("Y")) {
			this.membership = "Y";
			return 0.9;
		}
			
		else if (answer.equalsIgnoreCase("N")) {
			this.membership = "N";
			return 1.0;
		}
		else {
			System.out.println("wrong answer.");
			return 1.0;
		}
	}
	
	double serviceFee(double charge) {
		
		if (charge < 0.0) {
			System.out.println("charge is smaller than 0. No service fee.");
			return 1.0;
		}
		else if (charge < 100000.0) {
			return charge*1.07;
		}
		else
			return charge*1.1;
	}
}

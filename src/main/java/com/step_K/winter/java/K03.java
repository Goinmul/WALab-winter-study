package com.step_K.winter.java;
import java.util.ArrayList;
import java.util.Scanner;

public class K03 {
	Scanner s = new Scanner(System.in);
	K03_Point point = new K03_Point();
	int[] dimensions = new int[4];
	
	public static void main(String args[]) {

		K03 k = new K03();
		k.run();
	}

	void input() {
		K03_Point point = new K03_Point();
		System.out.print("enter x and y : ");
		point.x = s.nextDouble();
		point.y = s.nextDouble();
		this.point = point;
		dimensions[getArea(point.x, point.y)-1]++;
	}
	
	void print() {
		int dimension = getArea(point.x, point.y);
		System.out.println("it is in "+dimension+"th dimension.");
	}
	void print_dimensions() {
		for (int i=0; i<4; i++) {
			System.out.println("points in "+(i+1)+"th dimension : "+dimensions[i]);
		}
		
	}

	int getArea(double x, double y) {
		if (x>0 && y>0)
			return 1;
		else if (x<0 && y>0)
			return 2;
		else if (x<0 && y<0)
			return 3;
		else if (x>0 && y<0)
			return 4;
		else
			return 0; // x and y are both zero.
	}
	
	void run() {
		this.input();
		this.print();
		this.print_dimensions();
	}

}

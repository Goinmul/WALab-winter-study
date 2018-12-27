package com.step_K.winter.java;
import java.util.ArrayList;
import java.util.Scanner;

public class K04 {

	Scanner s = new Scanner(System.in);
	ArrayList<K03_Point> list = new ArrayList<K03_Point>();
	int[] dimensions = new int[4];

	public static void main(String args[]) {
		K04 k = new K04();
		k.run();

	}

	void input() {
		System.out.print("# of points : ");
		int iterate = s.nextInt();
		for (int i=0; i<iterate; i++) {
			K03_Point point = new K03_Point();
			System.out.print("enter x and y : ");
			point.x = s.nextDouble();
			point.y = s.nextDouble();
			list.add(point);
			dimensions[getArea(point.x, point.y)-1]++;
		}
	}

	void print() {
		for (int i=0; i<list.size(); i++) {
			int dimension = getArea(list.get(i).x, list.get(i).y);
			System.out.println((i+1)+"th point is in "+dimension+"th dimension.");
		}
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

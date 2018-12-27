package com.step_K.winter.java;
import java.util.ArrayList;
import java.util.Scanner;

public class K07 {
	
	Scanner s = new Scanner(System.in);
	ArrayList<K07_Student> list = new ArrayList<K07_Student>();
	
	public static void main(String args[]) {
		K07 k = new K07();
		k.run();
	}
	
	void input() {
		System.out.print("# of student : ");
		int iterate = s.nextInt();
		
		for (int i=0; i<iterate; i++) {
			K07_Student student = new K07_Student();
			System.out.print((i+1)+"th student's Korean, English, Math grade : ");
			student.Korean = s.nextInt();
			student.English = s.nextInt();
			student.Math = s.nextInt();
			student.score = student.Korean + student.English + student.Math;
			student.average = student.score/3;
			if(student.average >=90) 
				student.grade = "A";
			else if (student.average>=80) 
				student.grade = "B";
			else if (student.average >= 70) 
				student.grade = "C";
			else if (student.average >= 60) 
				student.grade = "D";
			else
				student.grade = "F";
			list.add(student);
		}
		
	}
	
	void print(int index) {
		System.out.println("# / Korean / English / Math / total score / average / grade");
		for (int i=0; i<index; i++) {
			System.out.println((i+1)+" "+list.get(i).Korean+" "+list.get(i).English+" "+list.get(i).Math+" "+list.get(i).score+" "+list.get(i).average+" "+list.get(i).grade);
		}
	}
	
	void run () {
		this.input();
		this.print(list.size());
	}
	
	

}

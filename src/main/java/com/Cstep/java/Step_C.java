package com.Cstep.java;

import java.util.Calendar;
import java.util.Scanner;

public class Step_C {
	
	Scanner s = new Scanner(System.in);
	
	void C01() {
		System.out.print("태어난 연도 : ");
		int year = s.nextInt();
		int age = Calendar.getInstance().get(Calendar.YEAR) - year +1;
		
		if (age < 7)
			System.out.println("유아입니다.");
		else if (age < 13)
			System.out.println("어린이입니다.");

		else if (age < 20)
			System.out.println("청소년입니다.");

		else if (age < 30)
			System.out.println("청년입니다.");

		else if (age < 60)
			System.out.println("중년입니다.");

		else
			System.out.println("노년입니다.");
	}
	
	void C02() {
		System.out.print("물의 온도 : ");
		double degree = s.nextDouble();
		if (degree < 0)
			System.out.println("잘못 입력하셨습니다.");
		else if (degree <25)
			System.out.println("냉수입니다.");
		else if (degree <40)
			System.out.println("미온수입니다.");
		else if (degree<80)
			System.out.println("온수입니다.");
		else
			System.out.println("끓는 물입니다.");
	}
	
	void C03() {
		System.out.print("가로 : ");
		int row = s.nextInt();
		System.out.print("세로 : ");
		int col = s.nextInt();
		
		if (row == col)
			System.out.println("정사각형입니다.");
		else if (row > col*2)
			System.out.println("좌우로 길쭉합니다.");
		else if (col > row*2)
			System.out.println("위아래로 길쭉합니다.");
		else if (row > col)
			System.out.println("일반적인 가로형 직사각형입니다.");
		else if (col > row)
			System.out.println("일반적인 세로형 직사각형입니다.");
	}
	
	void C04() {
		System.out.print("아파트의 분양 면적(제곱미터) : ");
		double area2 = s.nextDouble();
		double P = area2/3.305;
		System.out.println("아파트의 평형은 "+P+"이고,\n");
		if (P <15)
			System.out.println("소형입니다.\n");
		else if (P<30)
			System.out.println("중소형입니다.\n");
		else if (P<50)
			System.out.println("중형입니다.");
		else
			System.out.println("대형입니다.");
	}
	
	void C05() {
		int days = 0;
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("월 : ");
		int month = s.nextInt();
		System.out.print("일 : ");
		int date = s.nextInt();

		if ((month>12 || month<1)||(date>31||date<1)) {
			System.out.println("wrong month or date.");
			System.exit(1);
		}
		for(int i=0; i<month-1; i++) {
			days += monthdays[i];
		}
		days += date;
		System.out.println("이 날짜는 1년 중 "+days+"번째 날입니다.");
	}
	
	void C06() {
		System.out.print("국어 : ");
		int kor = s.nextInt();
		System.out.print("영어 : ");
		int eng = s.nextInt();
		System.out.print("수학 : ");
		int math = s.nextInt();
		int total = kor+eng+math;
		double avg = (kor+eng+math)/3;
		System.out.println("총점은 "+total+"점이고,");
		System.out.println("평균은 "+avg+"입니다.");
		if (avg>=90)
			System.out.println("등급은 수 입니다.");
		else if (avg>=80)
			System.out.println("등급은 우 입니다.");
		else if (avg>=70)
			System.out.println("등급은 미 입니다.");
		else if (avg>=60)
			System.out.println("등급은 양 입니다.");
		else
			System.out.println("등급은 가 입니다.");
	}
	
	void C07() {
		System.out.print("파일 용량(MB) : ");
		long MB = s.nextLong();
		long B = MB*1024*1024;
		
		System.out.print("전송방식 1)wifi 2)bluetooth 3)LTE 4)USB : ");
		byte kind = s.nextByte();
		
		if (kind == 1) {
			System.out.println("파일 전송 시간은 "+B/1500000+"초입니다.");
		}
		else if (kind == 2) {
			System.out.println("파일 전송 시간은 "+B/300000 +"초입니다.");
		}
		else if (kind == 3) {
			System.out.println("파일 전송 시간은 "+B/1000000 +"초입니다.");
		}
		else if (kind == 4) {
			System.out.println("파일 전송 시간은 "+B/60000000 +"초입니다.");
		}
	}
	
	void C08() {
		System.out.print("첫번째 숫자 : ");
		int first = s.nextInt();
		int max = first, min = first;
		System.out.print("두번째 숫자 : ");
		int second = s.nextInt();
		if (max<second)
			max = second;
		if (min>second)
			min = second;
		System.out.print("세번째 숫자 : ");
		int third = s.nextInt();
		if (max<third)
			max = third;
		if (min>third)
			min = third;
		System.out.println("가장 큰 수는 "+max+"이고, 가장 작은 수는 "+min+"입니다.");
	}
	
	void C09() {
		System.out.print("연봉(원 단위)을 입력하세요 : ");
		int salary = s.nextInt();
		int tax = 0;
		if (salary <10000000)
			tax = (int)(salary*0.095);
		else if(salary <40000000)
			tax = (int)(salary*0.19);
		else if(salary<80000000)
			tax = (int)(salary*0.28);
		else
			tax = (int)(salary*0.37);
		System.out.println("세금은 "+tax+"입니다.");
	}
	
	void C10() {
		System.out.print("숫자1 : ");
		int one = s.nextInt();
		System.out.print("숫자2 : ");
		int two = s.nextInt();
		System.out.print("연산기호문자(+,-,*,/)를 입력하세요 : ");
		String op = s.next();
		double result=0;
		if (op.equalsIgnoreCase("+"))
			result = one + two;
		else if (op.equalsIgnoreCase("-"))
			result = one - two;
		else if (op.equalsIgnoreCase("*"))
			result = one * two;
		else if (op.equalsIgnoreCase("/"))
			result = one / two;
		System.out.println("결과값은 "+result+"입니다.");
	}
	
	void C11() {
		System.out.print("년도를 입력하세요 : ");
		int year = s.nextInt();
		boolean flag = false;
		if (year%4==0) {
			flag = true;
			if (year%100==0) {
				flag = false;
				if (year%400==0) {
					flag = true;
				}
			}
		}
		if (flag)
			System.out.println("입력하신 년도는 윤년입니다.");
		else
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
	}

}

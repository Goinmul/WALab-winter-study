package com.Dstep.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Step_D {

	Scanner s = new Scanner(System.in);
	void D01() {
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		if (num>1) {
			int sum = 0;
			for (int i=1; i<=num; i++) {
				sum+=i;
			}
			System.out.println("1부터 "+num+"까지의 정수의 합은 "+sum+"입니다.");
		}
	}

	void D02() {
		int num = 0, max = 0, min = 100;
		while(true) {
			System.out.print("0부터 100사이의 숫자를 입력하세요 : ");
			num = s.nextInt();
			if (!(num>=0 && num<=100))
				break;
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		System.out.println("입력된 숫자들중 가장 큰 수는 "+max+"이고, 가장 작은 수는 "+min+"입니다.");
	}

	void D03() {
		int num = 0, count = 0, sum =0;
		while(true) {
			System.out.print("0부터 100사이의 숫자를 입력하세요 : ");
			num = s.nextInt();
			if (!(num>=0 && num<=100))
				break;
			count++;
			sum += num;
		}
		if (count != 0)
			System.out.println("입력한 "+count+"개의 숫자들의 총합은 "+sum+"이고, 평균은 "+sum/count+"입니다.");
	}

	void D04() {
		System.out.print("가족 수 : ");
		int num = s.nextInt();
		int count = 0; 
		for (int i=0; i<num; i++) {
			System.out.print("태어난 년도를 입력하세요.");
			int age = s.nextInt();
			int youth = Calendar.getInstance().get(Calendar.YEAR)-age+1;
			if (youth <20)
				count++;
		}
		System.out.println("가족들 중에 미성년자는 : "+count+"명입니다.");
	}

	void D05() {

		int c1=0, c2=0, c3=0, c4 =0, c5=0;
		while (true) {
			System.out.print("가로 : ");
			int row = s.nextInt();
			System.out.print("세로 : ");
			int col = s.nextInt();
			if (row == 0 || col ==0)
				break;


			if (row == col)
				c1++;
			else if (row > col*2)
				c2++;
			else if (col > row*2)
				c3++;
			else if (row > col)
				c4++;
			else if (col > row)
				c5++;
		}
		System.out.println("정사각형 : "+c1+"개");
		System.out.println("좌우로 길쭉한 사각형 : "+c2+"개");
		System.out.println("위아래로 길쭉한 사각형 : "+c3+"개");
		System.out.println("일반적인 가로형 직사각형 : "+c4+"개");
		System.out.println("일반적인 세로형 직사각형 : "+c5+"개");
	}

	void D06() {

		int c1=0, c2=0, c3=0, c4=0;
	
		for (int i=0; i<10; i++) {
			System.out.print("아파트의 분양 면적(제곱미터) : ");
			double area2 = s.nextDouble();
			double P = area2/3.305;
			System.out.println("아파트의 평형은 "+P+"입니다.");
			if (P <15)
				c1++;
			else if (P<30)
				c2++;
			else if (P<50)
				c3++;
			else
				c4++;
		}
		System.out.println("소형은 "+c1+"개 입니다.");
		System.out.println("중소형은 "+c2+"개 입니다.");
		System.out.println("중형은  "+c3+"개 입니다.");
		System.out.println("대형은  "+c4+"개 입니다.");
	}

	void D07() {
		System.out.print("1차함수 y=ax+b의 계수 a와 b를 입력하세요 : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.print("x좌표의 시작과 끝 값을 입력하세요 : ");
		int start = s.nextInt();
		int end = s.nextInt();
		for (int i=start; i<=end; i++) {
			System.out.println("좌표 ("+i+", "+(a*i+b)+")");
		}
	}

	void D08() {
		System.out.print("2차함수 y=ax^2+bx+c의 계수 a와 b와 c를 입력하세요 : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.print("x좌표의 시작과 끝 값을 입력하세요 : ");
		int start = s.nextInt();
		int end = s.nextInt();
		for (int i=start; i<=end; i++) {
			int value = (int) (a*Math.pow(i, 2)+b*i+c);
			System.out.println("좌표 ("+i+", "+value+")");
		}
	}

	void D09() {
		while(true) {
			System.out.print("원하는 구구단의 단(2~9) : ");
			int input = s.nextInt();
			if (input<10 && input>1) {
				for (int i=1; i<=9; i++) {
					System.out.println(input+" x "+i+" = "+input*i);
				}
				break;
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
	}

	void D10() {
		System.out.print("숫자 2개를 입력하세요 : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1; true; i++) {
			if(n1*i > 100)
				break;
			list.add(n1*i);
		}
		for (int i=1; true; i++) {
			if(n2*i > 100)
				break;
			if (list.contains(n2*i))
				list.remove(list.indexOf(n2*i));
			else
				list.add(n2*i);
		}
		Collections.sort(list);
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

//System.out.print("");






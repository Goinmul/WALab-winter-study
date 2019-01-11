package com.Bstep.java;

import java.util.Scanner;

public class Step_B {
	
	Scanner s = new Scanner(System.in);
	void B01(){
		System.out.print("태어난 년도 : ");
		int input = s.nextInt();
		int age = 2014 - input + 1;
		if (age <20)
			System.out.println("미성년자입니다.\n");
		else
			System.out.println("미성년자가 아닙니다.\n");
	}
	
	void B02() {
		System.out.print("온도 : ");
		double temp = s.nextDouble();
		System.out.print("섭씨이면 C, 화씨이면 F를 입력하세요 : ");
		String condition = s.next();
		if (condition.equalsIgnoreCase("C")) {
			System.out.println("변환된 온도는 "+ temp*1.8+32+"입니다.");
		}
		else if (condition.equalsIgnoreCase("F")) {
			System.out.println("변환된 온도는 "+ (temp-32)/1.8+"입니다.");
		}
		else
			System.out.println("온도의 종류가 잘못 입력되었습니다.\n");
	}
	
	void B03() {
		System.out.print("가로 : ");
		int width = s.nextInt();
		System.out.print("세로 : ");
		int height = s.nextInt();
		System.out.println("사각형의 넓이는 "+width*height+"이고,\n");
		if (width == height)
			System.out.println("이 사각형은 정사각형입니다.\n");
		else
			System.out.println("이 사각형은 정사각형이 아닙니다.\n");
	}
	
	void B04() {
		System.out.print("아파트의 분양 면적(제곱미터) : ");
		double area2 = s.nextDouble();
		double P = area2/3.305;
		System.out.println("아파트의 평형은 "+P+"이고,\n");
		if (P <30)
			System.out.println("30평 미만이므로 작은 아파트입니다.\n");
		else
			System.out.println("30평 이상이므로 큰 아파트입니다.\n");
	}
	
	void B05() {
		System.out.print("날 수를 입력하세요 : ");
		int days = s.nextInt();
		int second = days*24*60*60;
		int count = second/1000000;
		System.out.println("해당하는 기간은 "+second+"초입니다.");
		System.out.println("100만 초가 "+count+"번 포합됩니다.\n");
	}
	
	void B06() {
		System.out.print("국어 점수 : ");
		int kor = s.nextInt();
		System.out.print("영어 점수 : ");
		int eng = s.nextInt();
		System.out.print("수학 점수 : ");
		int math = s.nextInt();
		System.out.println("총점은 "+(kor+eng+math)+"이고, 평균은 "+(kor+eng+math)/3+"입니다.\n");
		if (kor>= 90)
			System.out.println("국어점수가 우수합니다.");
		if (eng>= 90)
			System.out.println("영어점수가 우수합니다.");
		if (math>= 90)
			System.out.println("수학점수가 우수합니다.");
	}
	
	void B07() {
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요 : ");
		int MB = s.nextInt();
		System.out.print("USB포트가 2.0이면 Y, 아니면 N을 입력하세요 : ");
		String usb2 = s.next();
		long bytes = MB*1024*1024;
		if (usb2.equalsIgnoreCase("Y"))
			System.out.println("파일 전송 시간은 "+bytes/60000000+"입니다.");
		else if (usb2.equalsIgnoreCase("N"))
			System.out.println("파일 전송 시간은 "+bytes/1500000+"입니다.");
		else
			System.out.println("Y와 N중 하나를 입력해야 합니다.\n");
	}
	
	void B08() {
		System.out.print("첫번째 숫자 : ");
		int f = s.nextInt();
		System.out.print("두번째 숫자 : ");
		int se = s.nextInt();
		System.out.print("세번째 숫자 : ");
		int t = s.nextInt();
		
		if (f==se || f==t || se==t)
			System.out.println("1) 적어도 두 수의 값이 같음.");
		if ((f>50&&se>50)||(f>50&&t>50)||(se>50&&t>50))
			System.out.println("2) 적어도 두 수의 크기가 50보다 크다.");
		if (f+se==t || f+t == se || se+t ==f)
			System.out.println("3) 두 수의 합이 나머지 하나와 같다.");
		if (f%se==0||f%t==0||se%f==0||se%t==0||t%f==0||t%se==0)
			System.out.println("4) 하나로 다른 두 수를 나누면 나누어 떨어지는 경우가 있다.");
	}
	
	void B09() {
		System.out.print("신장(cm) : ");
		int height = s.nextInt();
		System.out.print("체중(kg) : ");
		int weight = s.nextInt();
		int bmi = weight/((height/100)^2);
		if (bmi >=25)
			System.out.println("당신은 비만입니다.");
		else
			System.out.println("당신은 비만이 아니군요.");
	}

}

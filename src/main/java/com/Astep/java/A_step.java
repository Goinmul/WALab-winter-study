package com.Astep.java;


import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;
public class A_step {

	public void A01_1()
	{
		// Step A
		/*
		 * byte : -128 ~ 127 (2 to the power of 7)
		 * char : 2 byte
		 * short : 2 byte
		 * int : 4 byte
		 * float : 4 byte
		 * long : 8 byte
		 * double : 8 byte
		 */

		// getting max values (used when checking overflow)
		int a = Integer.MAX_VALUE;
		int b = (int) Long.MAX_VALUE;

		// converting char type to ASCII number
		char c = 'a';
		int c_ascii = (int) c;
		//System.out.print(c_ascii);

		// basic I/O
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter an integer : ");
		//int user_input = s.nextInt();

		String key = "a";
		while(key != "q")
		{
			System.out.print("Enter question number to execute(q for quit) : ");
			key = s.next().toLowerCase();

			switch(key)
			{

			case "1":
				/// [A01] 나이 계산
				System.out.println("[A01] 나이 계산");
				System.out.print("태어난 년도 : ");
				int birth_year =  s.nextInt();
				int age = LocalDateTime.now().getYear() - birth_year;
				System.out.println("당신의 나이는 "+age+" 살입니다.\n");
				break;

			case "2":
				/// [A02] 온도 변환
				System.out.println("[A02] 온도 변환");

				System.out.print("섭씨 온도를 입력하시오 : ");
				double c_degree = s.nextDouble();
				double f_degree = c_degree*(1.8) + 32.0;
				System.out.println("화씨 온도는 "+f_degree+"도 입니다.\n");
				break;

			case "3":
				/// [A03] 직사각형 넓이 계산
				System.out.println("[A03] 직사각형 넓이 계산");
				System.out.print("직사각형의 가로 크기 : ");
				int width = s.nextInt();
				System.out.print("직사각형의 세로 크기 : ");
				int height = s.nextInt();
				int area = width*height;
				System.out.println("직사각형의 넓이는 "+area+" 입니다.\n");
				break;

				/// [A04] 아파트 평형 계산
			case "4":
				System.out.println("[A04] 아파트 평형 계산");
				System.out.print("아파트 분양 면적 : ");
				double area_meter = s.nextDouble();
				double pyeong = area_meter/3.305;
				System.out.println("아파트의 평형은 "+pyeong+"입니다.\n");
				break;

				/// 5
			case "5":
				System.out.println("[A05] 날 수 계산");
				System.out.print("날 수를 입력하세요 : ");
				int days = s.nextInt();
				System.out.println("날 수에 해당하는 시간은 "+days*24*60*60+"초 입니다.\n");
				break;

				/// 6
			case "6":
				System.out.println("[A06] 점수 계산");
				System.out.print("국어 점수 : ");
				int kor = s.nextInt();
				System.out.print("영어 점수 : ");
				int eng = s.nextInt();
				System.out.print("수학 점수 : ");
				int math = s.nextInt();
				System.out.println("총점은 "+(kor+eng+math)+"이고, 평균은 "+(kor+eng+math)/3+"입니다.\n");
				break;
				
				/// 7
			case "7":
				System.out.println("[A07] 파일 용량 계산");
				System.out.print("파일 용량을 기가바이트 단위로 입력하세요 : ");
				long GB = s.nextLong();
				long MB = GB*1024;
				long KB = GB*1024*1024;
				long B = GB*1024*1024*1024;
				System.out.println("입력하신 파일 용량은 \n"+MB+" 메가바이트,\n"+KB+" 킬로바이트,\n"+B+" 바이트입니다.\n");
				break;

			case "q":
				System.out.println("quit program.\n");
				key = "q";
				break;

			default :
				System.out.println("input should be 1~7 or 'q'.\n");
			}

		}

	}

}



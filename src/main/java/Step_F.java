import java.util.Scanner;

public class Step_F {

	Scanner s = new Scanner(System.in);	

	public void F01() {
		int[] num = new int[10];
		for (int i=0; i<num.length; i++){ // iterate 10 times
			System.out.print(i+"th integer : ");
			num[i] = s.nextInt();
		}
		int first = num[0];
		int second = num[0];
		int first_index=0;
		int second_index=0;

		for (int i = 1; i<num.length; i++) {
			if (num[i]>first) {
				second = first;
				second_index = first_index;
				first = num[i];
				first_index = i;
			}
			else if(num[i]>second) {
				second = num[i];
				second_index = i;
			}
		}
		System.out.println("Second largest number is "+second_index+"th number "+second);
	}

	public void F02() {

		double[] score = new double[10];
		for (int i=0; i<score.length; i++){ // iterate 10 times
			System.out.print(i+"th score : ");
			score[i] = s.nextDouble();
		}
		double sum = score[0], max = score[0], min = score[0]; // initialize
		double average = 0.0;

		// find max and min index
		for (int i=1; i<score.length; i++) {
			sum = sum + score[i];
			if (score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}
		//if (max == min)	// no need for this, since the problem said 8 numbers
		//	sum = sum - (max);
		sum = sum - (max + min);
		average = sum/8;
		System.out.println("Average excluding largest and smallest score : "+average);

	}

	public void F03() {

		int score[][] = new int[5][3]; // data
		int sum[] = new int[3]; // each average
		double average[] = new double[3];
		for (int i=0; i<score.length; i++) { // score.length == 5
			System.out.print(i+"th student Korea, English, Math score : ");
			score[i][0] = s.nextInt();
			score[i][1] = s.nextInt();
			score[i][2] = s.nextInt();
		}
		for (int i =0; i<sum.length; i++) {
			for (int j=0; j<score.length; j++) {
				sum[i] += score[j][i];
			}

		}
		for (int j=0; j<sum.length; j++) {
			average[j] = sum[j]/score.length;
		}
		System.out.println("Korean sum : "+sum[0]+", average : "+average[0]);
		System.out.println("English sum : "+sum[1]+", average : "+average[1]);
		System.out.println("Math sum : "+sum[2]+", average : "+average[2]);
	}

	public void F04() {

		int score[][] = new int[5][3]; // data
		int sum[] = new int[5]; // each average
		double average[] = new double[5];
		for (int i=0; i<score.length; i++) { // score.length == 5
			System.out.print(i+"th student Korea, English, Math score : ");
			score[i][0] = s.nextInt();
			score[i][1] = s.nextInt();
			score[i][2] = s.nextInt();
		}

		for (int i =0; i< score.length; i++) {
			for (int j=0; j< 3; j++) {
				sum[i] += score[i][j];
			}
		}
		for (int j=0; j<score.length; j++) {
			average[j] = sum[j]/3;
			System.out.println(j+"th student sum : "+sum[j]+", average : "+average[j]);
		}


	}

	public void F05() {
		int list[][] = new int[10][3]; // height, weight, BMI
		int population = list.length;
		try {
			for (int i=0; i<population; i++) {
				System.out.print(i+"th person height(cm) and weight(kg) : ");
				list[i][0] = s.nextInt();
				list[i][1] = s.nextInt();
				list[i][2] = list[i][1]/((list[i][0]/100)^2); // BMI
			}
		}catch (Exception e) {
			System.out.println(e); // division by zero
		}

		for (int i=0; i<population; i++) {
			if (list[i][2] > 25)
				System.out.println(i+"th person is overweight.");
		}

	}

	public void F06() {

		int number[][] = new int[5][3];
		int population= 0 ;
		for (int i=0; i<5 ;i++) {
			for(int j=0; j<3; j++) {
				number[i][j] = (i+1)*100 + j+1; // address number
				System.out.print(number[i][j]+"'s population : ");
				population += s.nextInt();
			}
		}
		System.out.println("Total population is "+population);
	}

	public void F07() {

		int number[][] = new int[5][3];
		int population= 0 ;
		for (int i=0; i<5 ;i++) {
			for(int j=0; j<3; j++) {
				//(i+1)*100 + j+1; // address number
				System.out.print(((i+1)*100 + j+1)+"'s population : ");
				number[i][j] = s.nextInt();
			}
		}
		int[] floor = new int[5];
		for (int i =0; i<5; i++) {
			for (int j=0; j<3; j++) {
				floor[i] += number[i][j];
			}
			System.out.println((i+1)+"th floor population : "+floor[i]);
		}
		int[] line = new int[3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				line[i] += number[j][i];
			}
			System.out.println((i+1)+"th line population : "+line[i]);
		}

	}

	public void F08() {
		
		int number[] = new int[10];
		int input, index=0;
		
		while(index<10) {
			boolean flag = false;
			System.out.print("integer 1~100 : ");
			input = s.nextInt();
			for (int i=0; i<index+1; i++) { // redundancy check
				if (number[i]==input)
					flag = true;
			}
			if ((input >= 1 && input<=100) && !flag) {
				number[index] = input;
				index++;
			}
			else
				System.out.println("Wrong input. Retry.");
		}
		for(int i=0; i<number.length; i++) {
			System.out.println((i+1)+"th number is "+number[i]);
		}
	}

	public void F09() {
		
		int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days = 0;
		System.out.print("month : ");
		int month = s.nextInt();
		
		System.out.print("date : ");
		int date = s.nextInt();
		
		if ((month>12 || month<1)||(date>31||date<1)) {
			System.out.println("Wrong input.");
			System.exit(1);
		}
		for(int i=0; i<month-1; i++) {
			days += monthdays[i];
		}
		days += date;
		System.out.println("it is "+ days +"th day in a year.");

	}
	
}

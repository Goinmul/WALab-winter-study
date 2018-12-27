import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Step_J {

	Scanner s = new Scanner(System.in);

	// J01 says use this method to print the result. Then, there is no need for input parameter.
	int askAge(int birthyear) {

		ArrayList<Integer> ages = new ArrayList<Integer>();	// used ArrayList, for the case where input is way less than 100.
		int age=0, year=0;
		int baby=0, child=0, teen=0, youth=0, adult = 0, senior =0;

		for (int i=0; i<100; i++) {
			if (year>Year.now().getValue())
				break;
			System.out.print("birth year : ");
			year = s.nextInt();
			age = Year.now().getValue() - year +1;
			ages.add(age);
			if (age >=60)
				senior++;
			else if (age>=30)
				adult++;
			else if (age>=20)
				youth++;
			else if (age>=13)
				teen++;
			else if (age>=7)
				child++;
			else if(age>=0)
				baby++;
		}
		for (int i=0; i< ages.size(); i++)
			System.out.println((i+1)+"th person's age : "+ages.get(i));
		System.out.println("Below are baby, children, teen, youth, adult, senior population.");
		System.out.println(baby+", "+child+", "+teen+", "+youth+", "+adult+", "+senior);

		return 0;
	}

	// J02
	double max(double num[]) {
		double max = num[0];
		for (int i=1; i<num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		return max;
	}
	double min(double num[]) {
		double min = num[0];
		for (int i=1; i<num.length; i++) {
			if (num[i] < min)
				min = num[i];
		}
		return min;
	}

	// J03
	byte askWater(double degree) {
		if (degree>=80) {
			System.out.println("boiling.");
			return 3;
		}
		else if (degree>=40) {
			System.out.println("hot.");
			return 2;
		}
		else if (degree>=25) {
			System.out.println("warm.");
			return 1;
		}
		else {
			System.out.println("cold.");
			return 0;
		}
	}

	// J04
	int calDate(int month, int date) {
		
		int days = 0;
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if ((month>12 || month<1)||(date>31||date<1)) {
			System.out.println("wrong month or date.");
			System.exit(1);
		}
		for(int i=0; i<month-1; i++) {
			days += monthdays[i];
		}
		days += date;
		return days;
	}
	
	// J05
	int calParking(int startHour, int startMin, int endHour, int endMin) {
		
		int total_minute = (endHour*60 + endMin)-(startHour*60 + startMin) ;
		int charge = ((total_minute)/10) * 500;
		if (total_minute%10 != 0)
			charge += 500;
		
		return charge;
	}
	
	// J06
	int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	// J07
	int powerOfTwo(int n) {
		
		if (n ==0)
			return 1;
		else
			return powerOfTwo(n-1)*2;
	}
	
	// J08
	int ackermann(int i, int j) {
		
		if (i==0 && j>=0)
			return j+1;
		
		else if (i>0 && j ==0)
			return ackermann(i-1, 1);
		
		else if (i>0 && j>0)
			return ackermann(i-1, ackermann(i,j-1));
		
		else {
			System.out.println("not an ackermann case."); // should never reach here.
			return 0;
		}
		
	}
	
	// J09
	int power(int num1, int num2) {
		if (num2 ==0)
			return 1;
		else if (num2 == 1)
			return num1;
		else if (num2 >1 && num2%2==0)
			return power(num1, num2/2)*power(num1, num2/2);
		else if (num2 >1 && num2%2==1)
			return (power(num1, num2/2)*power(num1, num2/2))*num1;
		else {
			System.out.println("cannot calculate."); // should never reach here.
			return 0;
		}
	}
	
	// J10
	double goldenRatio(int n) {
		// when printing, use : System.out.printf("%.5f", return_value);
		return (double)this.fibo(n+1)/(double)this.fibo(n);
	}

}
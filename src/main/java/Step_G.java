import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step_G {

	Scanner s = new Scanner(System.in);

	public void G01() {

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
	}

	public void G02() {

		class Temperature{
			double temp = 0.0;
			String state;
		}

		String degree_name[] = {"cold", "warm", "hot", "boiling"};

		ArrayList<Temperature> list = new ArrayList<Temperature>();
		//double[] list = new double[10];

		int[] count = {0,0,0,0};
		double input =0;

		for (int i=0; i<10; i++) {
			System.out.print((i+1)+"th water temperature in celcious : ");
			input = s.nextDouble();
			Temperature t = new Temperature();
			t.temp = input;

			if (input>=80) {
				t.state = "boiling";
				count[3]++;
			}
			else if (input>=40) {
				t.state = "hot";
				count[2]++;
			}
			else if (input>=25) {
				t.state = "warm";
				count[1]++;
			}
			else {
				t.state = "cold";
				count[0]++;
			}
			list.add(t);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.println((1+i)+"th water : "+list.get(i).temp+", and is "+list.get(i).state);
		}
		System.out.println("Below are cold, warm, hot, boiling counts.");
		for (int i=0; i<4; i++) {
			System.out.print(count[i]+" ");
		}
	}

	public void G03() {

		class Student {
			int[] score = new int[3];
			double average;
			char grade;
		}

		List<Student> list = new ArrayList<Student>(5);
		for (int i=0; i<5; i++) { // five students

			Student stu = new Student();
			double average = 0.0;
			System.out.print((i+1)+"th student's Korean, English, Math score : ");

			for (int j=0; j<3; j++) {
				int score = s.nextInt();
				stu.score[j] = score;
				average += score;
			}
			stu.average= average/3;
			if (stu.average>=90)
				stu.grade='A';
			else if (stu.average>=80)
				stu.grade='B';
			else if (stu.average>=70)
				stu.grade='C';
			else if (stu.average>=60)
				stu.grade='D';
			else
				stu.grade ='F';
			list.add(stu);
		}
		double Kor = 0.0, Eng = 0.0, Math= 0.0;
		for(int i=0; i<list.size();i++) {
			Kor += list.get(i).score[0];
			Eng += list.get(i).score[1];
			Math += list.get(i).score[2];
		}
		System.out.println("Korean total score : "+Kor+", average : "+Kor/list.size());
		System.out.println("English total score : "+Eng+", average : "+Eng/list.size());
		System.out.println("Math total score : "+Math+", average : "+Math/list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println((i+1)+"th student total score : "+list.get(i).average*3+", average : "+list.get(i).average+", grade : "+list.get(i).grade);
		}

	}

	public void G04() {

		int key = -1;
		int price = 0;
		double charge = 0.0;
		while (key != 0) {
			System.out.print("1:buy, 2:rent, 0:exit : ");
			key = s.nextInt();
			if (key == 1) { // buy
				System.out.print("price : ");
				price = s.nextInt();
				if (price >= 200000000)
					charge += price*0.004;
				else if (price >= 50000000)
					if (price*0.004>800000)
						charge += 800000;
					else
						charge += price*0.005;
				else {
					if (price*0.006>250000)
						charge += 250000;
					else
						charge += price*0.006;
				}
			}
			else if (key ==2) { // rent
				System.out.print("price : ");
				price = s.nextInt();
				if (price >= 100000000)
					charge += price*0.003;
				else if (price >= 50000000)
					if (price*0.004>300000)
						charge += 300000;
					else
						charge += price*0.004;
				else if (price>=20000000) {
					if (price*0.005 > 200000)
						price += 200000;
					else
						price += price*0.005;
				}
				else {
					if (price*0.005>70000)
						charge += 70000;
					else
						charge += price*0.005;
				}

			}
			else if (key == 0) {
				System.out.println("total charge : "+charge);
			}

		}

	}

	public void G05() {

		int hour=-1, minute=-1;
		double total_charge=0.0;
		while (true) {
			System.out.print("hour and minute : ");
			hour = s.nextInt();
			minute = s.nextInt();
			if(hour==0&&minute==0)
				break;
			
			int time = hour*60 + minute; // total time in minutes
			double charge = (time/30)*1000;
			if (time%30 != 0)
				charge += 1000;
			
			if(time >= 300) 
				charge *= 0.8;
			else if(time>=180)
				charge *=0.9;
			else if (time>=120)
				charge *=0.95;
			
			total_charge += charge;
		}
		System.out.println("total charge : "+total_charge);
	}

	public void G06() {
		
		int[] order = {0,0,0};
		int[] total = {0,0,0};
		int sale = 0;
		
		while(true) {
			System.out.print("number of 1th product : ");
			order[0] = s.nextInt();
			System.out.print("number of 2th product : ");
			order[1] = s.nextInt();
			System.out.print("number of 3th product : ");
			order[2] = s.nextInt();
			if (order[0]==0 && order[1]==0 && order[2]==0)
				break;
			int temp=0;
			for (int i=0; i< order.length; i++) {
				if (i==0)
					temp += order[i]*10000;
				else if (i==1)
					temp += order[i]*6000;
				else
					temp += order[i]*3000;
			}
			System.out.println("charge is "+temp+" won."+'\n');
			for(int i=0; i<order.length; i++) { // accumulate total number
				total[i] += order[i];
			}
		}
		for (int i=0; i< total.length; i++) {
			if (i==0)
				sale += total[i]*10000;
			else if (i==1)
				sale += total[i]*6000;
			else
				sale += total[i]*3000;
		}
		System.out.println("1th : "+total[0]+", 2th : "+total[1]+", 3th : "+total[2]+".");
		System.out.println("total sale : "+sale);
	}

	public void G07() {
		class Team{
			int child=0,teen =0,adult=0,senior=0;
			int card =0;
		}
		System.out.print("# of teams : ");
		int num_teams = s.nextInt();
		List<Team> list = new ArrayList<Team>();
		
		double total_fee = 0.0;
		int total_people = 0;
		
		for (int i=0; i< num_teams; i++) {
			Team t = new Team();
			double fee = 0.0;
			System.out.print((i+1)+"th team composition(child, teen, adult, senior) : ");
			t.child = s.nextInt();
			t.teen = s.nextInt();
			t.adult = s.nextInt();
			t.senior = s.nextInt();
			
			System.out.print((i+1)+"th team card(no card:0, normal:1, vip:2) : ");
			t.card = s.nextInt();
			list.add(t);
			
			// calculating charge
			fee = t.child*5000 + t.teen*10000 + t.adult*15000 + t.senior*3000;
			if (t.card == 1)
				fee *= 0.9;
			else if (t.card == 2)
				fee *= 0.8;
			System.out.println("fee : "+fee);
			total_fee += fee;
		}
		//calculating number of people
		int children=0, teens =0, adults=0, seniors=0;
		for (int i=0; i< list.size(); i++) {
			children += list.get(i).child;
			teens += list.get(i).teen;
			adults += list.get(i).adult;
			seniors += list.get(i).senior;
		}
		System.out.println("total people visited : "+(children+teens+adults+seniors));
		System.out.println("chlidren : "+children);
		System.out.println("teens : "+teens);
		System.out.println("adults : "+adults);
		System.out.println("seniors : "+seniors);
		System.out.println("total charge : "+total_fee);
	}
}

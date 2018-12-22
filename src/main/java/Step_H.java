import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Step_H {

	Scanner s = new Scanner(System.in);
	Random g = new Random();

	public void H01() {

		int answer = g.nextInt(100)+1; // 1 ~ 100
		int num_try = -1, count =0;

		while(true) {
			System.out.print("1~100 : ");
			num_try = s.nextInt();
			count++;

			if(num_try > answer)
				System.out.println("try a smaller number.");
			else if (num_try < answer)
				System.out.println("try a larger number.");
			else
				break;
		}
		System.out.println(count+"th trial.");

	}

	public void H02() {

		int lotto[] = new int[6];
		String key = "Y";
		while(key.equalsIgnoreCase("Y")) {
			for (int i=0; i<6; i++) {
				int num = g.nextInt(45)+1; // 1 ~ 45
				lotto[i] = num;
			}
			System.out.println("generated : "+ Arrays.toString(lotto)); // for a nested array : Arrays.deepToString(array_name);
			System.out.print("generate more? (Y/N) : ");
			key = s.next();
		}
	}

	public void H03() {

		int[] answer = new int[6];
		// randomly generating 6 numbers.
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		for (int i=0; i<45; i++) {
			list.add(i+1);
		}
		Collections.shuffle(list);
		for (int i=0; i<answer.length; i++) {
			answer[i] = list.get(i); // randomly gets six numbers.
		}

		int count =0;
		ArrayList<Integer> user = new ArrayList<Integer>();
		while (user.size() < answer.length) {
			System.out.print((count+1)+"th number : ");
			int input = s.nextInt();
			if (count > 0 && user.contains(input)) {
				System.out.println("redundant number.");
				continue;
			}
			user.add(input);
			count++;
		}
		System.out.println("lotto number is "+Arrays.toString(answer));

	}

	public void H04() {

		int com=0, user=-1;
		int score[][] = new int[2][3]; //0th row = computer, 1th row = user
		while (user != 0) {
			com = g.nextInt(3)+1; // 1~3
			System.out.print("가위(1), 바위(2), 보(3) : ");
			user = s.nextInt();

			// computer wins
			if (user+1 == com || user-com == 2) {
				System.out.println("computer wins!");
				score[0][0]++; // computer wins
				score[1][2]++; // user loses
			}

			else if (com+1 == user || com-user == 2) {
				System.out.println("you win!");
				score[0][2]++; // computer loses
				score[1][0]++; // user wins
			}
			else
			{	// both draw
				System.out.println("draw.");
				score[0][1]++;
				score[1][1]++;
			}
		}
		System.out.println("computer/user [win, draw, lose] : "+Arrays.deepToString(score));
	}

	public void H05() {

		System.out.print("put coins : ");
		int coins = s.nextInt();
		int input = -1;

		for(int i=0; coins>0; i++) {

			int number[] = {g.nextInt(9)+1, g.nextInt(9)+1, g.nextInt(9)+1};
			System.out.print((i+1)+"th game. Enter a number(1~10) : ");
			input = s.nextInt();

			int count =0;
			for(int j=0; j<number.length; j++) {
				if(number[j] == input)
					count++;
			}
			if (count == 2) {
				System.out.println("2 numbers match. +2 coins.");
				coins +=2;
			}
			else if (count ==3) {
				System.out.println("3 numbers match. +4 coins.");
				coins += 4;
			}
			else {
				System.out.println("mismatch..");
				coins--;
			}
			System.out.println(coins+" coins left.");
		}
		System.out.println("end game.");

	}

	public void H06() {

		int number[] = new int[5];
		for (int i =0; i<number.length; i++) {
			System.out.print((i+i)+"th integer : ");
			number[i] = s.nextInt();
		}
		Arrays.sort(number);
		double largest = Math.pow(number[3], number[4]);
		System.out.println("largest number : "+number[3]+"^"+number[4]+" : "+(int)largest);
		double smallest =0.0;
		if (Math.pow(number[0], number[1]) > Math.pow(number[1], number[0])) {
			smallest = Math.pow(number[1], number[0]);
			System.out.println("smallest number : "+number[1]+"^"+number[0]+" : "+(int)smallest);
		}
		else {
			smallest = Math.pow(number[0], number[1]);
			System.out.println("smallest number : "+number[0]+"^"+number[1]+" : "+(int)smallest);
		}
	}

	public void H07() {

		String key = "";
		while(true) {

			System.out.print("enter string : ");
			key = s.nextLine();
			if (key.equalsIgnoreCase("x"))
				break;
			System.out.println("string length : "+key.length());
			for (int i=0; i<key.length(); i++) {
				System.out.println(key.charAt(i));
			}
		}
		System.out.println("exit program.");
	}

	public void H08() {

		String key = "";
		String find ="";
		String replace = "";
		while(true) {

			System.out.print("enter string : ");
			key = s.nextLine();
			if (key.equalsIgnoreCase("x"))
				break;
			System.out.print("enter string to be replaced : ");
			find = s.nextLine();
			System.out.print("enter string to replace with : ");
			replace = s.nextLine();
			
			int count =0;
			while (key.contains(find)) {
				key = key.replaceFirst(find, replace);
				count++;
			}
			
			System.out.println("there were "+count+" changes.");
			System.out.println("modified string : "+key+'\n');
			
		}
		System.out.println("exit program.");
	}

	public void H09() {
		// input is like : Peter|male###Esther|female### ...
		String input ="";
		List<String> users = new ArrayList<String>();
		List<String> info = new ArrayList<String>();

		while(true) {
			System.out.print("enter string : ");
			input = s.nextLine();
			if (input.equalsIgnoreCase("x")) {
				System.out.println("exit program.");
				break;
			}
			/*
			// 1) using Regex (more general and widely usable than split method)
			Pattern p = Pattern.compile("(.+)\\|(.+)#{3}"); // better to be put outside the loop.
			Matcher m = p.matcher(input);
			boolean isMatch = m.matches();
			
			String name = m.group(1); // group(0) is whole string itself.
			String sex = m.group(2);
			if (isMatch) {
				users.add(name);
				info.add(sex);
			}
			else
				System.out.println("wrong format input.");
			*/
			
			// 2) using split
			String[] list = input.split("###");
			for (int i=0; i<list.length; i++) {
				String[] name_sex = list[i].split("\\|");
				users.add(name_sex[0]);
				info.add(name_sex[1]);
			}
		}
		System.out.println("total "+users.size()+" people enlisted.");
		for (int i=0; i<users.size(); i++) {
			System.out.print((i+1)+" "+users.get(i)+" "+info.get(i)+'\n');
		}
		
	}
	
}

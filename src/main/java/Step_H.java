import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

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
		
	}
}

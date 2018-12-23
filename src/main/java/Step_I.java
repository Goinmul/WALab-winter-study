import java.util.Random;
import java.util.Scanner;

public class Step_I {

	Scanner s = new Scanner(System.in);
	
	// I01
	void showMenu() {
		
		int price=0;
		while (true) {
			System.out.println("1. pizza(15$), 2. spaghetti(10$), 3. salad(7$), 4. drink(2$), 5. quit");
			System.out.print("choose a menu : ");
			int menu = s.nextInt();
			if (menu == 1)
				price += 15;
			else if (menu == 2)
				price+=10;
			else if (menu == 3)
				price +=7;
			else if (menu == 4)
				price +=2;
			else if (menu == 5) {
				System.out.println("total price : "+price);
				break;
			}
			else
				System.out.println("wrong menu number.");
		}
	}

	// I02
	String createBlank(int number) { // sub method
		String BLANK = "";
		for (int i=0; i<number; i++)
			BLANK += " ";
		return BLANK;
	}
	void printCharWithBlank(int blank, int size) { // main method
		
		String line = createBlank(blank);
		for (int i =0; i<size ; i++) {
			String each_line = line + createBlank(size-(i+1));
			System.out.print(each_line);
			for (int j= 0; j<i+1;j++)
				System.out.print('*');
			System.out.println();
		}
		
	}
	
	// I03
	void obesity(int height, int weight) {
		
		double measure = weight/((height/100)^2);
		if (measure >= 30)
			System.out.println("Higher obesity.");
		else if (measure >=25)
			System.out.println("Obesity.");
		else if (measure >= 23)
			System.out.println("Overweight.");
		else if (measure > 18.5)
			System.out.println("Normal.");
		else
			System.out.println("Underweight.");
		
	}
	
	//I04
	int SelectMenu(int menu) {
		
		if (menu == 1)
			return 15000;
		else if (menu == 2)
			return 10000;
		else if (menu == 3)
			return 7000;
		else if (menu == 4)
			return 2000;
		else if (menu == 5)
			return -1;
		else
			return 0;
	}
	
	//I05
	int maxOfTen() {
		int max = Integer.MIN_VALUE, temp = -1;
		for (int i=0; i<10; i++) {
			System.out.print((i+1)+"th number : ");
			temp = s.nextInt();
			if (temp > max)
				max = temp;
		}
		System.out.println("max : "+max);
		return max;
		
	}
	
	byte getRandom() {
		System.out.println("create 10 numbers.");
		Random r =new Random();
		int large=0, medium=0, small=0;
		for (int i=0; i<10;i++) {
			int random = r.nextInt(100)+1;
			System.out.println(random + " is created.");
			if (random>=70)
				large++;
			else if (random>=40)
				medium++;
			else
				small++;
		}
		System.out.println("large(70~100) : "+large);
		System.out.println("medium(40~70) : "+medium);
		System.out.println("small(40~1) : "+small);

		return 0;
	}

	int selectCan() {
		int choice = -1, price =0, count = 0;
		String exit = "Y";
		while(true) {
			System.out.println("1. coke(700), 2. coffee(300), 3. lemon juice(1000)\n4. red tea(500), 5. cocoa(600)");
			System.out.print("choose a menu : ");
			count++;
			choice = s.nextInt();
			if (choice == 1)
				price += 700;
			
			else if (choice == 2)
				price += 300;
			
			else if (choice == 3)
				price += 1000;
			
			else if (choice == 4)
				price += 500;
			
			else if (choice == 5)
				price += 600;
			else
				System.out.println("wrong input.");
			System.out.print("more?(Y/N) : ");
			exit = s.next();
			if (exit.equalsIgnoreCase("N")) {
				System.out.println("total "+count+" drinks' price : "+price+" won.");
				break;
			}
		}
		return 0;
	}
}

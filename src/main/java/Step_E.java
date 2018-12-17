import java.util.Scanner;

public class Step_E {

	// printing a half triangle.
	Scanner s = new Scanner(System.in);
	public void E01() {
		System.out.print("length : ");
		int length = s.nextInt();
		for (int i =0; i< length; i++)
		{
			for (int j = 0; j< length; j ++)
				System.out.print("# ");
			System.out.println();
		}
	}

	public void E02 ()	
	{
		int height, blank;

		System.out.print("Height : ");
		height = s.nextInt();
		System.out.print("Left blank : ");
		blank = s.nextInt();

		for (int i=0; i<height; i++)
		{
			// print blank(constant)
			for (int j=0; j< blank; j ++)
				System.out.print(' ');

			// print blank and asterisk
			for (int j=height-1-i ; j>-1 ; j-- ) // 19 ~ 0
				System.out.print(' ');

			for (int j = 0; j < i+1; j++) // 1 ~ 20
				System.out.print('*');
			System.out.println("");
		}

	}

	public void E03 () {
		System.out.print("Height : ");
		int height = s.nextInt();
		//char[] line = new char[height]; // could be easier if array used

		for(int i =0; i<height; i++) { // if height == 10, 'i' is 0 ~ 10
			for (int j =(height)-1; j>i; j--) // previous blanks. 9, 8, ... ,1
				System.out.print(' ');

			for (int j = 1; j<(i+1)*2; j++) // asterisk. 1, 3, 5, ...
				System.out.print('*');

			for (int j =(height)-1; j>i; j--) // afterward blanks. 9, 8, 7, ...
				System.out.print(' ');
			System.out.println();
		}

	}
	
	public void E04 () throws Exception {
		int i,j;
		System.out.print("Result(1:odd, 2:even) : ");
		int mode = s.nextInt();
		if (mode != 1 && mode!= 2)
			throw new Exception("input number should be 1 or 2.");
		for (i=2; i<10; i++) {
			if (mode == 1 && i%2==0)
				continue;
			if (mode == 2 && i%2==1)
				continue;
			for(j =1; j<10; j++) {
				System.out.print(i+" x "+j+" = "+i*j+'\t');
				if (j%3==0)
					System.out.println();
			}
			System.out.println();
		}

	}

	public void E05 () throws Exception {
		int i,j;
		System.out.print("Result(1:odd, 2:even) : ");
		int mode = s.nextInt();
		System.out.print("Column size : ");
		int col = s.nextInt();

		if (mode != 1 && mode!= 2)
			throw new Exception("input number should be 1 or 2.");
		for (i=2; i<10; i++) {
			if (mode == 1 && i%2==0)
				continue;
			if (mode == 2 && i%2==1)
				continue;
			for(j =1; j<10; j++) {
				System.out.print(i+" x "+j+" = "+i*j+'\t');
				if (j%col==0)
					System.out.println();
			}
			System.out.println();
		}

	}

	public void E06 () throws Exception {
		System.out.print("Row size : ");
		int row = s.nextInt();
		System.out.print("Column size : ");
		int col = s.nextInt();
		if (row <0 || col<0)
			throw new Exception("row and column should be larger than 0.");
		int i,j, number;
		for (i=1; i<=row; i++) {
			for(j=1;j<=col;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}

import java.util.Scanner;

public class E01 {

	// printing a half triangle.
	Scanner s = new Scanner(System.in);
	public void E02 ()	
	{
		int height, blank;
		/*
		System.out.print("Height : ");
		height = s.nextInt();
		System.out.print("Left blank : ");
		blank = s.nextInt();
		 */

		height = 20;
		blank = 10;
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

}

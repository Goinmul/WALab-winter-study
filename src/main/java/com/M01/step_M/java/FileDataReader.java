package com.M01.step_M.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDataReader {

	ArrayList<Menu> lineBylineReader(String fileName) throws IOException{

		// main data structure
		ArrayList<Menu> savedMenu = new ArrayList<Menu>();

		// instantiate
		BufferedReader reader = new BufferedReader(new FileReader(new File(fileName))); 

		// read line by line
		String line = null;
		int count=0;
		while ((line = reader.readLine())!=null)
		{
			System.out.println(line); // just to check

			// verify if each line matches menu format, then parse.
			Pattern p = Pattern.compile("(.+)\\s+(.+)\\s+(.+)\\s+(.+)");
			Matcher m = p.matcher(line);
			boolean b = m.matches();

			// if it matches the format, parse data
			if (b) {
				// group(1) is the index
				String menuName = m.group(2);
				String origin = m.group(3);
				String price = m.group(4);
				savedMenu.add(new Menu(menuName,origin,price));
			}
			else
				count++;
		}
		// must free the resources.
		reader.close();
		if (count>0)
			System.out.println("lines mismatching format : "+count);
		// return menus in the file, in a data form which is easy to process
		return savedMenu;
	}
}

/*
// file reading using Scanner class.
// instantiate Scanner class, and read file using that instance
		Path file_path = Paths.get(fileName);
		Scanner scanner = new Scanner(file_path);

		// read line by line
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			
			// parse
			Pattern p = Pattern.compile("(.+)\\s+(.+)\\s+(.+)\\s+(.+)");
			Matcher m = p.matcher(line);
			boolean b = m.matches();

			if (b) {
				// group(1) is the index
				String menuName = m.group(2);
				String origin = m.group(3);
				String price = m.group(4);
				savedMenu.add(new Menu(menuName,origin,price));
			}
		}
		// must free the resources.
		scanner.close();
 */

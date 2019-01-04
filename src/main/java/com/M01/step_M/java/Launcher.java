package com.M01.step_M.java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {

	// designed to hold data while interacting with user
	// after user has finished putting data, write the data on a file
	public void launcher() {

		// instantiate
		FileDataReader reader = new FileDataReader();
		FileDataWriter writer = new FileDataWriter();
		Menu menu = new Menu();
		Scanner s = new Scanner(System.in);

		// data structure
		ArrayList<Menu> list = new ArrayList<Menu>();

		// user interface starts from this line

		// file reading 
		while(true) {
			System.out.print("is there an existing menu file data? (Y/N) : ");
			String fileExistence = s.nextLine();

			if (fileExistence.equalsIgnoreCase("Y")) {
				System.out.print("enter file path : ");

				String filePath = s.nextLine();
				File file = new File(filePath);
				if (file.canRead()) {
					try {
						list = reader.lineBylineReader(filePath);
						System.out.println("file is succesfully read.");
					} catch (IOException e) {
						System.out.println(e);
						//e.printStackTrace(); //personally prefer print e object itself
					}
					break;
				}
			}
			else if (fileExistence.equalsIgnoreCase("N")) {
				break;
			}
			else
				System.out.println("wrong input.");
		}

		// mostly, menu class is used
		int input = 0;
		String bufferClear;
		while(true) {
			System.out.print("1)add 2)modify 3)delete 4)show list 5)quantity 6)exit : ");
			input = s.nextInt();
			bufferClear = s.nextLine(); // (1)
			//s.skip("[\\r\\n]"); // another way to clear buffer. (precisely, ignore enter key)

			if (input == 1) {
				menu.listAdder(list);
				System.out.println();
			}
			else if (input == 2) {
				menu.listModifier(list);
				System.out.println();
			}
			else if (input == 3) {
				menu.listRemover(list);
				System.out.println();
			}
			else if (input ==4 ) {
				menu.menuPrinter(list);
				System.out.println();
			}
			else if (input==5) {
				menu.menuQuantityViewer(list);
				System.out.println();
			}
			else if (input == 6) {
				break;
			}
			else
				System.out.println("wrong input.");
		}

		// file writing
		System.out.print("save data before exit program? (Y/N) : ");
		String saveOrNot = s.nextLine();
		while(true) {
			if (saveOrNot.equalsIgnoreCase("Y")) {

				if (list.size()>0) {
					System.out.print("enter path to save the data : ");
					String fileToSave = s.nextLine();
					try {
						writer.fileWriter(fileToSave, list);
						System.out.println("file successfully saved.");
					} catch (IOException e) {
						System.out.println(e);
						//e.printStackTrace();
					}
					break;
				}
				else {
					System.out.println("no data to write(menu empty).");
					break;
				}

			}
			else if (saveOrNot.equalsIgnoreCase("N"))
				break;
			else
				System.out.println("wrong input.");
		}
	}
}

package com.M01.step_M.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileDataWriter {
	
	void fileWriter(String path, ArrayList<Menu> list) throws IOException {
		
		Menu menu = new Menu();
		BufferedWriter out = new BufferedWriter(new FileWriter(path));
		
		// at first, tried using System.getProperty, for the case of difference between OS.
		// String proceedLine = System.getProperty("line.seperator").toString();
		// somehow it didn't work, so i just added "\r\n" at below for-each loop.
		// however, this only works on Windows OS, therefore it would be more versatile code to use System.getProperty.
		for(String line : menu.menuAsString(list)) {
			line = line + "\r\n";
			out.write(line);
		}
		out.close();
	}

}

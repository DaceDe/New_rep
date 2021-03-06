package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

	/*
	 * TODO Implement method that takes path to file as a parameter And copies
	 * whole contents of the file to the same location but with a new file name:
	 * <old_file_name>_backup e.g. if file is data.txt copy should be named
	 * data.txt_backup
	 */
	public void copyFile(String filePath) {

		try {
			List<String> Lines = Files.readAllLines(Paths.get(filePath));
			System.out.println(Lines);

			Files.write(Paths.get(filePath + "_backup"), Lines);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		File file = new File("src/main/resources/data.json");
		System.out.println("Reading form " + file.getAbsolutePath());
		new FileCopy().copyFile("src/main/resources/data.json");
	}

}

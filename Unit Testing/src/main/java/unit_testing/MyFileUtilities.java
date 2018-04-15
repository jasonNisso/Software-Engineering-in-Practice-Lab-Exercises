package unit_testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileUtilities {
	//Reads a file that contains grades and returns its content in an integer array
	public int[] readFile(String filepath) throws FileNotFoundException {
		//ArrayList<Integer> grades = new ArrayList<Integer>();
		int[] grades = null;
		int size = 0;
		try {
			//Scan the file in the filepath path
			Scanner scanner = new Scanner(new File(filepath));

			int i = 0;
			//This is a way to get the file's length(size in lines) 
			while(scanner.hasNextInt())
			{
			   //  grades[i++] = scanner.nextInt();
				size += 1;
			}
			scanner = new Scanner(new File(filepath));
			grades = new int[size];
			//read each grade and append it to the grades arrray
			while(scanner.hasNext()) {
				grades[i++] = scanner.nextInt();
			}
			scanner.close();
		} catch(IllegalArgumentException e) {

			System.out.println("Error while reading the file");

		    }
		return grades;
		}
	}

package unit_testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileUtilities {

	public int[] readFile(String filepath) throws FileNotFoundException {
		//ArrayList<Integer> grades = new ArrayList<Integer>();
		int[] grades = null;
		int size = 0;
		try {
			Scanner scanner = new Scanner(new File(filepath));

			int i = 0;
			while(scanner.hasNextInt())
			{
			   //  grades[i++] = scanner.nextInt();
				size += 1;
			}
			scanner = new Scanner(new File(filepath));
			grades = new int[size];

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

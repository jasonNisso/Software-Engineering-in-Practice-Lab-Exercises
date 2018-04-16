package unit_testing;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileUtilities {
	//Reads a file that contains grades and returns its content in an integer array
	public int[] readFile(String filepath) throws FileNotFoundException {
		//ArrayList<Integer> grades = new ArrayList<Integer>();
		int[] grades = null;
		ArrayList<Integer> gradeslist = new ArrayList<Integer>();
		try {
			//Scan the file in the filepath path
			Scanner scanner = new Scanner(new File(filepath));
			//read each grade and append it to gradeslist
			while(scanner.hasNext()) {
				gradeslist.add( scanner.nextInt());
			}
			scanner.close();
		} catch(IllegalArgumentException e) {

			System.out.println("Error while reading the file");

		    }
		//construct an array named grades with the size of the arrayList
		grades = new int[gradeslist.size()];
		//append every gradesList element(grades) to grades array
		for(int i = 0; i < gradeslist.size(); i++ ) {

			grades[i] = gradeslist.get(i);
		}
		return grades;
		}
	}

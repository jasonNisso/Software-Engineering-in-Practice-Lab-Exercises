package unit_testing;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * A class that provides file processing.
 * @author Iason Nissopoulos
 *
 */
public class MyFileUtilities {
	/**
	 * Reads a file that contains grades and parses them
	 * to an array
	 * @param the path of the file that contains the grades
	 * @return the array with the grades
	 * @exception IllegalArgumentException when an error 
	 * happens while reading the file
	 */
	public int[] readFile(String filepath) throws FileNotFoundException {
		int[] grades = null;
		ArrayList<Integer> gradeslist = new ArrayList<Integer>();
		try {
			//Scans the file in the filePath path
			Scanner scanner = new Scanner(new File(filepath));
			//Reads each grade and appends it to gradesList
			while(scanner.hasNext()) {
				gradeslist.add( scanner.nextInt());
			}
			scanner.close();
		} catch(IllegalArgumentException e) {

			System.out.println("Error while reading the file");

		    }
		//Constructs an array named grades with the size of the arrayList
		grades = new int[gradeslist.size()];
		//Appends every gradesList element(grades) to the grades array
		for(int i = 0; i < gradeslist.size(); i++ ) {

			grades[i] = gradeslist.get(i);
		}
		return grades;
		}
	}

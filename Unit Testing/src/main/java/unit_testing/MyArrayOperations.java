package unit_testing;

import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * A class that provides array operations
 * @author Iason Nissopoulos
 *
 */
public class MyArrayOperations {
	/**
	 * Processes an array filled with grades
	 * and counts every grade's frequency
	 * @param filepath the grades path file
	 * @param utils an instance of MyFileUtilities
	 * @return an array that contains every grade's frequency
	 * @exception FileNotFoundException when the file is not found
	 * @author Iason Nissopoulos
	 *
	 */
	public int[] gradeFrequencies(String filepath,MyFileUtilities utils)  {
		int[] frequencies = null;
		int [] grades = null;
		try {
			//Uses the MyFileUtilities instance to get the grades
			int[] utpath = utils.readFile(filepath);
			grades = Arrays.copyOf(utpath, utpath.length);

			//initializes an array that will represent each grade's frequency
			frequencies = new int[11];
			for(int j = 0; j < frequencies.length; j++) {
				frequencies[j] = 0;
			}
			
			//for every grade adds +1 to its frequency
			for (int i = 0 ; i < grades.length ; i++) {
				if (grades[i] == 0) {
					frequencies[0] ++;

				}
				if (grades[i] == 1) {
					frequencies[1]++;
				}
				if (grades[i] == 2) {
					frequencies[2] ++;
				}
				if (grades[i] == 3) {
					frequencies[3] ++;
				}
				if (grades[i] == 4) {
					frequencies[4] ++;
				}
				if (grades[i] == 5) {
					frequencies[5] ++;
				}
				if (grades[i] == 6) {
					frequencies[6] ++;
				}
				if (grades[i] == 7) {
					frequencies[7] ++;
				}
				if (grades[i] == 8) {
					frequencies[8] ++;
				}
				if (grades[i] == 9) {
					frequencies[9] ++;
				}
				if (grades[i] == 10) {
					frequencies[10] ++;
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println("Exception occurred");
		}
		
	return frequencies;
	}

}

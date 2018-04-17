package unit_testing;

import java.io.FileNotFoundException;
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
		int[] frequencies = new int[11];
		int[] grades = utils.readFile(filepath);
		
		for(int grade : grades)
			frequencies[grade]++;
		
		return frequencies;
	}

}

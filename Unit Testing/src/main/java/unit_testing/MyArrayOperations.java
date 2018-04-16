package unit_testing;

public class MyArrayOperations {
	public int[] gradeFrequencies(String filepath,MyFileUtilities utils) {
		int[] frequencies = null;
		int [] grades = null;
		try {
			grades = utils.readFile(filepath);
			frequencies = new int[11];

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
		}catch(Exception e) {
			System.out.println("Exception occurred");
		}
		
	return frequencies;
	}

}

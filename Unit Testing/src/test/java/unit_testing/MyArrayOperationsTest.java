package unit_testing;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyArrayOperationsTest {
	
	@Test
	public void test_reverseArray_Mocking() {
		MyArrayOperations mao = new MyArrayOperations();
		// Mock the MyMath dependency
		String filepath = ("resources//grades.txt");
		MyFileUtilities mfu = mock(MyFileUtilities.class);
		// Pre-define the results of the reverseNumber calls
		//when(mfu.readFile(filepath)).thenReturn(new int[]{0,2,9,4,1,6,7,7,10,3,8,1,1});
		//when(mao.gradeFre(filepath)).thenReturn(new int[]{0,2,9,4,1,6,7,7,10,3,8,1,1});

		
		//int[] testValues = {1,2,-3,-4};
		// Call the reverseArray with the mocked MyMath instance
		int [] expected = new int[]{1,3,1,1,1,0,1,2,1,1,1};
		assertArrayEquals(expected, mao.gradeFrequencies(filepath, mfu));
	}

}

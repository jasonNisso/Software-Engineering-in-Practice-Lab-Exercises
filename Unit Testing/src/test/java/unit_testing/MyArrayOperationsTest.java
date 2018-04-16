package unit_testing;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;

import java.io.FileNotFoundException;


import org.junit.Rule;

import org.junit.rules.ExpectedException;

public class MyArrayOperationsTest {
	MyArrayOperations mao = new MyArrayOperations();
	
	//The file's path 
	String filepath = ("src/test/resources/grades.txt");
	
	// Mock the MyFileUtilities dependency
	MyFileUtilities mfu = mock(MyFileUtilities.class);
	
	//Create a Rule to catch the exceptions
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	//Test if an exception will be thrown if the method doesnt Find a File
	@Test
	public void test_gradeFrequencies_RuleException()  {
		thrown.expect(FileNotFoundException.class);
		mao.gradeFrequencies("src/test/resources/grades.txt", mfu);
	}
	//Test if the MyArrayOperations.gradeFrequencies() will give the correct output
	@Test
	public void test_gradeFrequencies_Mocking() {
		// Pre-define the results of the mfu calls
		//when(mfu.readFile(filepath)).thenReturn(new int[]{0,2,9,4,1,6,7,7,10,3,8,1,1});
		//when(mao.gradeFre(filepath)).thenReturn(new int[]{0,2,9,4,1,6,7,7,10,3,8,1,1});

		//expected MyArrayOperations.gradeFrequencies() result
		//int [] expected = new int[]{1,3,1,1,1,0,1,2,1,1,1};
		int [] expected = new int[]{1,1,1,1,1,1,1,1,1,1,1};
		
		
		assertArrayEquals(expected, mao.gradeFrequencies(filepath, mfu));
	}
	

}

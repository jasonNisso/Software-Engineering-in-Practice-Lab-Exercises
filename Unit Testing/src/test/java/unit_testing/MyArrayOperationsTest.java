package unit_testing;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;

import java.io.FileNotFoundException;


import org.junit.Rule;

import org.junit.rules.ExpectedException;
/**
 * A class that provides test cases for the 
 * array operations of the MyArrayOperations class.
 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class MyArrayOperationsTest {
	/* 
	 * A constructor  of the MyArrayOperations class
	 * whose methods we are testing in this class
	 */
	MyArrayOperations mao = new MyArrayOperations();
	
	//The file's path 
	String filepath = ("src/test/resources/grades.txt");
	
	// Mock the MyFileUtilities dependency
	MyFileUtilities mfu = mock(MyFileUtilities.class);
	
	/*
	 * A test case for the exceptions caused 
	 * when there is no file found.
	 * Testing the exception is performed with a @Rule.
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
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

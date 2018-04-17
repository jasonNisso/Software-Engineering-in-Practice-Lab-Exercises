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
	 * A test case that examines the gradeFrequencies method
	 * with normal input values and mocking. 
	 */
	@Test
	public void test_gradeFrequencies_Mocking() throws FileNotFoundException {
		// Pre-defines the results of the mfu calls
		when(mfu.readFile(filepath)).thenReturn(new int[]{3,5,7,9,1,0,2,4,6,8,10,9,3,4,5,6,1,1,1,3});

		int [] expected = new int[]{1,4,1,3,2,2,2,1,1,2,1};
		
		
		assertArrayEquals(expected, mao.gradeFrequencies(filepath, mfu));
	}
	

}

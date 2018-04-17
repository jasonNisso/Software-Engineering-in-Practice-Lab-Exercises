package unit_testing;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/**
 * A class that provides test cases for the file processing 
 * of the MyFileUtilities class.
 * @author Iason Nissopoulos
 *
 */


public class MyFileUtilitiesTest {
	/* 
	 * A constructor  of the MyFileUtilities class
	 * whose methods we are testing in this class
	 */
	MyFileUtilities mfu = new MyFileUtilities();
	
	/*
	 * A test case for the exceptions caused when
	 * an error happens while reading a file.
	 * Testing the exception is performed
	 * with a @Rule.
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	//Test if an exception will be thrown if the method reads from a file that contains other types than integers
	@Test
	public void test_readFileInputMismatchException_RuleException() {
		thrown.expect(InputMismatchException.class);
		mfu.readFile("src/test/resources/not_ints.txt");
	}
	@Test
	public void test_readFileIllegalArgumentException_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("src/test/resources/wrong_name.txt");
	}
	//Test if the array will be empty if we give the method an empty file
	@Test
	public void testEmptyFile() throws FileNotFoundException{
		int[] methodOutput = mfu.readFile("src/test/resources/empty.txt");
		int expected = 0;
		assertEquals(expected, methodOutput.length);
		
	}
	/*
	 * A test case that examines the readFile method
	 * with a normal text file.
	 */
	@Test
	public void testReadFile() throws FileNotFoundException {
		int[] methodOutput = mfu.readFile("src/test/resources/grades.txt");
		int[] expectedArray = {3,5,7,9,1,0,2,4,6,8};
		assertArrayEquals("checks if it produces the files output", expectedArray, methodOutput); 
		
	}
}

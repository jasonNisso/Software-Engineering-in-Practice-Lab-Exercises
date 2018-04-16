package unit_testing;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class MyFileUtilitiesTest {

	MyFileUtilities mfu = new MyFileUtilities();
	//Create a Rule to catch the exceptions
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	//Test
	@Test
	public void test_readFile_RuleException() throws FileNotFoundException {
		thrown.expect(InputMismatchException.class);
		mfu.readFile("src/test/resources/not_ints.txt");
	}
	@Test
	public void testEmptyFile() throws FileNotFoundException{
		int[] methodOutput = mfu.readFile("src/test/resources/empty.txt");
		int expected = 0;
		assertEquals(expected, methodOutput.length);
		
	}
	@Test
	public void testReadFile() throws FileNotFoundException {
		//Call mfu to produce an output
		int[] methodOutput = mfu.readFile("src/test/resources/grades.txt");
		//the expected results
		int[] expectedArray = {3,5,7,9,1,0,2,4,6,8};
		//check if the output is the same as the expected results
		assertArrayEquals("checks if it produces the files output", expectedArray, methodOutput); 
		
	}
}

package unit_testing;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
/**
 * A class that provides test cases for the
 * math operations by MyMath
 * @author Iason Nissopoulos
 *
 */
public class MyMathTest {	
	/* 
	 * A constructor  of the MyMath class
	 * whose methods we are testing in this class
	 */
	MyMath mm = new MyMath();
	int[] array;
	//Initializes an array which contains the number, denominator and result
	@Before

	public void initializeArray() {
		array = new int[] {85, 5, -5};
	}
	/*
	 * A unit test that checks a valid positive  numerator and denominator input
	 */
	@Test

	public void test_divide_positive() {
		Assert.assertEquals(17.0, mm.divide(array[0], array[1]), 0.0001);
	}
	
	/*
	 * A unit test that checks a valid positive numerator and a valid negative denominator input
	 */
	@Test
	public void test_divide_negative() {
		Assert.assertEquals(-17.0, mm.divide(array[0], array[2]), 0.0001);
	}
	/*
	 * A unit test that checks a valid numerator and a valid higher-than-numerator denominator input
	 */
	@Test
	public void test_divide_numLowerThanDenom() {
		Assert.assertEquals(0.0, mm.divide(array[1], array[0]), 0.0001);
	}
	/*
	 * A unit test that checks if IllegalArgumentException is thrown when the denominator value is zero
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_Divide_zero_exception() {
		mm.divide(15,0);
	}
	

}

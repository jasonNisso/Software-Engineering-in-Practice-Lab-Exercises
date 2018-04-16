package unit_testing;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class MyMathTest {	
	MyMath mm = new MyMath();
	int[] array;
	//we initialize an array which contains the number, denominator and result
	@Before

	public void initializeArray() {
		array = new int[] {85, 5, -5};
	}
	//check if positive number and denominator will give the right results while number > denominator
	@Test

	public void test_divide_positive() {
		Assert.assertEquals(17.0, mm.divide(array[0], array[1]), 0.0001);
	}
	
	//check if one is positive and the other negative-number and denominator- will give the correct result
	@Test
	public void test_divide_negative() {
		Assert.assertEquals(-17.0, mm.divide(array[0], array[2]), 0.0001);
	}
	
	//check the result if number is lower than the denominator
	@Test
	public void test_divide_numLowerThanDenom() {
		Assert.assertEquals(0.0, mm.divide(array[1], array[0]), 0.0001);
	}
	
	//check if IllegalArgumentException is thrown when the denominator value is zero
	@Test(expected = IllegalArgumentException.class)
	public void test_Divide_zero_exception() {
		mm.divide(15,0);
	}
	

}

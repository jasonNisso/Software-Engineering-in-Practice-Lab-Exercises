package unit_testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {
	//set Parameter names
	@Parameter(value = 0)
	public int number;
	@Parameter(value = 1)
	public int result;
	

	MyMath mm =  new MyMath();
	//set pair of values for each test
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0,0}, {1,-1},{-2,2},{Integer.MAX_VALUE,-Integer.MAX_VALUE}};

		return Arrays.asList(data);
	}
	
	/*
	 * A unit test that is executed for each pair of
	 * parameters.
	 */
	@Test
	public void testReverseNumberWithPairedNumbers() {
		Assert.assertEquals(result ,mm.reverseNumber(number), 0.0001 );
	}

}

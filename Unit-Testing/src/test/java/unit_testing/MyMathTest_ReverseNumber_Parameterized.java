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
	@Parameter(value = 0)
	public int numberZero;
	@Parameter(value = 0)
	public int zeroResult;
	
	/*@Parameter(value = 1)
	public int numberOne;
	@Parameter(value = -1)
	public int oneResult;
	
	@Parameter(value = -2)
	public int numberMinusTwo;
	@Parameter(value = 2)
	public int minusTwoResult;
	
	@Parameter(value = Integer.MAX_VALUE)
	public int maxNumber;
	@Parameter(value = -Integer.MAX_VALUE)
	public int maxResult;
*/

	MyMath mm =  new MyMath();
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{1,-1},{-2,2},{Integer.MAX_VALUE,-Integer.MAX_VALUE}};

		return Arrays.asList(data);
	}

	
	@Test
	public void testReverseNumberWithNumberZero() {
		Assert.assertEquals(zeroResult ,mm.reverseNumber(numberZero), 0.0001 );
	}
	/*@Test
	public void testReverseNumberWithNumberOne() {
		Assert.assertEquals(mm.reverseNumber(numberOne), oneResult, 0.0001 );
	}
	@Test
	public void testReverseNumberWithNumberMinusTwo() {
		Assert.assertEquals(mm.reverseNumber(numberMinusTwo), minusTwoResult, 0.0001 );
	}
	@Test
	public void testReverseNumberWithMaxNumber() {
		Assert.assertEquals(mm.reverseNumber(maxNumber), maxResult, 0.0001 );
	}

	*/

}

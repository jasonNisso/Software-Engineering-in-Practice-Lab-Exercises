package unit_testing;
/**
 * A class that provides some math operations
 * @author Iason Nissopoulos
 *
 */
public class MyMath {
	/**
	 * Divides two Integers
	 * @param x numerator Integer
	 * @param y denominator Integer 
	 * @return the results of the division of the input Integers
	 * @exception IllegalArgumentException when denominator is zero
	 * @exception IllegalArgumentException when the input Integers
	 * can cause an Integer overflow
	 */
	double divide(int num, int denom) {
		double result = 0.0;
		//denominator can't be zero in division so it should be caught
		if(denom == 0) {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
		result = num/denom;

		return result;
	}
	/**
	 * Reverses the sign of a given number
	 * @param number the input number 
	 * @return a number with reversed sign
	 */
	public int reverseNumber(int number) {
		return -number;
	}
}

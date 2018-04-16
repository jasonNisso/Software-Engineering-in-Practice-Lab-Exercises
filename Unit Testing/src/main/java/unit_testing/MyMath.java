package unit_testing;

public class MyMath {
	//method that divides two numbers
	double divide(int num, int denom) {
		double result = 0.0;
		//denominator can't be zero in division so we should catch it
		if(denom == 0) {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
		result = num/denom;

		return result;
	}
	//reverses a given number
	public int reverseNumber(int number) {
		return -number;
	}
}

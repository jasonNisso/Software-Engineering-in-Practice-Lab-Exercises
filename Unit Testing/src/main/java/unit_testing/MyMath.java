package unit_testing;

public class MyMath {
	//method that divides two numbers

	double divide(int num, int denom) {
		double result = 0.0;
		try{
			result = num/denom;

		} catch(IllegalArgumentException e){
			e.printStackTrace();
			System.out.println("'denominator' cannot be zero");
		}
		return result;
	}
}

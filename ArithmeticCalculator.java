package practiceProjects;
/**
 * 
 * @author Ali Almousa
 *
 * This class implements the working of an arithmetic calculator 
 */
public final class ArithmeticCalculator {
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return double value of the addition of x and y
	 */
	public static double addition(double x, double y) {
		return (double) x + y;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return double value of the subtraction of x and y
	 */
	public static double subtraction(double x, double y) {
		return (double) x - y;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return double value of the multiplication of x and y
	 */
	public static double multiplication(double x, double y) {
		return (double) x * y;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return double value of the division of x and y
	 */
	public static double division(double x, double y) throws ArithmeticException {
		if (y == 0)
			throw new ArithmeticException();
		return (double) x / y;
	}
}

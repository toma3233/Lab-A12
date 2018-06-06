/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
public class GCFAndLCM {
	/**
	 * Method to find the greatest common divisor
	 * of the given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */
	public static int GCF(int a, int b) 
	{
		 while (a != b) {
	            if (a > b){
	            	a = a - b;
	            }
	            if (a < b){
	            	b = b - a;
	            }
	            
	        }
	       	return a;
		

	}
	/**
	 * Method to find the least common multiple of the 
	 * given numbers
	 * @param c - first number
	 * @param d - second number
	 * @return - the least common multiple
	 */
	public static int LCM(int c, int d)
	{
		return (c * d) / GCF(c, d);
		

	}

}

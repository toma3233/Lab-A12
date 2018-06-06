/**
 * Class to determine if bricks are sufficient for a chocolate bar
 */
public class ChocolateDriver {
/**
 * Main method to run the program
 * @param args - arguments that the user passes in 
 */
	public static void main(String[] args) {
		Chocolate c = new Chocolate();
		int s = 4;
		int b = 1;
		int g = 9;
		System.out.println(c.canMakeBricks(s, b, g));
		System.out.println(c.numberOfSmallBricksNeeded(s, b, g));
	}

}

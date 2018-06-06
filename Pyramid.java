/**
 * @author Tom Abraham
 * Period #1
 * 
 */
public class Pyramid {
	/**
	 * Method to make a pyramid
	 * @param n - height of the pyramid
	 */
	public static void pyramid(int n)
	{
	 for(int i = 1; i <= n; i++) {
         for(int j = 0; j < n - i; j++) {
             System.out.print(" ");
         }
         int k = 1;
         while (k <= i){
            if (k == 1){
            System.out.print("*");
            }
            else{
               System.out.print("*");
               System.out.print("*");
            }
            k++;
         }
        System.out.println();  
    }


	}
}

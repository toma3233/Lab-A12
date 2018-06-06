/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
public class FunLoops {
	/**
	 * Method to find the first n magic squares
	 * @param n - number of magic squares to find
	 */
	public static void magicSquares(int n)
	{
	   int var1 = 0;
	   int var2;
	   int var3 = 0;
	   int var4 = 0;
	   int count = 0;
	   while (count < n){
		    var1 = var1 + 1;
		    var2 = var1 * var1;
		    while ((var3 < var2) && (var3 != var2)){
		          var4++;
		          var3 += var4;
		       }
		       if (var3 == var2){
		           count++;
		           System.out.print(var2 + " ");
		       }
		    }
	 }
	
}

/**
 * 
 * @author Tom Abraham
 * Period  #1
 *
 */

public class Chocolate {
	/**
	 * Checks if we can make chocolate bars
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false otherwise
	 */
	public boolean canMakeBricks(int small, int big, int goal)
	{
	   int x = big * 5;
	   if ((x > goal)){
	      while ((big * 5) > goal){
	         big = big - 1;
	      }
	      if (small - (goal - (big * 5)) >= 0){
	      return true;
	      }
	      else{
	         return false;
	      }
	   }
	   else if (((x + small) >= goal)) {
	   return true;
	   }
	   else{
	      return false;
	   }
			
	}
	/**
	 * Determines number of small bricks needed to make the chocolate bar
	 * @param big - number of big bricks
	 * @param small - number of small bricks
	 * @param goal - length of chocolate bar
	 * @return number of small bricks needed
	 */
	
	public int numberOfSmallBricksNeeded(int small, int big, int goal)
	{
		int x2 = big * 5;
		int y = x2 + small;
		
	    if ((x2 < goal) && (y >= goal)){
	      return goal - x2;
	    }
	   
	    else if (x2 == goal){
	      return 0;
	    }
	    if ((x2 > goal)){
	      while ((big * 5) > goal){
	         big = big - 1;
	      }
	      if (small - (goal - (big * 5)) >= 0){
	      return goal - (big * 5);
	      }
	      else{
	         return -1;
	      }
	    }
	    else if ((y < goal) ){
	      return -1;
	    }
	    else{
	      return -1;
	    }
	}
}

   /**
    * Class to create a multiplication table
    */
    
public class MultiplicationTable {
    /**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param ncols - number of columns
     */
	public void printTable(int nrows, int ncols){
	   for (int count = 1;count <= ncols;count++){
				if (count == 1){
				   System.out.printf("%9d", count );
				}
				else{
				   System.out.printf("%7d", count );
				}
		}
		System.out.println();
		for (int count = 1;count <= nrows;count++){
			System.out.printf("\n%2d", count);
			int n = count;
			for (int loop = 1;loop <= ncols;loop++){
				if (loop == 1){
				   System.out.printf("%7d", n );
				}
				else{
				   System.out.printf("%7d", n );
				}
		      n =  n + count;
			}
	  }
	  System.out.println();
	}
	
}

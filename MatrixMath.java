
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        int[][] data = data;
       
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] rowSum = new int[3];
        for(int r = 0; r < array.length; r++){
            int sum = 0;
            for(int c = 0; c<array[r].length; c++){
                sum += array[r][c];
            }
            rowSum[r] = sum;
        }
        return(rowSum);
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        return null;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        return null;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        return null;
    }
    
}

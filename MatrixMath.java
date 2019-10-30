
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
        this.data = data;
       
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
        for(int r = 0; r < data.length; r++){
            int sum = 0;
            for(int c = 0; c<data[r].length; c++){
                sum += data[r][c];
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
        double[] rowAve = new double[data.length];
        int[] rowSums = rowSum();
        for(int i = 0; i<rowAve.length; i++){
            rowAve[i] = (rowSums[i]*1.0)/data[i].length;
        }
        return rowAve;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] colSum = new int[3];
        for(int c = 0; c<data.length; c++){
            int sum = 0;
            for(int r = 0; r<data[c].length; r++){
                sum += data[r][c];
            }
            colSum[c] = sum;
        }
        return(colSum);
    }
    
    /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double[] colAve = new double[data.length];
        int[] colSums = colSum();
        for(int i = 0; i<colAve.length; i++){
            colAve[i] = (colSums[i]*1.0)/data[i].length;
        }
        return colAve;
    }
    
}

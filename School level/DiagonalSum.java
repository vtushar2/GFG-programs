class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        int n=matrix.length;
        int diagonalSum=0;
        for(int i=0;i<n;i++)
        {
            diagonalSum+=matrix[i][i];
        }
        for(int i=0;i<n;i++)
        {
            diagonalSum+=matrix[i][n-i-1];
        }
        return diagonalSum;
    }
}
